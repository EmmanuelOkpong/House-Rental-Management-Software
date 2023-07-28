package com.example.rentsease.mainsection.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.rentsease.R
import com.example.rentsease.databinding.FragmentHomeBinding
import com.example.rentsease.mainsection.MainActivity2
import com.example.rentsease.mainsection.ui.houses.UnVerifiedFragment
import com.example.rentsease.mainsection.ui.houses.VerifiedHousesFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
   // private var tabLayout: TabLayout=findv
  ///  private lateinit var viewPager: ViewPager2
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
       ): View? {
        // Inflate the layout for this fragment
       val view= inflater.inflate(R.layout.fragment_home, container, false)

//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)
//
//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val root: View = binding.root

        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)

        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)

        viewPager.adapter = FragmentAdapter(this)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                        tab.text = "Premium $position"
                    }.attach()

        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    class FragmentAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
        override fun getItemCount(): Int {
            return 2
        }

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> VerifiedHousesFragment.newInstance()
                1 -> UnVerifiedFragment.newInstance()
                else -> VerifiedHousesFragment.newInstance()
            }

        }
    }
}


//
//    verifiedRecyclerView=findViewById(R.id.verifiedRecyclerView)
//    verifiedRecyclerView.setHasFixedSize(true)
//    verifiedRecyclerView.layoutManager=LinearLayoutManager(this)
//    verifiedHouseList= ArrayList()
//
//    verifiedHouseList.add(House(R.drawable.house, "150/year","Virgin SelfCon",R.drawable.house2,"250/year","2 Bed rooom Apartment"))
//    verifiedHouseList.add(House(R.drawable.house, "150/year","Virgin SelfCon",R.drawable.house2,"250/year","2 Bed rooom Apartment"))
//    verifiedHouseList.add(House(R.drawable.house, "150/year","Virgin SelfCon",R.drawable.house2,"250/year","2 Bed rooom Apartment"))
//    verifiedHouseList.add(House(R.drawable.house, "150/year","Virgin SelfCon",R.drawable.house2,"250/year","2 Bed rooom Apartment"))
//    verifiedHouseList.add(House(R.drawable.house, "150/year","Virgin SelfCon",R.drawable.house2,"250/year","2 Bed rooom Apartment"))
//    verifiedHouseList.add(House(R.drawable.house, "150/year","Virgin SelfCon",R.drawable.house2,"250/year","2 Bed rooom Apartment"))
//    verifiedHouseList.add(House(R.drawable.house, "150/year","Virgin SelfCon",R.drawable.house2,"250/year","2 Bed rooom Apartment"))!!
//
//    verifiedHouseAdapter= VerifiedRecyclerViewAdapter(verifiedHouseList)
//    verifiedRecyclerView.adapter =verifiedHouseAdapter






//    }
