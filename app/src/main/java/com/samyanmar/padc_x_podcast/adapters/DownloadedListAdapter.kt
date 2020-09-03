package com.samyanmar.padc_x_podcast.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.samyanmar.padc_x_podcast.R
import com.samyanmar.padc_x_podcast.data.vos.PodcastVO
import com.samyanmar.padc_x_podcast.views.viewholder.DownloadedPodcastViewHolder
import com.samyanmar.shared.adapters.BaseRecyclerAdapter

class DownloadedListAdapter : BaseRecyclerAdapter<DownloadedPodcastViewHolder, PodcastVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DownloadedPodcastViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_podcast_download, parent, false)
        return DownloadedPodcastViewHolder(view)
    }
}