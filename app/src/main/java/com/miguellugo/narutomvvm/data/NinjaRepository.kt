package com.miguellugo.narutomvvm.data

import com.miguellugo.narutomvvm.data.model.NinjaItem
import com.miguellugo.narutomvvm.data.model.NinjaProvider
import com.miguellugo.narutomvvm.data.network.NinjaService
import javax.inject.Inject

class NinjaRepository @Inject constructor(private val api: NinjaService, private val ninjaProvider: NinjaProvider){

    suspend fun getAllNinjas(): List<NinjaItem> {
        val response = api.getNinjas()
        ninjaProvider.ninjas = response
        return response
    }
}