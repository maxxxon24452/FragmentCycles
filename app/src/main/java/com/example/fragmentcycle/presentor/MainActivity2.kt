package com.example.fragmentcycle.presentor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentcycle.R
import com.example.fragmentcycle.databinding.ActivityMain2Binding
import com.example.fragmentcycle.databinding.ActivityMainBinding
import com.example.fragmentcycle.fragment.BlankFragment2

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportFragmentManager.beginTransaction()
            .add(R.id.container2, BlankFragment2())
            .commit()
    }
}