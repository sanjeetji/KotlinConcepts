package com.sanjeet.kotlinconcepts.activityLifeCycleExample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sanjeet.kotlinconcepts.R

class SecondActivity : AppCompatActivity() {

    val TAG:String = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.e(TAG,"onCreate Method on Second Activity")
    }


    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart Method on Second Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume Method on Second Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause Method on Second Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"onStop Method on Second Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"onRestart Method on Second Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy Method on Second Activity")
    }
}