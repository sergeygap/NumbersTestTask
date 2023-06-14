package com.example.numberstesttask.numbers.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import com.example.numberstesttask.R
import com.example.numberstesttask.details.presentation.DetailsFragment

class NumbersFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_numbers, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ProgressBar>(R.id.progressBar).visibility = View.GONE
        view.findViewById<View>(R.id.getFactButton).setOnClickListener {
            val detailsFragment = DetailsFragment()
            detailsFragment.arguments = Bundle().apply {
                putString("details", "some information about the random number hardcoded")
            }
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, detailsFragment)
                .addToBackStack(detailsFragment.javaClass.simpleName)
                .commit()
        }
    }


}