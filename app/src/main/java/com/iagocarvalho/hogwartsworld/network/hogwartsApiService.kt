package com.iagocarvalho.hogwartsworld.network

import com.iagocarvalho.hogwartsworld.model.PersonagensDehogwartsItem
import retrofit2.http.GET

interface hogwartsApiService {
    @GET("characters")
    suspend fun gethogwartschars(): List<PersonagensDehogwartsItem>
}