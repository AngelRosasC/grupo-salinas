package com.arcode.eamovies.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.arcode.eamovies.R
import com.arcode.eamovies.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewPager = binding.viewPagerMovies
        viewPager.adapter = HomeAdapter(this)
        viewPager.isUserInputEnabled = false
        TabLayoutMediator(binding.tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = getString(R.string.tab_movies_popular)
                1 -> tab.text = getString(R.string.tab_movies_now_playing)
            }
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}