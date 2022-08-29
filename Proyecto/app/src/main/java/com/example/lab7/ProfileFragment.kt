package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavArgs
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs


class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var inputLayoutEmail : EditText
    private lateinit var updtaeButton : Button
    private val args : ProfileFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inputLayoutEmail = view.findViewById(R.id.textInputEditText)
        updtaeButton = view.findViewById(R.id.Actualizar)
        inputLayoutEmail.setText(args.email)

        setListeners()
    }

    private fun setListeners() {
        updtaeButton.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_profileFragment_to_logInFragment)
        }
    }


}