package com.wmh.budejie.mvp.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.wmh.budejie.mvp.presenter.MvpPresenter;
import com.wmh.budejie.mvp.view.MvpView;

public abstract class MvpFragment<P extends MvpPresenter> extends Fragment implements MvpView {

    private P presenter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Fragment创建时绑定Presenter
        presenter = bindPresenter();
        if (presenter==null){
            presenter.attachView(this);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Fragment销毁时解绑Presenter
        if (presenter!=null){
            presenter.detachView();
        }
    }

    public abstract P bindPresenter();
}
