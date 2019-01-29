package com.wmh.budejie_mvp.mvp.presenter;

import android.view.View;

import com.wmh.budejie_mvp.mvp.view.MvpView;

/**
 * MvpPresenter interface
 * @param <V>
 */
public interface MvpPresenter<V extends MvpView> {
    /**
     * 绑定试图
     * @param view
     */
    void attachView(V view);

    /**
     * 解绑视图
     */
    void detachView();
}
