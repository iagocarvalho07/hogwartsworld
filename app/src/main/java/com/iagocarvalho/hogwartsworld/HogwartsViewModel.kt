package com.iagocarvalho.hogwartsworld

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iagocarvalho.hogwartsworld.data.hogwarstRepository
import com.iagocarvalho.hogwartsworld.model.PersonagensDehogwartsItem
import kotlinx.coroutines.launch

class HogwartsViewModel: ViewModel() {
    private val repository = hogwarstRepository()

    private val _hogwarts = MutableLiveData<List<PersonagensDehogwartsItem>>()
    val hogwarts: LiveData<List<PersonagensDehogwartsItem>> = _hogwarts

    fun getHogwartsView(){
        viewModelScope.launch {
            try {
                val person = repository.gethogwarts()
            }catch (e: Exception){
                Log.d("Exc", "getHogwartsView: ${e} ")
            }
        }
    }
}