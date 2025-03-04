package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
class VideoItem(
    val id: Double,
    val url: String,
    val name: String,
    val description: String
)

@Serializable
class ResponseData(
    val id: Int,
    val category: String,
    val videoItems: List<VideoItem>
)

@Serializable
class ResponseCategory(
    val data: List<String>
)