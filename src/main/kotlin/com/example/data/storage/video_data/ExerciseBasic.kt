package com.example.data.storage.video_data

import com.example.data.model.VideoCategory
import com.example.data.model.VideoItem

/*
    1.204
    1 - тип аккаунта
    2 - категория
    04 - номер видео
*/

object ExerciseBasic {

    val videoCategory = mapOf(
        VideoCategory.Neck to listOf(
            VideoItem(
                1.101,
                "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Разминка для шеи",
                "Простое упражнение для разминки шейного отдела"
            ),
            VideoItem(
                1.102,
                "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4",
                "Растяжка шеи",
                "Упражнение для улучшения гибкости и подвижности шеи"
            ),
            VideoItem(
                1.103,
                "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Растяжка шеи",
                "Упражнение для улучшения гибкости и подвижности шеи"
            ),
            VideoItem(
                1.104,
                "https://example.com/basic/neck2.mp4",
                "Растяжка шеи",
                "Упражнение для улучшения гибкости и подвижности шеи"
            ),
            VideoItem(
                1.105,
                "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Растяжка шеи",
                "Упражнение для улучшения гибкости и подвижности шеи"
            ),
        ),
        VideoCategory.Shoulder to listOf(
            VideoItem(
                1.201,
                "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Разминка плечевого сустава",
                "Упражнение для подготовки плеч к нагрузке"
            )
        ),
        VideoCategory.Knee to listOf(
            VideoItem(
                1.301,
                "https://example.com/basic/knee1.mp4",
                "Укрепление коленного сустава",
                "Легкие упражнения для укрепления связок колена"
            )
        ),
        VideoCategory.Ankle to listOf(
            VideoItem(
                1.401,
                "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Развитие гибкости голеностопа",
                "Простые движения для повышения мобильности голеностопного сустава"
            )
        ),
        VideoCategory.Plank to listOf(
            VideoItem(
                1.501,
                "https://example.com/basic/plank1.mp4",
                "Классическая планка",
                "Базовое упражнение для укрепления мышц кора"
            )
        ),
        VideoCategory.WallPushUps to listOf(
            VideoItem(
                1.601,
                "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Отжимания от стены",
                "Легкий вариант отжиманий для новичков и реабилитации"
            )
        ),
        VideoCategory.Introduction to listOf(
            VideoItem(
                1.701,
                "https://example.com/basic/intro.mp4",
                "Введение в упражнения",
                "Обзорный ролик с объяснением базовой программы"
            )
        )
    )
}