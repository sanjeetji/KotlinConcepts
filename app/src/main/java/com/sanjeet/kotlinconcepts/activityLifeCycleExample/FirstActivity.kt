package com.sanjeet.kotlinconcepts.activityLifeCycleExample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.button.MaterialButton
import com.sanjeet.kotlinconcepts.R

class FirstActivity : AppCompatActivity() {
    val TAG:String = "FirstActivity"
    var btnStartSecondActivity : MaterialButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.e(TAG,"onCreate Method on First Activity")
        btnStartSecondActivity = findViewById(R.id.btn)
        btnStartSecondActivity?.setOnClickListener {
            startActivity(Intent(this@FirstActivity,SecondActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart Method on First Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume Method on First Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause Method on First Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"onStop Method on First Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"onRestart Method on First Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy Method on First Activity")
    }

}
