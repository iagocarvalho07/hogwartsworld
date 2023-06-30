package com.iagocarvalho.hogwartsworld

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iagocarvalho.hogwartsworld.data.hogwarstRepository
import com.iagocarvalho.hogwartsworld.model.PersonagensDehogwartsItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HogwartsViewModel: ViewModel() {
    private val repository = hogwarstRepository()

    // Codigo com StateFlow
    private val _hogwarts = MutableStateFlow<List<PersonagensDehogwartsItem>>(emptyList())
    val hogwarts: StateFlow<List<PersonagensDehogwartsItem>> = _hogwarts.asStateFlow()

    private val _loaded = MutableStateFlow(false)
    val loaded: StateFlow<Boolean> = _loaded.asStateFlow()

    // segunda opção utlizando LiveData
    //private val _hogwarts = MutableLiveData<List<PersonagensDehogwartsItem>>()
    //val hogwarts: LiveData<List<PersonagensDehogwartsItem>> = _hogwarts

    fun getHogwartsView(){
        viewModelScope.launch {
            try {
                val person = repository.gethogwarts()
                _hogwarts.value = person
            }catch (e: Exception){
                Log.d("Exc", "getHogwartsView: ${e} ")
            } finally {
                _loaded.emit(true)
            }
        }
    }
}