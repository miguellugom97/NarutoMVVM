package com.miguellugo.narutomvvm.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NinjaProvider @Inject constructor(){
    var ninjas: List<NinjaItem> = emptyList()
}