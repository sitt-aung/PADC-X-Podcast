package com.samyanmar.padc_x_podcast.activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.samyanmar.padc_x_podcast.R
import com.samyanmar.padc_x_podcast.fragments.DownloadFragment
import com.samyanmar.padc_x_podcast.fragments.HomeFragment
import com.samyanmar.padc_x_podcast.fragments.ProfileFragment
import com.samyanmar.padc_x_podcast.fragments.SearchFragment
import com.samyanmar.shared.activities.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            openFragment(HomeFragment())
        }

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.action_home -> {
                openFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_search -> {
                openFragment(SearchFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_download -> {
                openFragment(DownloadFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_profile -> {
                openFragment(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.flContainer, fragment).commit()
    }
}