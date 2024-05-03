package com.bluemoon.autoexpert.pojo

import kotlinx.serialization.Serializable

@Serializable
data class CarEngine (
    val volume: Double,
    val power: Int,
    val petrol: String
)