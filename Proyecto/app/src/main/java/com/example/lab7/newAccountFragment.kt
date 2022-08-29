package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController


class newAccountFragment : Fragment(R.layout.fragment_new_account) {
    private lateinit var newAccountButton : Button
    private lateinit var correo : String
    private lateinit var inputLayoutEmail : EditText


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newAccountButton = view.findViewById(R.id.NuevaCuenta)
        inputLayoutEmail = view.findViewById(R.id.textInputEditText)
        setListeners()
    }

    private fun setListeners() {
        newAccountButton.setOnClickListener{
            correo = inputLayoutEmail.getText().toString()
            val action = newAccountFragmentDirections.actionNewAccountFragmentToHomeFragment(
                email = correo
            )
            requireView().findNavController().navigate(action)
        }
    }

}