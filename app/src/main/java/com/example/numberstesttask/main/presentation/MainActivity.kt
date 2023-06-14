package com.example.numberstesttask.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.numberstesttask.R
import com.example.numberstesttask.numbers.presentation.NumbersFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NumbersFragment())
            .commit()
    }
}