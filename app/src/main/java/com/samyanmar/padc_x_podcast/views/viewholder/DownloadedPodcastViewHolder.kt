package com.samyanmar.padc_x_podcast.views.viewholder

import android.view.View
import com.bumptech.glide.Glide
import com.samyanmar.padc_x_podcast.data.vos.PodcastVO
import com.samyanmar.shared.views.viewholder.BaseViewHolder
import kotlinx.android.synthetic.main.item_podcast_download.view.*

class DownloadedPodcastViewHolder(itemView: View) : BaseViewHolder<PodcastVO>(itemView) {

    override fun bindData(data: PodcastVO) {
        mData = data

        itemView.tvTitle.text = data.title
        itemView.tvDescription.text = data.description

        Glide.with(itemView.ivPodcast)
            .load(data.imageUrl)
            .into(itemView.ivPodcast)
    }
}