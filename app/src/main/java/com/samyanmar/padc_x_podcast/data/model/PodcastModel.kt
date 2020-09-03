package com.samyanmar.padc_x_podcast.data.model

import com.samyanmar.padc_x_podcast.data.vos.PodcastVO

interface PodcastModel {

    fun getAllPocasts() : List<PodcastVO>
}