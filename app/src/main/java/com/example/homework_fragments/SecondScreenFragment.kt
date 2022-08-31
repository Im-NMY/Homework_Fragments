package com.example.homework_fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondScreenFragment: Fragment(R.layout.fragment_second_screen) {

    companion object {
        fun newInstance (arg : Bundle?): SecondScreenFragment {
            val secondFragment = SecondScreenFragment()
            secondFragment.arguments = arg
            return secondFragment
            }
        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getFirstName = requireActivity().findViewById<TextView>(R.id.getFirstName)
        val getLastName = requireActivity().findViewById<TextView>(R.id.getLastName)
        val getEmail = requireActivity().findViewById<TextView>(R.id.getEmail)
        val finish = requireActivity().findViewById<Button>(R.id.btnFinish)

    getFirstName.text = arguments?.getString("Firstname")
    getLastName.text = arguments?.getString("Lastname")
    getEmail.text = arguments?.getString("Email")

        finish.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(android.R.id.content, MainScreenFragment())
                .commit()
        }

    }

}