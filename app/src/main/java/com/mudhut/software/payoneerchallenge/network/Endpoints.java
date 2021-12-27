package com.mudhut.software.payoneerchallenge.network;

import com.mudhut.software.payoneerchallenge.models.ApplicableNetwork;
import com.mudhut.software.payoneerchallenge.models.ListResult;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface Endpoints {
    String BASE_URL = "https://raw.githubusercontent.com/";

    @GET("optile/checkout-android/develop/shared-test/lists/listresult.json")
    Observable<ListResult> getPaymentMethods();
}
