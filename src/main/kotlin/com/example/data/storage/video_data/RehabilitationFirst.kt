package com.example.data.storage.video_data

import com.example.data.model.VideoCategory
import com.example.data.model.VideoItem

object RehabilitationFirst {

    val videoCategory = mapOf(
        VideoCategory.Neck to listOf(
            VideoItem(
                3.101,
                "https://example.com/rehab1/neck1.mp4",
                "Реабилитация шеи 1",
                "Начальное упражнение для восстановления шейного отдела"
            ),
            VideoItem(
                3.102,
                "https://example.com/rehab1/neck2.mp4",
                "Растяжка шеи (Rehab 1)",
                "Реабилитационное упражнение для улучшения гибкости шеи"
            )
        ),
        VideoCategory.Shoulder to listOf(
            VideoItem(
                3.201,
                "https://example.com/rehab1/shoulder1.mp4",
                "Реабилитация плеча 1",
                "Легкое упражнение для восстановления подвижности плеча"
            ),
            VideoItem(
                3.202,
                "https://example.com/rehab1/shoulder2.mp4",
                "Растяжка плеч (Rehab 1)",
                "Реабилитационное упражнение для улучшения гибкости плеч"
            )
        ),
        VideoCategory.Knee to listOf(
            VideoItem(
                3.301,
                "https://example.com/rehab1/knee1.mp4",
                "Реабилитация колена 1",
                "Начальное упражнение для восстановления связок колена"
            )
        ),
        VideoCategory.Ankle to listOf(
            VideoItem(
                3.401,
                "https://example.com/rehab1/ankle1.mp4",
                "Реабилитация голеностопа 1",
                "Легкие упражнения для улучшения мобильности голеностопного сустава"
            )
        ),
        VideoCategory.Plank to listOf(
            VideoItem(
                3.501,
                "https://example.com/rehab1/plank1.mp4",
                "Реабилитация планки 1",
                "Постепенное возвращение к выполнению планки"
            )
        ),
        VideoCategory.WallPushUps to listOf(
            VideoItem(
                3.601,
                "https://example.com/rehab1/pushups1.mp4",
                "Реабилитация отжиманий 1",
                "Облегченный вариант отжиманий для начального этапа восстановления"
            )
        ),
        VideoCategory.Introduction to listOf(
            VideoItem(
                3.701,
                "https://example.com/rehab1/intro.mp4",
                "Введение в реабилитационную программу 1",
                "Обзорный ролик с объяснением начального этапа реабилитации"
            )
        )
    )
}