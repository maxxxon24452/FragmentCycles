package com.example.fragmentcycle.presentor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentcycle.R
import com.example.fragmentcycle.databinding.ActivityMainBinding
import com.example.fragmentcycle.fragment.BlankFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .add(R.id.container, BlankFragment())
            .commit()

    }
}