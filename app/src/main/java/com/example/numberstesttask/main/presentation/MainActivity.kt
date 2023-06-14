package com.example.numberstesttask.main.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.numberstesttask.R
import com.example.numberstesttask.numbers.presentation.NumbersFragment

class MainActivity : AppCompatActivity(), ShowFragment {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null)
            show(NumbersFragment())
    }

    private fun show(fragment: Fragment)
    {
        val transaction = supportFragmentManager.beginTransaction()
        val container = R.id.container
        transaction.replace(container, fragment)
        transaction.commit()
    }

    override fun show(fragment: Fragment, something: Boolean) {

    }


}

interface ShowFragment {
    fun show(fragment: Fragment, something: Boolean)
}