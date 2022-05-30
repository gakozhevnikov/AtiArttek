package com.kga.atiarttek.service;

import com.kga.atiarttek.configuration.AtiWebClient;
import com.kga.atiarttek.model.Firm;
import com.kga.atiarttek.util.MonoFirmAdapter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.kga.atiarttek.configuration.Constants.GET_FIRM_SUMMARY_BY_ID_V1_0;

@Service
@AllArgsConstructor
public class ApiAtiService {

    private final AtiWebClient atiWebClient;

    public Firm getFirmSummaryById(final String id){
        return atiWebClient
                .getWebClient()
                .get()
                .uri(GET_FIRM_SUMMARY_BY_ID_V1_0+id)
                .retrieve()
                .bodyToMono(Firm.class)
                .block();

    }

}
