package com.example.rentsease.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.rentsease.R

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_sign_up, container, false)
        val createAccount=view.findViewById<Button>(R.id.create_accountBTN)

        createAccount.setOnClickListener{
            findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
        }

        return view
    }

}
