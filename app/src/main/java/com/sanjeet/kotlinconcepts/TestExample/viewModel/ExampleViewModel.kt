package com.sanjeet.kotlinconcepts.TestExample.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ExampleViewModel(application: Application) : AndroidViewModel(application) {

    val _userName:MutableLiveData<String> = MutableLiveData<String>()
    val userName : LiveData<String>
        get() = _userName

    init {

        viewModelScope.launch {
            getUserDetails()
        }
    }






    fun getUserDetails(){
        _userName.postValue("My name is Sanjeet Kumar Prajapti")
    }

    fun getUserDetails1(){
        _userName.postValue("My name is Sanjeet Kumar Prajapti")
        println("User name is Sanjeet Kumar One")
    }
    fun getUserDetails2(){
        println("User name is Sanjeet Kumar Two")
    }
    fun getUserDetails3(){
        println("User name is Sanjeet Kumar Three")
    }
    fun getUserDetails4(){
        println("User name is Sanjeet Kumar Four")
    }
    fun getUserDetails5(){
        println("User name is Sanjeet Kumar Five")
    }
}