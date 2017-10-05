package com.chopik_andrew.balinasofttest.managers;

import com.chopik_andrew.balinasofttest.api.ApiConnection;
import com.chopik_andrew.balinasofttest.api.SignRequest;
import com.chopik_andrew.balinasofttest.api.SignResponse;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Andrew on 03.10.2017.
 */

public class ApiManager {

    public static final String BASE_URL = "http://213.184.248.43:9099/";

    private static ApiManager mInstance;
    private ApiConnection mConnection;

    public static synchronized ApiManager getInstance(){
        if (mInstance == null) {
            mInstance = new ApiManager();
        }

        return mInstance;
    }

    public void init(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        mConnection = retrofit.create(ApiConnection.class);
    }

    public void signUp(SignRequest request, Observer<SignResponse> observer){
        mConnection.registerUser(request)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void signIn(SignRequest request, Observer<SignResponse> observer){
        mConnection.registerUser(request)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

}
