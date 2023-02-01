package com.example.countermvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var count = 0
    var mCounter = MutableLiveData<Int>()
    var history = arrayListOf<String>()

    fun onIncrementClick(){
        count++
        mCounter.value = count
        history.add("+")
    }
    fun onDecrementClick(){
        count--
        mCounter.value = count
        history.add("-")
    }
}