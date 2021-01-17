package com.kms.yogiyoandriod

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Detail_restaurant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurant_datail)

        initViewPager2WithFragments()
    }

    private fun initViewPager2WithFragments() {
        var viewPager : ViewPager2 = findViewById(R.id.pager)
        var adapter = ViewPagerStateAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        var tabLayout : TabLayout = findViewById(R.id.tab_layout)
        var names : ArrayList<String> = arrayListOf("메뉴", "리뷰", "정보")
        TabLayoutMediator(tabLayout, viewPager){
            tab, position ->  tab.text = names[position]
        }.attach()
    }

}