package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileImage: ImageView = findViewById(R.id.profileImage)
        val userName: TextView = findViewById(R.id.userName)
        val userLocation: TextView = findViewById(R.id.userLocation)


        userName.text = "Nguyen Dan Huy"
        userLocation.text = "Ho Chi Minh"
    }
}
