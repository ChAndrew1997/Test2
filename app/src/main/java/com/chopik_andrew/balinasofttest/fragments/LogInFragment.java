package com.chopik_andrew.balinasofttest.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chopik_andrew.balinasofttest.R;
import com.chopik_andrew.balinasofttest.activity.MainActivity;
import com.chopik_andrew.balinasofttest.api.SignRequest;
import com.chopik_andrew.balinasofttest.api.SignResponse;
import com.chopik_andrew.balinasofttest.managers.ApiManager;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogInFragment extends Fragment {

    private EditText mLogin;
    private EditText mPassword;

    public static LogInFragment newInstance(){
        LogInFragment logInFragment = new LogInFragment();
        return logInFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);

        mLogin = (EditText) view.findViewById(R.id.log_in_login);
        mPassword = (EditText) view.findViewById(R.id.log_in_password);

        Button button = (Button) view.findViewById(R.id.button_log_in);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignRequest request = new SignRequest();
                request.setLogin(mLogin.getText().toString());
                request.setPassword(mPassword.getText().toString());

                ApiManager.getInstance().signIn(request, mObserver);
//                MainActivity.start(getContext());
            }
        });

        return view;
    }

    private Observer<SignResponse> mObserver = new Observer<SignResponse>() {
        @Override
        public void onSubscribe(@NonNull Disposable d) {

        }

        @Override
        public void onNext(@NonNull SignResponse signResponse) {
        }

        @Override
        public void onError(@NonNull Throwable e) {
        }

        @Override
        public void onComplete() {

        }
    };


}
