package com.kga.atiarttek.service;

import com.kga.atiarttek.model.Firm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiAtiServiceTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private ApiAtiService apiAtiService;
    private String id ="1";
    private Firm firm;

    @Test
    public void shouldReturnNotEmptyFirms(){
        Assertions.assertNotNull(apiAtiService.getFirmSummaryById(id));
    }

    @Test
    public void shouldIdBeEquals(){
        Assertions.assertEquals(id,apiAtiService.getFirmSummaryById(id).getAtiId());
    }


}
