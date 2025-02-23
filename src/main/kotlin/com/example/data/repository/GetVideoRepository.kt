package com.example.data.repository

import com.example.data.model.AccountTypeTherapy
import com.example.data.model.ResponseData
import com.example.data.model.VideoCategory

object GetVideoRepository {
    fun getData(type: AccountTypeTherapy, category: VideoCategory): ResponseData {
        val videos = when (type) {
            AccountTypeTherapy.ExerciseBasic -> VideoData.exerciseBasic[category]
            AccountTypeTherapy.ExercisePro -> VideoData.exercisePro[category]
            AccountTypeTherapy.RehabilitationFirst -> VideoData.rehabilitationFirst[category]
            AccountTypeTherapy.RehabilitationSecond -> VideoData.rehabilitationSecond[category]
        } ?: emptyList()

        return ResponseData(id = type.getId(), category = category.name, videoItems = videos)
    }
}

