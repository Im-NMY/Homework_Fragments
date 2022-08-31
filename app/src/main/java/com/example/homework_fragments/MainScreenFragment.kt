package com.example.homework_fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class MainScreenFragment: Fragment(R.layout.fragment_main_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstName = requireActivity().findViewById<EditText>(R.id.firstName)
        val lastName = requireActivity().findViewById<EditText>(R.id.lastName)
        val email = requireActivity().findViewById<EditText>(R.id.email)
        val start = requireActivity().findViewById<Button>(R.id.btnStart)

        start.setOnClickListener() {
            val bundle = Bundle()
            bundle.putString("Firstname", firstName.text.toString() )
            bundle.putString("Lastname", lastName.text.toString() )
            bundle.putString("Email", email.text.toString() )
                parentFragmentManager.beginTransaction().replace(android.R.id.content, SecondScreenFragment.newInstance(bundle))
                    .commit()

        }
    }
}