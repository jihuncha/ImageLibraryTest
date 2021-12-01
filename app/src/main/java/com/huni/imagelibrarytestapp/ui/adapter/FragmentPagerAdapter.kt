package com.huni.imagelibrarytestapp.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


import com.huni.imagelibrarytestapp.ui.fragment.CoilFragment
import com.huni.imagelibrarytestapp.ui.fragment.GlideFragment
import com.huni.imagelibrarytestapp.ui.fragment.PicassoFragment

//FragmentAdapter - MainActivity ViewPager2 에 사용됨
class FragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments: List<Fragment> = listOf(GlideFragment(), PicassoFragment(), CoilFragment())

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}