package com.example.courseapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FirstFragment : Fragment(R.layout.fragment_first) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(view) {
            val btnNext = findViewById<Button>(R.id.btnNext)
            val etText = findViewById<EditText>(R.id.etText)
            btnNext.setOnClickListener { toSecondFragment(etText.text.toString()) }
        }

    }

   private fun toSecondFragment(text: String) {
        parentFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(
                R.id.container,
                SecondFragment.newInstance(text = text)
            )
            .commit()
    }

    companion object {

        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}