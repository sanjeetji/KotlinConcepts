package com.sanjeet.kotlinconcepts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanjeet.kotlinconcepts.BoundServiceExample.BoundServiceActivity
import com.sanjeet.kotlinconcepts.activityLifeCycleExample.FirstActivity
import com.sanjeet.kotlinconcepts.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}