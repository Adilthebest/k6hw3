package com.example.k6hw6.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel: ViewModel() {

    val result = MutableLiveData<Int>()

    var resultAdapter = MutableLiveData<String>()

    var history = ""

    var count = 0

    fun increment() {
        ++count

        result.value = count

        history="$history\n+"

        resultAdapter.value=history
    }

    fun decrement() {
        --count

        result.value = count

        history="$history\n-    "
        
        resultAdapter.value=history
    }

}