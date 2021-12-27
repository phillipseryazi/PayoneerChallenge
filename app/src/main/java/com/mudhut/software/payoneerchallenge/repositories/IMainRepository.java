package com.mudhut.software.payoneerchallenge.repositories;

import com.mudhut.software.payoneerchallenge.models.ListResult;

import io.reactivex.rxjava3.core.Observable;

public interface IMainRepository {
    Observable<ListResult> getPaymentMethods();
}
