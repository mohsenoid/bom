package com.mohsenoid.core.y

class YLib(private val calculator: Calculator) {

    fun doYourJob(): Int {
        return calculator.add(10, 11)
    }
}