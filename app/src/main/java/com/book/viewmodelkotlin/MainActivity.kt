package com.book.viewmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var txtCounter : TextView
    lateinit var  button : Button
    lateinit var  mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txtCounter = findViewById(R.id.text)
        button = findViewById(R.id.button)
        setText()
        button.setOnClickListener {
         mainViewModel.increment()
            setText()
        }
    }

    private fun setText() {
        txtCounter.text =mainViewModel.count.toString()
    }
}