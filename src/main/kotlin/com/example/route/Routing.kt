package com.example.route

import com.example.data.model.AccountTypeTherapy
import com.example.data.model.VideoCategory
import com.example.data.repository.GetCategoryRepository
import com.example.data.repository.GetVideoRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get(Routes.VIDEO) {
            val type = call.request.queryParameters[Parameters.TYPE] ?: "ExerciseBasic"
            val category = call.request.queryParameters[Parameters.CATEGORY] ?: "Introduction"

            val videoCategory = VideoCategory.fromString(category)
            val accountType = AccountTypeTherapy.fromString(type)
            val responseData = GetVideoRepository.getData(accountType, videoCategory)
            call.respond(HttpStatusCode.OK, responseData)
        }
    }

    routing {
        get(Routes.CATEGORY) {
            val response = GetCategoryRepository.getCategory()
            call.respond(HttpStatusCode.OK, response)
        }
    }
}

object Routes {
    const val VIDEO = "/video"
    const val CATEGORY = "/category"
}

object Parameters {
    const val TYPE = "type"
    const val CATEGORY = "category"
}