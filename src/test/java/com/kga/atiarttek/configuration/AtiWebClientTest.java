package com.kga.atiarttek.configuration;

import com.kga.atiarttek.util.FileReaderToken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;

@SpringBootTest
public class AtiWebClientTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AtiWebClient atiWebClientTest;

    @Test
    public void shouldAtiWebClientNotEmpty(){
        String bodyString = atiWebClientTest.getWebClient().get().retrieve().bodyToMono(String.class).block();
        //log.info("shouldAtiWebClientNotEmpty bodyString:"+bodyString);
        Assertions.assertNotNull(bodyString, "Response return empty");
    }

    @Test
    public void shouldAtiWebClientContainsText(){
        String bodyString = atiWebClientTest.getWebClient().get().retrieve().bodyToMono(String.class).block();
        //log.info("shouldAtiWebClientNotEmpty bodyString:"+bodyString);
        Assertions.assertFalse(bodyString.isEmpty(), "Response not contains text");
    }

    /*@Test
    public void shouldGetStatus200(){
        String responseString = atiWebClientTest
                .get()
                .exchangeToMono(clientResponse -> clientResponse.statusCode().toString())
                .flatMap(String.class);
        log.info("responseString:"+responseString);
        *//*String error = atiWebClientTest
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Error").toString();
        log.info("shouldGetStatus200:"+error);*//*
        //Assertions.assertNotEquals(error, "Error", "");
    }*/

}
