package com.example.courseapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment(R.layout.fragment_second) {


    companion object {

        private const val KEY = "KEY"

        @JvmStatic
        fun newInstance(text: String) = SecondFragment().apply {

            arguments = Bundle().apply {
                putString(KEY, text)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.getString(KEY).let {
            view.findViewById<TextView>(R.id.tvText).text = "Вы ввели следующий текст: $it"
        }
    }
}