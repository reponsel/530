package com.blackbird.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blackbird.myapplication.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}