package com.wmh.budejie_mvp.mvp.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.wmh.budejie_mvp.mvp.presenter.MvpPresenter;
import com.wmh.budejie_mvp.mvp.view.MvpView;

public abstract class MvpFragment<P extends MvpPresenter> extends Fragment implements MvpView {

    private P presenter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public abstract P bindPresenter();
}
