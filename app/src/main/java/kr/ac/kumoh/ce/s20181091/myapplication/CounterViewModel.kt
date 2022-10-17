package kr.ac.kumoh.ce.s20181091.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
//    private var _count = 0
//    var count
//        get() = _count
//        set(value) {
//            _count = value
//        }
//    fun add() {
//        _count++
//    }
    private var _count = MutableLiveData<Int>(0)
    val count: LiveData<Int>
        get() = _count

    fun add() {
        _count.value = _count.value?.plus(1)
    }

}