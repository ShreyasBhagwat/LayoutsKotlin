package com.example.layouts

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class RelativeLayoutActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.relative_layout)
        Toast.makeText(this, "You selected Relative layout", Toast.LENGTH_SHORT).show()

    }
}