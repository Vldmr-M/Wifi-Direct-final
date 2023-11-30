package com.example.wifidirect_final

import android.util.Log


object Logger {

    fun log(any: Any?) {
        Log.e("WifiDirect", any?.toString() ?: "null")
    }

}