package com.example.rentsease.authentication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.rentsease.R
import com.example.rentsease.mainsection.MainActivity2


class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_sign_in, container, false)
        val signInButtom=view.findViewById<Button>(R.id.sign_in_Btn)

       signInButtom.setOnClickListener{
           val intent = Intent(this@SignInFragment.requireContext(),MainActivity2::class.java)
           startActivity(intent)
        }
            return view

    }

}