package com.ampersanda.fragmentsmkcoding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(
    fm: FragmentManager,
    _fragments: List<Fragment>
) : FragmentPagerAdapter(fm) {
    var fragments = _fragments

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Kembang Api"
            1 -> "Habede"
            else -> "lainnya"
        }
    }

    override fun getCount(): Int {
        return fragments.size
    }



}