package com.example.data.repository

import com.example.data.model.VideoCategory
import com.example.data.model.VideoItem

object VideoData {
    val exerciseBasic = mapOf(
        VideoCategory.Neck to listOf(
            VideoItem(
                101,
                "https://example.com/basic/neck1.mp4",
                "Разминка для шеи",
                "Простое упражнение для разминки шейного отдела"
            ),
            VideoItem(
                102,
                "https://example.com/basic/neck2.mp4",
                "Растяжка шеи",
                "Упражнение для улучшения гибкости и подвижности шеи"
            )
        ),
        VideoCategory.Shoulder to listOf(
            VideoItem(
                103,
                "https://example.com/basic/shoulder1.mp4",
                "Разминка плечевого сустава",
                "Упражнение для подготовки плеч к нагрузке"
            )
        ),
        VideoCategory.Knee to listOf(
            VideoItem(
                104,
                "https://example.com/basic/knee1.mp4",
                "Укрепление коленного сустава",
                "Легкие упражнения для укрепления связок колена"
            )
        ),
        VideoCategory.Ankle to listOf(
            VideoItem(
                105,
                "https://example.com/basic/ankle1.mp4",
                "Развитие гибкости голеностопа",
                "Простые движения для повышения мобильности голеностопного сустава"
            )
        ),
        VideoCategory.Plank to listOf(
            VideoItem(
                106,
                "https://example.com/basic/plank1.mp4",
                "Классическая планка",
                "Базовое упражнение для укрепления мышц кора"
            )
        ),
        VideoCategory.WallPushUps to listOf(
            VideoItem(
                107,
                "https://example.com/basic/wallpushups1.mp4",
                "Отжимания от стены",
                "Легкий вариант отжиманий для новичков и реабилитации"
            )
        ),
        VideoCategory.Introduction to listOf(
            VideoItem(
                108,
                "https://example.com/basic/intro.mp4",
                "Введение в упражнения",
                "Обзорный ролик с объяснением базовой программы"
            )
        ),
    )

    val exercisePro = mapOf(
        VideoCategory.Neck to listOf(
            VideoItem(
                201,
                "https://example.com/pro/neck1.mp4",
                "Pro Neck 1",
                "Продвинутое упражнение для шеи"
            )
        ),
        VideoCategory.Shoulder to listOf(
            VideoItem(
                202,
                "https://example.com/pro/shoulder1.mp4",
                "Pro Shoulder 1",
                "Продвинутое плечо"
            ),
            VideoItem(
                203,
                "https://example.com/pro/shoulder2.mp4",
                "Pro Shoulder 2",
                "Дополнительное упражнение"
            )
        )
    )

    val rehabilitationFirst = mapOf(
        VideoCategory.Knee to listOf(
            VideoItem(
                301,
                "https://example.com/rehab1/knee1.mp4",
                "Rehab 1 Knee",
                "Реабилитация колена"
            )
        ),
        VideoCategory.Ankle to listOf(
            VideoItem(
                302,
                "https://example.com/rehab1/ankle1.mp4",
                "Rehab 1 Ankle",
                "Реабилитация голеностопа"
            )
        )
    )

    val rehabilitationSecond = mapOf(
        VideoCategory.Plank to listOf(
            VideoItem(
                401,
                "https://example.com/rehab2/plank1.mp4",
                "Rehab 2 Plank",
                "Реабилитация планки"
            )
        ),
        VideoCategory.WallPushUps to listOf(
            VideoItem(
                402,
                "https://example.com/rehab2/pushups1.mp4",
                "Rehab 2 Pushups",
                "Реабилитация отжиманий"
            )
        )
    )
}
