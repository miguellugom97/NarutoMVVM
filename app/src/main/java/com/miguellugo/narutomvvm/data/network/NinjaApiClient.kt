package com.miguellugo.narutomvvm.data.network

import com.miguellugo.narutomvvm.data.model.NinjaItem
import retrofit2.Response
import retrofit2.http.GET

interface NinjaApiClient {
    @GET("/api/v1/characters")
    suspend fun getAllNinjas(): Response<List<NinjaItem>>
}