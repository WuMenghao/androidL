package com.wmh.budejie_mvp.mvp.view.impl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wmh.budejie_mvp.mvp.presenter.impl.MvpBasePresenter;
import com.wmh.budejie_mvp.mvp.view.MvpView;

/**
 * 将我们的MVP架构集成到我们的Activity
 * MvpActivity---是MVP框架的核心
 * @param <P>
 */
public abstract class MvpActivity<P extends MvpBasePresenter> extends AppCompatActivity implements MvpView {

    private P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化时绑定presenter
        presenter = bindPresenter();
        //persenter绑定本activity
        if (presenter != null){
            presenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Activity销毁时解绑
        if (presenter != null){
            presenter.detachView();
        }
    }

    public abstract P bindPresenter();
}
