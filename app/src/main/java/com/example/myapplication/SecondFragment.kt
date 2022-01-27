package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment: Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val changePassword = view.findViewById<Button>(R.id.ChangePassword)
        val logout = view.findViewById<Button>(R.id.logout)

        logout.setOnClickListener {
            startActivity(Intent(requireContext(), MainActivity::class.java))
            requireActivity().finish()
        }
        changePassword.setOnClickListener {
            startActivity(Intent(requireContext(), ChangePasswordAct::class.java))
            requireActivity().finish()
        }

    }
}