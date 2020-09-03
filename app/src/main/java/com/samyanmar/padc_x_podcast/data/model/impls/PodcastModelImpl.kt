package com.samyanmar.padc_x_podcast.data.model.impls

import com.samyanmar.padc_x_podcast.data.model.PodcastModel
import com.samyanmar.padc_x_podcast.data.vos.PodcastVO
import com.samyanmar.padc_x_podcast.dummy.getDummyPodcasts

object PodcastModelImpl : PodcastModel {

    override fun getAllPocasts(): List<PodcastVO> {
        return getDummyPodcasts()
    }
}