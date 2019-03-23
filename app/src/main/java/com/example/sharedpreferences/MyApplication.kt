package com.example.sharedpreferences

import android.app.Application
import android.content.Context

class MyApplication:Application(){
    override fun onCreate() {
        super.onCreate()
        val sharedPreferences=getSharedPreferences("mysharedpreference",Context.MODE_PRIVATE)

        val isLoggedin=sharedPreferences.contains("Is_Logged_In")
        if(isLoggedin){
            //start intent for homescreen
        } else
        {
            //start intent for login screen
            //set flag=true if user succesfly loged in
        }

    }
}