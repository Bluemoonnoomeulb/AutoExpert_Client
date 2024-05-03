package com.bluemoon.autoexpert.pojo

import kotlinx.serialization.Serializable

@Serializable
data class CarPrice (
    val min: Int,
    val max: Int,
)