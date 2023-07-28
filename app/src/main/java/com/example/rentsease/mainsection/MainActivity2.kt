package com.example.rentsease.mainsection

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.rentsease.R
import com.example.rentsease.databinding.ActivityMain2Binding
import com.example.rentsease.mainsection.adapter.TabbLayoutAdapter
import com.example.rentsease.mainsection.adapter.VerifiedRecyclerViewAdapter
import com.example.rentsease.mainsection.data.House
import com.example.rentsease.mainsection.ui.home.HomeFragment
import com.example.rentsease.mainsection.ui.houses.UnVerifiedFragment
import com.example.rentsease.mainsection.ui.houses.VerifiedHousesFragment
import com.example.rentsease.mainsection.ui.support.SupportFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabGravity
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity2 : AppCompatActivity() {


    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar

    private lateinit var verifiedRecyclerView:RecyclerView
    private lateinit var verifiedHouseList:ArrayList<House>
    private lateinit var verifiedHouseAdapter: VerifiedRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        setSupportActionBar(binding.appBarMain2.toolbar)

       // calling tabLayout & ViewPager
//        tabLayout = findViewById(R.id.tabLayout)
//        viewPager = findViewById(R.id.viewPager)
//        viewPager.adapter = FragmentAdapter(this)
//
//        TabLayoutMediator(tabLayout,viewPager) { tab, position ->
//            tab.text = "Tab ${position}"
//        }.attach()
//

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main2)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.addProperty, R.id.trustedAgents, R.id.searchFragment,R.id.profileFragment,
                R.id.makeRequestFragment,R.id.housingStandardFragment,R.id.termOfUseFragment,
                R.id.register2Fragment,R.id.logIn2Fragment,R.id.logOut2Fragment
            ),drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        NavigationUI.setupWithNavController(binding.appBarMain2.bottomNav,navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_activity2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
                Navigation.findNavController(this,R.id.nav_host_fragment_content_main2))
                ||super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main2)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

//    class FragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
//        override fun getItemCount(): Int {
//            return 2
//        }
//
//        override fun createFragment(position: Int): Fragment {
//            return when (position) {
//                0 -> VerifiedHousesFragment.newInstance()
//                1 -> UnVerifiedFragment.newInstance()
//                else -> VerifiedHousesFragment()
//            }
//
//        }
//
//    }
}
//    override fun onOpItemSelected(item: MenuItem): Boolean {
//        when(item.itemId)
//        {
////            createAccount.setOnClickListener{
////                findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
////            }
//
//            R.id.aboutUs->{}
//            R.id.contactUs->{findNavController(R.id.aboutUs).navigate(R.id.action_nav_home_to_contactFragment)}
//            R.id.support->{
//            }
//            R.id.faq->{}
//
//        }
  //      return super.onContextItemSelected(item)
  //  }
//    private fun loadFragment(fragment: Fragment){
//        val transaction=supportFragmentManager.beginTransaction()
//        transaction.replace(container,fragment)
//        transaction.commit()
//    }

