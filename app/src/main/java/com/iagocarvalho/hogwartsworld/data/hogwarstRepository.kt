package com.iagocarvalho.hogwartsworld.data

import com.iagocarvalho.hogwartsworld.model.PersonagensDehogwartsItem


class hogwarstRepository {
    private val hogwartsApiService = HogwartsRetrofitInstance.HogwarstsApiService

    suspend fun gethogwarts(): List<PersonagensDehogwartsItem>{
        return hogwartsApiService.gethogwartschars()
    }
}