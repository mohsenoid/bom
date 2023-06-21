package com.mohsenoid.sdk.a

import android.content.Context
import android.widget.Toast
import com.mohsenoid.x_lib.Logger
import com.mohsenoid.x_lib.XLib

class ASdk(context: Context) {

    private val logger = object : Logger {
        override fun log(message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

    private val xLib: XLib = XLib(logger = logger)

    fun doYourJob() {
        xLib.doYourJob()
    }
}