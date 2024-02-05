package com.sanjeet.kotlinconcepts.TestExample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.sanjeet.kotlinconcepts.R
import com.sanjeet.kotlinconcepts.TestExample.viewModel.ExampleViewModel
import kotlinx.coroutines.launch

class ExampleMainActivity : AppCompatActivity() {

//    val myViewModel1 = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(ExampleViewModel::class.java)
//    val myViewModel2 = ViewModelProvider.AndroidViewModelFactory(this.application).create(ExampleViewModel::class.java)
//    val myViewModel3 = ViewModelProvider(this).get(ExampleViewModel::class.java)
//    val myViewModel4: ExampleViewModel by viewModels()
    val myViewModel5 by viewModels<ExampleViewModel>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_main)

//        myViewModel1.getUserDetails1()
//        myViewModel2.getUserDetails2()
//        myViewModel3.getUserDetails3()
//        myViewModel4.getUserDetails4()
        myViewModel5.getUserDetails5()

        lifecycleScope.launch {
            myViewModel5.userName.observe(this@ExampleMainActivity, Observer {
                println("First is $it")
            })


            myViewModel5.userName.observeForever {
                println("Second is $it")
            }
        }

    }
}