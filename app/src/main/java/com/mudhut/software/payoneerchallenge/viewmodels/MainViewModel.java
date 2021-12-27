package com.mudhut.software.payoneerchallenge.viewmodels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mudhut.software.payoneerchallenge.models.ApplicableNetwork;
import com.mudhut.software.payoneerchallenge.models.ListResult;
import com.mudhut.software.payoneerchallenge.network.interceptors.NetworkException;
import com.mudhut.software.payoneerchallenge.repositories.MainRepository;

import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class MainViewModel extends ViewModel {
    private static final String TAG = "MainViewModel";

    private final MainRepository repository = new MainRepository();
    public MutableLiveData<List<ApplicableNetwork>> livedataList = new MutableLiveData<>();
    public MutableLiveData<Boolean> showLoader = new MutableLiveData<>();

    public void getPaymentMethods() {
        repository.getPaymentMethods().subscribe(new Observer<ListResult>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                showLoader.postValue(true);
            }

            @Override
            public void onNext(@NonNull ListResult result) {
                livedataList.postValue(result.getNetworks().getApplicable());
            }

            @Override
            public void onError(@NonNull Throwable e) {
                showLoader.postValue(false);

                if (e instanceof NetworkException) {
                    NetworkException exception = ((NetworkException) e);
                    Log.e(TAG, " code: " + exception.getCode() + " message: " + e.getMessage());
                } else {
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onComplete() {
                showLoader.postValue(false);
            }
        });
    }
}
