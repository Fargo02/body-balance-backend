package com.example.data.storage.video_data

import com.example.data.model.VideoCategory
import com.example.data.model.VideoItem

object ExercisePro {

    val videoCategory = mapOf(
        VideoCategory.Neck to listOf(
            VideoItem(
                2.101,
                "https://example.com/pro/neck1.mp4",
                "Разминка для шеи (Pro)",
                "Продвинутое упражнение для разминки шейного отдела"
            ),
            VideoItem(
                2.102,
                "https://example.com/pro/neck2.mp4",
                "Растяжка шеи (Pro)",
                "Упражнение для повышения гибкости и подвижности шеи"
            )
        ),
        VideoCategory.Shoulder to listOf(
            VideoItem(
                2.201,
                "https://example.com/pro/shoulder1.mp4",
                "Разминка плечевого сустава (Pro)",
                "Продвинутое упражнение для подготовки плеч к нагрузке"
            ),
            VideoItem(
                2.202,
                "https://example.com/pro/shoulder2.mp4",
                "Растяжка плеч (Pro)",
                "Продвинутое упражнение для улучшения гибкости плеч"
            )
        ),
        VideoCategory.Knee to listOf(
            VideoItem(
                2.301,
                "https://example.com/pro/knee1.mp4",
                "Укрепление коленного сустава (Pro)",
                "Продвинутые упражнения для укрепления связок колена"
            )
        ),
        VideoCategory.Ankle to listOf(
            VideoItem(
                2.401,
                "https://example.com/pro/ankle1.mp4",
                "Развитие гибкости голеностопа (Pro)",
                "Продвинутые движения для повышения мобильности голеностопного сустава"
            )
        ),
        VideoCategory.Plank to listOf(
            VideoItem(
                2.501,
                "https://example.com/pro/plank1.mp4",
                "Планка с усложнением (Pro)",
                "Упражнение для более интенсивной проработки мышц кора"
            )
        ),
        VideoCategory.WallPushUps to listOf(
            VideoItem(
                2.601,
                "https://example.com/pro/wallpushups1.mp4",
                "Отжимания от стены с нагрузкой (Pro)",
                "Продвинутая версия упражнения с дополнительной нагрузкой"
            )
        ),
        VideoCategory.Introduction to listOf(
            VideoItem(
                2.701,
                "https://example.com/pro/intro.mp4",
                "Введение в продвинутую программу",
                "Обзорный ролик с объяснением продвинутой программы"
            )
        )
    )
}