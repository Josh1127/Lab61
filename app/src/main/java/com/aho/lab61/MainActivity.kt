package com.aho.lab61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fruits = listOf("Apple","Banana","Cherry","Grapes","Lemon","Orange","Pear","Pineapple","Tomato","Watermelon")
    }
}
