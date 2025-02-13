package com.example.myapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val tabTitles = arrayOf("Monitor", "Settings", "Test", "Update")

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MonitorFragment()
            1 -> SettingsFragment()
            2 -> TestFragment()
            3 -> UpdateFragment()
            else -> MonitorFragment()
        }
    }

    override fun getCount(): Int {
        return tabTitles.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }
}