package com.chopik_andrew.balinasofttest.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Andrew on 03.10.2017.
 */

public class SignRequest {

    @SerializedName("login")
    private String login;

    @SerializedName("password")
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
