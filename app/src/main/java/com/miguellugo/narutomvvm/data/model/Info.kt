package com.miguellugo.narutomvvm.data.model

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("Afiliação") val affiliation: String,
    @SerializedName("Altura") val height: String,
    @SerializedName("Aniversário") val birthday: String,
    @SerializedName("Graduação (Chūnin)") val graduationChunin: String,
    @SerializedName("Graduação (Genin)") val graduationGenin: String,
    @SerializedName("Clã") val clan: String,
    @SerializedName("Idade")
    val years: String,
    @SerializedName("Ocupação")
    val occupation: String,
    @SerializedName("Parceiro")
    val partner: String,
    @SerializedName("Patente Ninja")
    val patentNinja: String,
    @SerializedName("Peso")
    val weight: String,
    @SerializedName("Sexo")
    val sex: String,
    @SerializedName("Times")
    val teams: String,
    @SerializedName("Tipo Sanguíneo")
    val typeBlood: String
)