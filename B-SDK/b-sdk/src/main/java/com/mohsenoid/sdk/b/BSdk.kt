package com.mohsenoid.sdk.b

import android.content.Context
import android.widget.Toast
import com.mohsenoid.x_lib.Logger
import com.mohsenoid.x_lib.XLib

class BSdk(context: Context) {

    private val logger = object : Logger {
        override fun log(tag: String, message: String) {
            Toast.makeText(context, "$tag: $message", Toast.LENGTH_SHORT).show()
        }
    }

    private val xLib: XLib = XLib(logger = logger)

    fun doYourJob() {
        xLib.doYourJob(number = 0)
    }
}