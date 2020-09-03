package com.samyanmar.padc_x_podcast.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.samyanmar.padc_x_podcast.R
import com.samyanmar.padc_x_podcast.activities.DetailsActivity
import com.samyanmar.padc_x_podcast.adapters.PodcastListAdapter
import com.samyanmar.padc_x_podcast.data.model.PodcastModel
import com.samyanmar.padc_x_podcast.data.model.impls.PodcastModelImpl
import com.samyanmar.padc_x_podcast.data.vos.PodcastVO
import com.samyanmar.padc_x_podcast.mvp.presenters.HomePresenter
import com.samyanmar.padc_x_podcast.mvp.presenters.impls.HomePresenterImpl
import com.samyanmar.padc_x_podcast.mvp.views.HomeView
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), HomeView {

    private lateinit var mPresenter: HomePresenter
    private lateinit var mAdapter: PodcastListAdapter

    private val mPodcastModel: PodcastModel = PodcastModelImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUpPresenter()
        setUpRecyclerView()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mAdapter.setNewData(mPodcastModel.getAllPocasts())
    }

    private fun setUpPresenter() {
//        mPresenter = ViewModelProviders.of(this).get(HomePresenterImpl::class.java)
//        mPresenter.initPresenter(this)
        mPresenter = HomePresenterImpl()
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerView() {
        mAdapter = PodcastListAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        rvPodcasts.layoutManager = linearLayoutManager
        rvPodcasts.adapter = mAdapter
    }


    override fun displayRandomPodcast(podcast: PodcastVO) {

    }

    override fun displayPodcastList(podcasts: List<PodcastVO>) {

    }

    override fun navigateToPodcastDetails() {
        startActivity(DetailsActivity.newIntent(activity as Context))
    }
}