package com.soap.config;

import jakarta.xml.soap.MimeHeader;
import jakarta.xml.soap.SOAPMessage;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpComponentsConnection;

import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

@Component
public class WebServiceClientInterceptor implements ClientInterceptor {
    private static Logger logger = LoggerFactory.getLogger(WebServiceClientInterceptor.class);

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        String payload = null;
        try {
            SaajSoapMessage message = (SaajSoapMessage)messageContext.getRequest();
            SOAPMessage soapMessage = message.getSaajMessage();

            for(Cookie cookie  : WebServiceRequestContext.getAllAttributes()) {
                soapMessage.getMimeHeaders().addHeader("Cookie", cookie.getName() + "=" + cookie.getValue() + "; " + "Version=" + cookie.getVersion() +
                        "; Path=" + cookie.getPath() + ";HttpOnly");
            }

            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            messageContext.getRequest().writeTo(buffer);
            payload = buffer.toString(java.nio.charset.StandardCharsets.UTF_8.name());
            logger.debug("SOAP Request {}", payload);

        }catch (Exception e) {
            logger.error("The exception occurred and request body is {}",payload,e);
        }

        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        SaajSoapMessage message = (SaajSoapMessage) messageContext.getResponse();
        SOAPMessage soapMessage = message.getSaajMessage();
        TransportContext context = TransportContextHolder.getTransportContext();
        HttpComponentsConnection con = (HttpComponentsConnection) context.getConnection();
        HttpPost httpPost = con.getHttpPost();
        Header[] allHeaders = httpPost.getAllHeaders();


        try {
            final URI uri = con.getUri();

            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            messageContext.getResponse().writeTo(buffer);
            String payload = buffer.toString(java.nio.charset.StandardCharsets.UTF_8.name());
            logger.debug("SOAP Response ==>{}",payload);
            Iterator matchingHeaders = soapMessage.getMimeHeaders().getMatchingHeaders(new String[]{"set-cookie"});
            WebServiceRequestContext.cleanup();

            Set<String> cookies = new HashSet<>();
            while (matchingHeaders.hasNext()) {
                MimeHeader next = (MimeHeader) matchingHeaders.next();
                Cookie cookie = getCookie(next.getValue(), (uri!=null)? uri.getHost() : null);
                if(cookies.add(cookie.getName())) {
                    WebServiceRequestContext.setAttribute(cookie);
                }
            }
            if(cookies.isEmpty()) {
                Stream.of(allHeaders)
                        .filter(h -> h.getName().equals("Cookie"))
                        .map(h-> getCookie(h.getValue(), uri.getHost()))
                        .forEach(WebServiceRequestContext::setAttribute);

            }
        } catch (Exception e) {
            logger.error("The exception occurred while getting SOAP response xml",e);
        }


        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
		/*
		 Implementation not required.
		*/
    }

    private Cookie getCookie(String cookie, String domain) {
        String[] split = cookie.split(";");
        String[] name = split[0].split("=");
        BasicClientCookie clientCookie = new BasicClientCookie(name[0], name[1]);
        clientCookie.setDomain(domain);
        if(split.length >1) {
            for(int i=1;i<split.length;i++) {
                String[] att = split[i].split("=");
                clientCookie.setAttribute(att[0].toLowerCase().trim(),(att.length<2)? null:att[1]);
            }
            clientCookie.setPath(clientCookie.getAttribute("path"));
            clientCookie.setVersion(Integer.parseInt(clientCookie.getAttribute("version")));
        }

        return clientCookie;


    }

}