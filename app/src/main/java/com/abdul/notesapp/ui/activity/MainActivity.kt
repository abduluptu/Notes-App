package com.abdul.notesapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdul.notesapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Step10.1:
    }
}