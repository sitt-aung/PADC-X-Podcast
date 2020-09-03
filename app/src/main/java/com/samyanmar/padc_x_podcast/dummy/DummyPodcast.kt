package com.samyanmar.padc_x_podcast.dummy

import com.samyanmar.padc_x_podcast.data.vos.PodcastVO

fun getDummyPodcasts() : List<PodcastVO> {

    val podcasts = arrayListOf<PodcastVO>()

    for (num in 1..10) {
        val podcast = PodcastVO(
            id = num,
            title = "Podcast $num",
            description = "The patties that are the essence of a veggie burger have existed in various Eurasian cuisines for millennia, including in the form of disc-shaped grilled or fried meatballs or as koftas, a commonplace item in Indian cuisine.",
            imageUrl = "https://picsum.photos/id/$num/200/300"
        )

        podcasts.add(podcast)
    }

    return podcasts
}