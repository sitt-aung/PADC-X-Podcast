package com.samyanmar.padc_x_podcast.mvp.presenters

import com.samyanmar.padc_x_podcast.delegates.PodcastViewHolderActionDelegate
import com.samyanmar.padc_x_podcast.mvp.views.HomeView
import com.samyanmar.shared.mvp.presenters.BasePresenter

interface HomePresenter : BasePresenter<HomeView>, PodcastViewHolderActionDelegate {

    fun onUIReady()
}