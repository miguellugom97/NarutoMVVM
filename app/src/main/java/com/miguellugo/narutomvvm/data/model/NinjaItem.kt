package com.miguellugo.narutomvvm.data.model


data class NinjaItem(
    val about: List<String>,
    val id: Int,
    val images: List<String>,
    val info: Info,
    val name: String,
    val page: String
)