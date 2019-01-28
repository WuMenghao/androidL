package com.wmh.budejie_mvp.mvp.presenter;

import android.view.View;

/**
 * MvpPresenter interface
 * @param <V>
 */
public interface MvpPresenter<V extends View> {
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
