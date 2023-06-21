package com.mohsenoid.x_lib

class XLib(private val logger: Logger) {

    fun doYourJob(): Boolean {
        logger.log("Doing my job!")
        return true
    }
}