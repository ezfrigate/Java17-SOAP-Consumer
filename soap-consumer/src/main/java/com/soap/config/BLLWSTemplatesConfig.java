package com.soap.config;

import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.webservices.client.WebServiceTemplateBuilder;
import org.springframework.context.annotation.*;
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
    WebServiceMessageSender webServiceMessageSender;

    @Bean
    Jaxb2Marshaller bllMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.schneider.selectconfig.business.tiers.ssc");
        return marshaller;
    }

    @Autowired
    WebServiceClientInterceptor webServiceClientInterceptor;

    @Bean
    WebServiceTemplate genericBllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jq2)
                .messageSenders(webServiceMessageSender)
                .interceptors(webServiceClientInterceptor)
                .build();
    }

    @Bean
    WebServiceTemplate jt1BllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jt1)
                .messageSenders(webServiceMessageSender)
                .interceptors(webServiceClientInterceptor)
                .build();
    }

    @Bean
    WebServiceTemplate jq1BllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jq1)
                .messageSenders(webServiceMessageSender)
                .interceptors(webServiceClientInterceptor)
                .build();
    }

    @Bean
    WebServiceTemplate jq2BllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jq2)
                .messageSenders(webServiceMessageSender)
                .interceptors(webServiceClientInterceptor)
                .build();
    }

    @Bean
    WebServiceTemplate jcBllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jc)
                .messageSenders(webServiceMessageSender)
                .interceptors(webServiceClientInterceptor)
                .build();
    }
    @Bean
    WebServiceTemplate jpBllWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(bllMarshaller())
                .setUnmarshaller(bllMarshaller())
                .setDefaultUri(jp)
                .messageSenders(webServiceMessageSender)
                .interceptors(webServiceClientInterceptor)
                .build();
    }
}
