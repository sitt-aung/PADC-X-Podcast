package com.samyanmar.shared.mvp.presenters

import com.samyanmar.shared.mvp.views.BaseView

interface BasePresenter<T: BaseView> {
    fun initPresenter(view: T)
}