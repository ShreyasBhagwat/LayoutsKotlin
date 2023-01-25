package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyActivity","onCreate()")
        setContentView(R.layout.layout_main)

        val linearBtn = findViewById<Button>(R.id.linearButton)
        val relativeBtn = findViewById<Button>(R.id.relativeButton)
        val gridBtn = findViewById<Button>(R.id.gridButton)


        linearBtn.setOnClickListener {
            startActivity(Intent(this,LinearLayoutActivity::class.java))
        }

        relativeBtn.setOnClickListener {
            startActivity(Intent(this,RelativeLayoutActivity::class.java))
        }

        gridBtn.setOnClickListener {
            startActivity(Intent(this,GridLayoutActivity::class.java))
        }



    }
}