package com.iagocarvalho.hogwartsworld.data

import com.iagocarvalho.hogwartsworld.network.hogwartsApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


class NetWorking {
    private val  BASE_URL = "https://hp-api.onrender.com/api/characters"

    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    private val  apiService: hogwartsApiService by lazy {
        retrofit.create(hogwartsApiService::class.java)
    }


}