package com.example.data.repository

import com.example.data.model.AccountTypeTherapy
import com.example.data.model.ResponseData
import com.example.data.model.VideoCategory
import com.example.data.storage.video_data.ExerciseBasic
import com.example.data.storage.video_data.ExercisePro
import com.example.data.storage.video_data.RehabilitationFirst
import com.example.data.storage.video_data.RehabilitationSecond

object GetVideoRepository {

    fun getData(type: AccountTypeTherapy, category: VideoCategory): ResponseData {
        val videos = when (type) {
            AccountTypeTherapy.ExerciseBasic -> ExerciseBasic.videoCategory[category]
            AccountTypeTherapy.ExercisePro -> ExercisePro.videoCategory[category]
            AccountTypeTherapy.RehabilitationFirst -> RehabilitationFirst.videoCategory[category]
            AccountTypeTherapy.RehabilitationSecond -> RehabilitationSecond.videoCategory[category]
        } ?: emptyList()

        return ResponseData(id = type.getId(), category = category.name, videoItems = videos)
    }
}