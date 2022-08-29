package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import org.w3c.dom.Text

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var text : TextView
    private lateinit var updateButton : Button
    private lateinit var correo : String

    private val args : HomeFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text = view.findViewById(R.id.mensaje)
        updateButton = view.findViewById(R.id.update)
        text.text = "Hola " + args.email + " necesitamos que actualices tu perfil"
        setListeners()
    }

    private fun setListeners() {
        updateButton.setOnClickListener{
            correo = args.email
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(
                email = correo
            )
            requireView().findNavController().navigate(action)
        }
    }
}