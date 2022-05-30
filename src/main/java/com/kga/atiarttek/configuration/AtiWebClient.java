package com.kga.atiarttek.configuration;

import com.kga.atiarttek.util.FileReaderToken;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

import static com.kga.atiarttek.configuration.Constants.*;

@Configuration
public class AtiWebClient {
    //private WebClient webClient;

    @Bean
    public WebClient getWebClient (){
        return WebClient.builder()
                .baseUrl(BASE_URL)
                .defaultHeader("Authorization", AUTHORIZATION)
                .defaultHeader("Content-Type", CONTENT_TYPE)
                .build();
    }
/*
@Bean
    public WebClient getWebClient (){
        return WebClient.builder()
                .baseUrl(BASE_URL)
                .defaultHeaders(httpHeaders -> {
                    httpHeaders.add(HttpHeaders.AUTHORIZATION,"Bearer"+ FileReaderToken.getTokenFromFile());
                    httpHeaders.add(HttpHeaders.CONTENT_TYPE,"application/json");
                }).build();
    }
*/

}
