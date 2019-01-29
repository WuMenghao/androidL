package com.wmh.budejie.modules.base.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wmh.budejie.mvp.presenter.impl.MvpBasePresenter;
import com.wmh.budejie.mvp.view.impl.MvpFragment;

public abstract class BaseFregment<P extends MvpBasePresenter> extends MvpFragment<P> {

    //我们自己的Fragment需要缓存视图
    private View viewContent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (viewContent == null){
            viewContent = inflater.inflate(getContentView(),container,false);
            initContentView(viewContent);
        }

        //判断Fragment对应的Activity是否存在这个视图
        ViewGroup parent = (ViewGroup)viewContent.getParent();

        if (parent != null){
            //如果存在,那么我就干掉,重写添加,这样的方式我们就可以缓存视图
            parent.removeView(viewContent);
        }

        return viewContent;
    }

    public abstract int getContentView();

    public abstract void initContentView(View viewContent);
}
