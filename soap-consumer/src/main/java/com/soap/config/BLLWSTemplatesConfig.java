package com.soap.config;

import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.webservices.client.WebServiceTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class BLLWSTemplatesConfig {

    @Value("${bll.url.path.jq1}")
    private String jq1;

    @Value("${bll.url.path.jp}")
    private String jp;

    @Value("${bll.url.path.jc}")
    private String jc;

    @Value("${bll.url.path.jq2}")
    private String jq2;

    @Value("${bll.url.path.jt1}")
    private String jt1;
    @Autowired
    HttpClient secureHttpClient;

    @Bean
    Jaxb2Marshaller bllMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.bll.ws.bllClasses");
        return marshaller;
    }

    @Bean
    WebServiceMessageSender webServiceMessageSender(HttpClient secureHttpClient) {
        return new HttpComponentsMessageSender(secureHttpClient);
    }

    @Bean
    WebServiceTemplate genericBllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jq2)
                .messageSenders(webServiceMessageSender(secureHttpClient))
                .build();
    }

    @Bean
    WebServiceTemplate jt1BllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jt1)
                .messageSenders(webServiceMessageSender(secureHttpClient))
                .build();
    }

    @Bean
    WebServiceTemplate jq1BllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jq1)
                .messageSenders(webServiceMessageSender(secureHttpClient))
                .build();
    }

    @Bean
    WebServiceTemplate jq2BllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jq2)
                .messageSenders(webServiceMessageSender(secureHttpClient))
                .build();
    }

    @Bean
    WebServiceTemplate jcBllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jc)
                .messageSenders(webServiceMessageSender(secureHttpClient))
                .build();
    }
    @Bean
    WebServiceTemplate jpBllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jp)
                .messageSenders(webServiceMessageSender(secureHttpClient))
                .build();
    }
}
