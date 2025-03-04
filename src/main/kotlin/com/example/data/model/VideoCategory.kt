package com.example.data.model

sealed class VideoCategory(val name: String) {
    data object Neck : VideoCategory("Шея")
    data object Shoulder : VideoCategory("Плечо")
    data object Knee : VideoCategory("Колено")
    data object Ankle : VideoCategory("Голеностоп")
    data object Plank : VideoCategory("Планки")
    data object WallPushUps : VideoCategory("Отжимания у стены")
    data object Introduction : VideoCategory("Вступительное видео")

    companion object {
        fun fromString(name: String): VideoCategory {
            return when (name) {
                "Шея" -> Neck
                "Плечо" -> Shoulder
                "Колено" -> Knee
                "Голеностоп" -> Ankle
                "Планки" -> Plank
                "Отжимания у стены" -> WallPushUps
                "Introduction" -> Introduction
                else -> throw IllegalArgumentException("Неизвестная категория: $name")
            }
        }

        fun getCategories(): List<String> {
            return VideoCategory::class.sealedSubclasses
                .mapNotNull { it.objectInstance?.name }
        }
    }
}