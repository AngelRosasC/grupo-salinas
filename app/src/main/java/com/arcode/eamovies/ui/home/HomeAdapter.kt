package com.arcode.eamovies.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.arcode.eamovies.ui.movies.MovieFragment

class HomeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MovieFragment()
            1 -> MovieFragment(true)
            else -> MovieFragment()
        }
    }
}