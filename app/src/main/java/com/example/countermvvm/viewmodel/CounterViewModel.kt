package com.example.countermvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var count = 0
    var mCounter = MutableLiveData<Int>()
    var history = MutableLiveData<String>()

    fun onIncrementClick(){
        count++
        mCounter.value = count
        history.value = "+"
    }
    fun onDecrementClick(){
        count--
        mCounter.value = count
        history.value = "-"
    }
}