package com.iagocarvalho.hogwartsworld.data

import com.iagocarvalho.hogwartsworld.model.PersonagensDehogwartsItem

interface hogwarstRepository {
    suspend fun gethogwarts(): List<PersonagensDehogwartsItem>
}