package com.example.data.storage.video_data

import com.example.data.model.VideoCategory
import com.example.data.model.VideoItem

object RehabilitationSecond {

    val videoCategory = mapOf(
        VideoCategory.Neck to listOf(
            VideoItem(
                4.101,
                "https://example.com/rehab2/neck1.mp4",
                "Реабилитация шеи 2",
                "Упражнение для восстановления шейного отдела"
            ),
            VideoItem(
                4.102,
                "https://example.com/rehab2/neck2.mp4",
                "Растяжка шеи (Rehab 2)",
                "Реабилитационное упражнение для повышения гибкости шеи"
            )
        ),
        VideoCategory.Shoulder to listOf(
            VideoItem(
                4.201,
                "https://example.com/rehab2/shoulder1.mp4",
                "Реабилитация плеча 2",
                "Восстановительное упражнение для плечевого сустава"
            ),
            VideoItem(
                4.202,
                "https://example.com/rehab2/shoulder2.mp4",
                "Растяжка плеч (Rehab 2)",
                "Реабилитация с акцентом на гибкость"
            )
        ),
        VideoCategory.Knee to listOf(
            VideoItem(
                4.301,
                "https://example.com/rehab2/knee1.mp4",
                "Реабилитация колена 2",
                "Упражнение для восстановления связок коленного сустава"
            )
        ),
        VideoCategory.Ankle to listOf(
            VideoItem(
                4.401,
                "https://example.com/rehab2/ankle1.mp4",
                "Реабилитация голеностопа 2",
                "Упражнение для улучшения мобильности голеностопного сустава"
            )
        ),
        VideoCategory.Plank to listOf(
            VideoItem(
                4.501,
                "https://example.com/rehab2/plank1.mp4",
                "Реабилитация планки 2",
                "Упражнение для постепенного возвращения к планке"
            )
        ),
        VideoCategory.WallPushUps to listOf(
            VideoItem(
                4.601,
                "https://example.com/rehab2/pushups1.mp4",
                "Реабилитация отжиманий 2",
                "Легкий вариант отжиманий для реабилитации"
            )
        ),
        VideoCategory.Introduction to listOf(
            VideoItem(
                4.701,
                "https://example.com/rehab2/intro.mp4",
                "Введение в реабилитационную программу 2",
                "Обзорный ролик с объяснением второго этапа реабилитации"
            )
        )
    )
}