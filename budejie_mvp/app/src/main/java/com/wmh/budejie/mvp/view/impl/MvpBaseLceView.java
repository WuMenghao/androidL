package com.wmh.budejie.mvp.view.impl;

import com.wmh.budejie.mvp.model.MvpModel;

/**
 * MvpBaseLceView abstract class
 * @param <M>
 */
public abstract class MvpBaseLceView<M extends MvpModel> implements MvpLceView<M> {
    @Override
    public void showLoading(boolean pullToRefresh) {

    }

    @Override
    public void showContent() {

    }

    @Override
    public void showError(Exception e, boolean pullToRefresh) {

    }

    @Override
    public void showData(M model) {

    }
}
