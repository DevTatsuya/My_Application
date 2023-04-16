package com.example.replacement.viewmodels

import android.util.MutableInt
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.compose.material.Text

class ScoreViewModel : ViewModel() {
    var Score: MutableLiveData<Int> = MutableLiveData()
}