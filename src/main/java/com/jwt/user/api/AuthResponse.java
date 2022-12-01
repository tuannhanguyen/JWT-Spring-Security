package com.jwt.user.api;

public class AuthResponse {

    private String emil;

    private String accessToken;

    public AuthResponse() {
    }

    public AuthResponse(String emil, String accessToken) {
        this.emil = emil;
        this.accessToken = accessToken;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }



}
