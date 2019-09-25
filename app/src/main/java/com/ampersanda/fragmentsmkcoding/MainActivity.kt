package com.ampersanda.fragmentsmkcoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private val fragments = listOf(
        FireworksFragment.newInstance(),
        HappyBirthdayFragment.newInstance()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        val tabLayout = findViewById<TabLayout>(R.id.tablayout)

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, fragments)
        tabLayout.setupWithViewPager(viewPager)
    }
}
