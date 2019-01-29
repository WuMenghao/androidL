package com.wmh.budejie.mvp.presenter.impl;

import com.wmh.budejie.mvp.presenter.MvpPresenter;
import com.wmh.budejie.mvp.view.MvpView;

public abstract class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V view;

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        if(view != null){
            this.view = null;
        }
    }
}
