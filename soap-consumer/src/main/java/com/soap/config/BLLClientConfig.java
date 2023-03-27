package com.soap.config;

import org.apache.hc.client5.http.HttpRoute;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.socket.ConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.config.Registry;
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.httpcomponents.client5.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.security.KeyStore;
import java.util.Map;

public class BLLClientConfig {
    @Value("${jksPath}")
    private String jksFilePath;

    public static final String TRUSTME = "trustme";

    @Bean(name = "sslRestTemplate")
    RestTemplate sslRestTemplate(HttpClient secureHttpClient) throws Exception {
        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(
                secureHttpClient);
        return new RestTemplate(requestFactory);
    }

    @Bean(name = "secureHttpClient")
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    HttpClient secureHttpClient(PoolingHttpClientConnectionManager poolingHttpClientConnectionManager) throws Exception {
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(1200000)
                .setConnectionRequestTimeout(100000)
                .setSocketTimeout(100000).build();
        return HttpClients.custom()
                .setDefaultRequestConfig(config)
                .setConnectionManager(poolingHttpClientConnectionManager)
                .addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor()).build();
    }


    @Bean(name = "poolingHttpClientConnectionManager")
    PoolingHttpClientConnectionManager getPoolingHttpClientConnectionManager(ApplicationContext context) throws Exception {

        File file = ResourceUtils.getFile(jksFilePath);
        KeyStore keyStore;

        try (FileInputStream inputStream = new FileInputStream(file)) {
            keyStore = KeyStore.getInstance("JKS");
            keyStore.load(inputStream, TRUSTME.toCharArray());
        } catch (IOException e) {
            throw e;
        }
        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(
                new SSLContextBuilder()
                        .loadTrustMaterial(file, TRUSTME.toCharArray())
                        .loadKeyMaterial(keyStore, TRUSTME.toCharArray())
                        .build(),
                NoopHostnameVerifier.INSTANCE);
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder
                .<ConnectionSocketFactory>create().register("https", socketFactory)
                .build();

        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        connManager.setMaxTotal(100000);
        Map<String, String> hostMap = context.getBean("hostMap", Map.class);
        for (Map.Entry<String, String> entry : hostMap.entrySet()) {
            URI uri = new URI(entry.getKey());
            HttpHost host = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
            final HttpRoute route;

            if (uri.getScheme().equals("https")) {
                route = new HttpRoute(host, null, true);
            } else {
                route = new HttpRoute(host);
            }

            int max = Integer.parseInt(entry.getValue());

            connManager.setMaxPerRoute(route, max);
        }
        return connManager;
    }


    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    WebServiceMessageSender webServiceMessageSender(HttpClient secureHttpClient) throws Exception {
        return new HttpComponentsMessageSender(secureHttpClient);
    }
}
