package com.chopik_andrew.balinasofttest.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Andrew on 03.10.2017.
 */

public class SignResponse {

    @SerializedName("login")
    @Expose
    private String login;

    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("userId")
    @Expose
    private int userId;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
