package com.example.sharedpreferences

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sharedPreference=getSharedPreferences("mysharedpreference",Context.MODE_PRIVATE)
        val retrievedText=sharedPreference.getString("Name","")
        edittext.setText(retrievedText)
        btn.setOnClickListener {
            val input=edittext.text.toString()
            //store it in sharedpreference
            val editor=sharedPreference.edit()
            editor.putString("Name",input)
            editor.apply()
        }

    }
}
