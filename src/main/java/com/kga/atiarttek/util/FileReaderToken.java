package com.kga.atiarttek.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class FileReaderToken {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Value("${file.token}")
    private static final String stringValueOfPath = "C:\\YandexDisk\\IdeaProjects\\Arttek\\token.txt";
    //private static final String stringValueOfPath = "C:\\YandexDisk\\IdeaProjects\\Arttek\\token.txt";

    private static final Path fileWithToken = Path.of(stringValueOfPath);

    public static String getTokenFromFile (){
        String token ="";
        try {
            token= Files.readString(fileWithToken);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return token;
    }

    public String getStringValueOfPath(){
        return stringValueOfPath;
    }

    public Path getFileWithToken(){
        return fileWithToken;
    }

}
