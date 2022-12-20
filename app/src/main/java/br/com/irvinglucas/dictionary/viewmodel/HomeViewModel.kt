package br.com.irvinglucas.dictionary.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel



class HomeViewModel: ViewModel() {
    private val TAG = "HomeViewModel"
    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "HomeViewModel destroyed!")
    }
}