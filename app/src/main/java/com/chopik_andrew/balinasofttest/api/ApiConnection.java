package com.chopik_andrew.balinasofttest.api;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Andrew on 03.10.2017.
 */

public interface ApiConnection {
    @POST("/api/account/signup")
    Observable<SignResponse> registerUser(@Body SignRequest request);

    @Headers({"Accept: application/json"})
    @POST("/api/account/signin")
    Observable<SignResponse> logInUser(@Body SignRequest request);
}
