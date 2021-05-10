package com.example.nimmer_quizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.register_activity)
    }
}