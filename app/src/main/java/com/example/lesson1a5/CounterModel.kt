package com.example.lesson1a5

class CounterModel {

    private var count:Int = 0

    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }

    fun getResult() = count
}