package com.davidhernandezn.chords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Chords)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}