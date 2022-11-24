package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class DashbordFragment: Fragment(R.layout.fragment_dashbord) {
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editTextTextPersonName)
        button = view.findViewById(R.id.button)

        button.setOnClickListener {

            val name = editText.text.toString()

            val action = DashbordFragmentDirections.actionDashbordFragmentToNotificationFragment(name)
            val action1 = DashbordFragmentDirections.actionDashbordFragmentToInfoFragment(name)

            findNavController().navigate(action)
            findNavController().navigate(action1)

        }


    }
}