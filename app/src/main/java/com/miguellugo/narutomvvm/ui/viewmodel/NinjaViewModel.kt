package com.miguellugo.narutomvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.miguellugo.narutomvvm.data.model.NinjaItem
import com.miguellugo.narutomvvm.domain.GetAllNinjas
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NinjaViewModel @Inject constructor(
    private val getAllNinjas: GetAllNinjas
): ViewModel() {

    val ninja = MutableLiveData<List<NinjaItem>>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getAllNinjas()

            if (!result.isNullOrEmpty()){
                ninja.postValue(result)
                isLoading.postValue(false)
            }
        }
    }
}