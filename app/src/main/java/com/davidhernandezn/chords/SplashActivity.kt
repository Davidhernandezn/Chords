package com.davidhernandezn.chords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_splash)eliminar
        startActivity(Intent(this,MainActivity::class.java))//va a carGAR para login, esta se lanza agregar bg

    }
}