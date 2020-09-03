package com.samyanmar.padc_x_podcast.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.samyanmar.padc_x_podcast.R
import com.samyanmar.padc_x_podcast.data.vos.PodcastVO
import com.samyanmar.padc_x_podcast.delegates.PodcastViewHolderActionDelegate
import com.samyanmar.padc_x_podcast.views.viewholder.PodcastViewHolder
import com.samyanmar.shared.adapters.BaseRecyclerAdapter

class PodcastListAdapter(private val mDelegate: PodcastViewHolderActionDelegate)
    : BaseRecyclerAdapter<PodcastViewHolder, PodcastVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PodcastViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_podcast, parent, false)
        return PodcastViewHolder(view, mDelegate)
    }
}