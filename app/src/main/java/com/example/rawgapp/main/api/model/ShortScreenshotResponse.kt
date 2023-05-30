package com.example.rawgapp.main.api.model


import com.google.gson.annotations.SerializedName

data class ShortScreenshotResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String
)