package com.soap.config;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.util.ResourceUtils;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BLLClientConfig {
    @Value("${jksPath}")
    private String jksFilePath;

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

    public static final String TRUSTME = "trustme";

    @Bean(name = "secureHttpClient")
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    HttpClient secureHttpClient(PoolingHttpClientConnectionManager poolingHttpClientConnectionManager) {
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(120000)
                .setConnectionRequestTimeout(120000)
                .build();
        return HttpClients.custom()
                .setDefaultRequestConfig(config)
                .setConnectionManager(poolingHttpClientConnectionManager)
                //.addExecInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor())
                .build();
    }


    @Bean(name = "poolingHttpClientConnectionManager")
    PoolingHttpClientConnectionManager getPoolingHttpClientConnectionManager(List<String> hostList) throws Exception {

        File file = ResourceUtils.getFile(jksFilePath);
        KeyStore keyStore;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            keyStore = KeyStore.getInstance("JKS");
            keyStore.load(inputStream, TRUSTME.toCharArray());
        } catch (IOException e) {
            //TODO
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
        hostList.forEach(h->{
            URI uri = null;
            try {
                uri = new URI(h);
            } catch (URISyntaxException e) {
                //TODO
                throw new RuntimeException(e);
            }
            HttpHost host = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
            final HttpRoute route = new HttpRoute(host, null, true);
            connManager.setMaxPerRoute(route, 10000);
        });
        return connManager;
    }

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    WebServiceMessageSender webServiceMessageSender(HttpClient secureHttpClient) {
        return new HttpComponentsMessageSender(secureHttpClient);
    }
    @Bean
    List<String> hostList(){
        List<String> hostList = new ArrayList<>();
        hostList.add(jq1);
        hostList.add(jq2);
        hostList.add(jc);
        hostList.add(jp);
        hostList.add(jt1);
        return hostList;
    }
}
