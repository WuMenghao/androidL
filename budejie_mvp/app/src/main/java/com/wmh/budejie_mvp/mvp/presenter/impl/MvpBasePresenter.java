package com.wmh.budejie_mvp.mvp.presenter.impl;

import android.view.View;

import com.wmh.budejie_mvp.mvp.presenter.MvpPresenter;

public abstract class MvpBasePresenter<V extends View> implements MvpPresenter<V> {

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
