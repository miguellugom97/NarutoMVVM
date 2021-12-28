package com.miguellugo.narutomvvm.data.network

import com.miguellugo.narutomvvm.data.model.NinjaItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NinjaService @Inject constructor(private val api: NinjaApiClient) {

    suspend fun getNinjas(): List<NinjaItem> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllNinjas()
            response.body() ?: emptyList()
        }
    }
}