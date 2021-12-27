package com.mudhut.software.payoneerchallenge.network.interceptors;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;


public class ErrorInterceptor implements Interceptor {
    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Response response = chain.proceed((chain.request()));

        if (!response.isSuccessful()) {
            throw new NetworkException(response.code(), response.message());
        }

        return response;
    }
}
