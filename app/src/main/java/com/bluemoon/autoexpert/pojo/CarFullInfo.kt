package com.bluemoon.autoexpert.pojo

import kotlinx.serialization.Serializable

@Serializable
data class CarFullInfo (
    val id: Int,
    val name: String,
    val year: String,
    val drive: String,
    val swheel: String,
    val persons: Int,
    val engine: CarEngine,
    val size: CarSize,
    val price: CarPrice
)