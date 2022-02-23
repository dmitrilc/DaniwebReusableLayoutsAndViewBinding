package com.codelab.daniwebreusablelayoutsandviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codelab.daniwebreusablelayoutsandviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.include.textViewReusable.text = "Replaced Text"
    }
}