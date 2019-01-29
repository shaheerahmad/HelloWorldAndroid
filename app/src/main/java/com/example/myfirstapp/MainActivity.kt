package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This was already a kotlin file for some reason so i am adding this comment to signify a change
        // for the PR.
    }
}
