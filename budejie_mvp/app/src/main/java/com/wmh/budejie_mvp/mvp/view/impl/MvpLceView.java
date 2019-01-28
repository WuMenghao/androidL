package com.wmh.budejie_mvp.mvp.view.impl;

import com.wmh.budejie_mvp.mvp.model.MvpModel;
import com.wmh.budejie_mvp.mvp.view.MvpView;

/**
 * MvpLceVie interface extends MvpView
 * LCE架构，按拆字法解析：L：Loading加载，C：Content加载内容，E：Error加载失败。
 */
public interface MvpLceView<M extends MvpModel> extends MvpView {
    /**
     * 显示加载中的视图
     * @param pullToRefresh
     */
    void showLoading(boolean pullToRefresh);

    /**
     * 显示contentView
     */
    void showContent();

    /**
     * 显示错误
     * @param e
     * @param pullToRefresh
     */
    void showError(Exception e,boolean pullToRefresh);

    /**
     * 绑定数据
     * @param model
     */
    void showData(M model);
}
