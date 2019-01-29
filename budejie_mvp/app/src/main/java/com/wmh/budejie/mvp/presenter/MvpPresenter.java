package com.wmh.budejie.mvp.presenter;

import com.wmh.budejie.mvp.view.MvpView;

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
