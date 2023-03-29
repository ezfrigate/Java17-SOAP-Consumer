package com.soap.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.webservices.client.WebServiceTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class PSMWSTemplateConfig {

    @Value("${psm.url.path}")
    private String psm;

    @Bean
    Jaxb2Marshaller psmMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.bll.ws.psmClasses");
        return marshaller;
    }

    @Bean
    WebServiceTemplate psmWebServiceTemplate(){
        return new WebServiceTemplateBuilder()
                .setMarshaller(psmMarshaller())
                .setUnmarshaller(psmMarshaller())
                .setDefaultUri(psm)
                .build();
    }
}
