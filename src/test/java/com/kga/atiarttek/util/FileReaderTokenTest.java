package com.kga.atiarttek.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class FileReaderTokenTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Value("${file.token}")
    private String path;


    private FileReaderToken fileReaderToken = new FileReaderToken();

    @Test
    public void shouldStringValueOfPathNotEmpty(){
        log.info("fileReaderToken.getStringValueOfPath():"+fileReaderToken.getStringValueOfPath());
        Assertions.assertNotNull(fileReaderToken.getStringValueOfPath(), "fileReaderToken.getStringValueOfPath() return empty.");
    }

    @Test
    public void shouldPathContainsText (){
        Assertions.assertFalse(fileReaderToken.getStringValueOfPath().isEmpty(), "String value of path file with token is empty." );
    }

    @Test
    public void shouldStringValueOfPathEqualsStringValuePathInTest(){
        Assertions.assertEquals(fileReaderToken.getStringValueOfPath(), path, "Has different in value of Path. //n " +
                "Path in FileReaderToken:"+ fileReaderToken.getStringValueOfPath()+" /n"+
                " Path in test: "+path);
    }

    @Test
    public void shouldReturnNotNullPath(){
        Assertions.assertNotNull(fileReaderToken.getFileWithToken(), "Path of file with token is null");
    }
    @Test
    public void shouldReturnNotNullToken(){
        Assertions.assertFalse(FileReaderToken.getTokenFromFile().isEmpty(), "Token is empty");
    }

}
