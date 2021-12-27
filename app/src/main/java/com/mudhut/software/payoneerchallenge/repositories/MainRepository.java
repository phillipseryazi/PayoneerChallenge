package com.mudhut.software.payoneerchallenge.repositories;

import com.mudhut.software.payoneerchallenge.models.ListResult;
import com.mudhut.software.payoneerchallenge.network.Endpoints;
import com.mudhut.software.payoneerchallenge.network.RetrofitClient;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainRepository implements IMainRepository {
    private final Endpoints retrofitClient = RetrofitClient.getInstance().getMyApi();

    @Override
    public Observable<ListResult> getPaymentMethods() {
        return retrofitClient.getPaymentMethods().subscribeOn(Schedulers.io());
    }
}
