package com.samyanmar.padc_x_podcast.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.samyanmar.padc_x_podcast.R
import com.samyanmar.shared.activities.BaseActivity

class DetailsActivity : BaseActivity() {

    companion object {

        const val PODCAST_ID_EXTRA = "Podcast ID"

        fun newIntent(context: Context): Intent {
            return Intent(context, DetailsActivity::class.java)
        }

        fun newIntent(context: Context, podcastId: Int): Intent {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra(PODCAST_ID_EXTRA, podcastId)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }
}