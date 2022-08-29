package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class LogInFragment : Fragment(R.layout.fragment_log_in) {
        private lateinit var buttonLogin : Button
        private lateinit var inputLayoutEmail : EditText
        private lateinit var correo : String
        private lateinit var newAccount : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonLogin = view.findViewById(R.id.login)
        inputLayoutEmail = view.findViewById(R.id.textInputEditText)
        newAccount = view.findViewById(R.id.newaccount)
        setListeners()
    }

    private fun setListeners() {
        buttonLogin.setOnClickListener{
            correo = inputLayoutEmail.getText().toString()
            if (correo == "jcdurini@uvg.edu.gt") {
                val action = LogInFragmentDirections.actionLogInFragmentToHomeFragment(
                    email = correo
                )
                requireView().findNavController().navigate(action)
            }
            else{
                Toast.makeText(activity, "El correo indicado no existe", Toast.LENGTH_LONG).show()
            }
        }
        newAccount.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_logInFragment_to_newAccountFragment)
        }

    }
}