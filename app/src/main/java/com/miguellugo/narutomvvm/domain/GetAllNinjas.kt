package com.miguellugo.narutomvvm.domain

import com.miguellugo.narutomvvm.data.NinjaRepository
import com.miguellugo.narutomvvm.data.model.NinjaItem
import javax.inject.Inject

class GetAllNinjas @Inject constructor(private val repository: NinjaRepository) {

    suspend operator fun invoke(): List<NinjaItem>? = repository.getAllNinjas()
}