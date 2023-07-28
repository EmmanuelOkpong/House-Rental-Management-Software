package com.example.rentsease.mainsection.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.rentsease.mainsection.ui.houses.UnVerifiedFragment
import com.example.rentsease.mainsection.ui.houses.VerifiedHousesFragment

internal class TabbLayoutAdapter(var context: Context,fm:FragmentManager, var totaltabs:Int):FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
      return when(position){
          0 -> {
              VerifiedHousesFragment()
          }
          1 -> {
              UnVerifiedFragment()
              }

          else ->getItem(position)
      }
    }
    override fun getCount(): Int {
       return totaltabs
    }

}