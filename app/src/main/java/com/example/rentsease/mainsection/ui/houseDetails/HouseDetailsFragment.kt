package com.example.rentsease.mainsection.ui.houseDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rentsease.R

class HouseDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = HouseDetailsFragment()
    }

    private lateinit var viewModel: HouseDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_house_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HouseDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}