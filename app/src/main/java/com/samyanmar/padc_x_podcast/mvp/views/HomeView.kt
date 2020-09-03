package com.samyanmar.padc_x_podcast.mvp.views

import com.samyanmar.padc_x_podcast.data.vos.PodcastVO
import com.samyanmar.shared.mvp.views.BaseView

interface HomeView : BaseView {
    fun displayRandomPodcast(podcast: PodcastVO)
    fun displayPodcastList(podcasts: List<PodcastVO>)
    fun navigateToPodcastDetails()
}