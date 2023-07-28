package com.example.rentsease.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.rentsease.R
import com.example.rentsease.onboarding.screens.Screen1Fragment
import com.example.rentsease.onboarding.screens.Screen2Fragment
import com.example.rentsease.onboarding.screens.Screen3Fragment


class ViewPagerFragment : Fragment() {

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        val viewPager=view.findViewById<ViewPager2>(R.id.viewPager)
        val fragmentlist= arrayListOf<Fragment>(
            Screen1Fragment(),
            Screen2Fragment(),
            Screen3Fragment()
        )
        val adapter=ViewPagerAdapter(
            fragmentlist,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        viewPager.adapter=adapter
        return view
    }

}