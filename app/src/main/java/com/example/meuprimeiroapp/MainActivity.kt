package com.example.meuprimeiroapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.meuprimeiroapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Log.i("lifecycle", "onCreate")
    }
        override fun onResume() {
            super.onResume()
            Log.i("lifecycle","onResume")
        }

    }

   // override fun onStart() { // falta coisa
     //   super.onStart()
     //   Log.i("lifecycle", "onStart")
  //  }

