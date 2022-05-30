package com.kga.atiarttek.configuration;

import com.kga.atiarttek.util.FileReaderToken;

public class Constants {
    public static final String BASE_URL = "https://api.ati.su/";
    public static final String GET_FIRM_SUMMARY_BY_ID_V1_0 = "/v1.0/firms/summary/";
    public static final String CONTENT_TYPE = "application/json";
    public static final String AUTHORIZATION = "Bearer "+ FileReaderToken.getTokenFromFile();


}
