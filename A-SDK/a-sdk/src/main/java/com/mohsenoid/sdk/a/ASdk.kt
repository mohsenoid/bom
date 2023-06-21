package com.mohsenoid.sdk.a

import android.content.Context
import android.widget.Toast
import com.mohsenoid.core.y.Calculator
import com.mohsenoid.core.y.YLib
import com.mohsenoid.x_lib.Logger
import com.mohsenoid.x_lib.XLib

class ASdk(context: Context) {

    private val logger = object : Logger {
        override fun log(tag: String, message: String) {
            Toast.makeText(context, "$tag:$message", Toast.LENGTH_SHORT).show()
        }
    }

    private val calculator = object : Calculator {
        override fun add(a: Int, b: Int): Int {
            return a + b
        }

    }

    private val xLib: XLib = XLib(logger = logger)
    private val yLib: YLib = YLib(calculator = calculator)

    fun doYourJob() {
        val yResult = yLib.doYourJob()
        xLib.doYourJob(yResult)
    }
}