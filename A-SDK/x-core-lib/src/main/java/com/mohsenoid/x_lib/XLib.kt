package com.mohsenoid.x_lib

class XLib(private val logger: Logger) {

    fun doYourJob(number: Int): Boolean {
        logger.log("TestTag", "Doing my job! number=$number")
        return true
    }
}