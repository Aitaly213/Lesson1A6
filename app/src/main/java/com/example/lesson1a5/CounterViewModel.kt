package com.example.lesson1a5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    private val model = CounterModel()
    private val _data = MutableLiveData<Int>()

    val data: LiveData<Int> = _data

    fun onIncrement() {
        model.increment()
        _data.value = model.getResult()
    }

    fun onDecrement() {
        model.decrement()
        _data.value = model.getResult()
    }
}