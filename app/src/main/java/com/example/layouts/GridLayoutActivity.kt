package com.example.layouts

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class GridLayoutActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.grid_layout)
        Toast.makeText(this, "You selected Grid layout", Toast.LENGTH_SHORT).show()

    }
}