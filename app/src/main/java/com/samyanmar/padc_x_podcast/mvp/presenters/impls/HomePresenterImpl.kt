package com.samyanmar.padc_x_podcast.mvp.presenters.impls

import com.samyanmar.padc_x_podcast.mvp.presenters.HomePresenter
import com.samyanmar.padc_x_podcast.mvp.views.HomeView
import com.samyanmar.shared.mvp.presenters.AbstractBasePresenter

class HomePresenterImpl : HomePresenter, AbstractBasePresenter<HomeView>() {

    override fun onUIReady() {
        getAllData()
    }

    override fun onTapPodcast() {
        mView?.navigateToPodcastDetails()
    }

    override fun onTapDownloadIcon() {

    }

    private fun getAllData() {

    }
}