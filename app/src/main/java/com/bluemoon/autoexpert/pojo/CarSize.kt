package com.bluemoon.autoexpert.pojo

import kotlinx.serialization.Serializable

@Serializable
data class CarSize (
    val length: Double,
    val height: Double,
    val clearance: Int
)