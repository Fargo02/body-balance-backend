package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class VideoItem(
    val id: Double,
    val url: String,
    val name: String,
    val description: String
)

@Serializable
data class ResponseData(
    val id: Int,
    val category: String,
    val videoItems: List<VideoItem>
)