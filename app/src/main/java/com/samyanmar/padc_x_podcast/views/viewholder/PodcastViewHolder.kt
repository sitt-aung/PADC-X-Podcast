package com.samyanmar.padc_x_podcast.views.viewholder

import android.view.View
import com.bumptech.glide.Glide
import com.samyanmar.padc_x_podcast.data.vos.PodcastVO
import com.samyanmar.padc_x_podcast.delegates.PodcastViewHolderActionDelegate
import com.samyanmar.shared.views.viewholder.BaseViewHolder
import kotlinx.android.synthetic.main.item_podcast.view.*

class PodcastViewHolder(itemView: View, private val mDelegate: PodcastViewHolderActionDelegate)
    : BaseViewHolder<PodcastVO>(itemView) {

    init {
        itemView.podcastLayout.setOnClickListener {
            mData?.let {
                mDelegate.onTapPodcast()
            }
        }
    }

    override fun bindData(data: PodcastVO) {
        mData = data

        itemView.tvTitle.text = data.title

        Glide.with(itemView.ivPodcast)
            .load(data.imageUrl)
            .into(itemView.ivPodcast)
    }
}