package com.samyanmar.shared.mvp.presenters

import com.samyanmar.shared.mvp.views.BaseView

abstract class AbstractBasePresenter<T: BaseView> : BasePresenter<T> {

    protected lateinit var mView: T

    override fun initPresenter(view: T) {
        mView = view
    }
}