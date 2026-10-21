package com.krishsolutions.vdbp.dto;

public class AuthResponse {

    private String message;
    private String accessToken;
    private  String tokenType;


    public AuthResponse(String message, String accessToken, String tokenType) {
        this.message = message;
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
