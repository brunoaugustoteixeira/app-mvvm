package com.example.mvvm.viewmodel;

import com.example.mvvm.model.HelloModel;

import io.reactivex.Observable;

public class HelloViewModel {

    public Observable<String> helloLabelObservable;
    private final HelloModel model;

    public HelloViewModel() {
        this.model = new HelloModel();
        this.helloLabelObservable = Observable.just(model.pickRandomLabel());
    }
}
