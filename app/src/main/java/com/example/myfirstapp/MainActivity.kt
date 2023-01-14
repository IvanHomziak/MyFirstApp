package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLogActivityIH", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogActivityIH", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogActivityIH", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogActivityIH", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogActivityIH", "onDestroy")
    }
}