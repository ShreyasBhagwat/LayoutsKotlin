package com.example.layouts

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class LinearLayoutActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.linear_layout)
        Toast.makeText(this, "You selected Linear layout", Toast.LENGTH_SHORT).show()

    }



}