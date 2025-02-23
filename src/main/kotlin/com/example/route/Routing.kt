package com.example.route

import com.example.data.model.AccountTypeTherapy
import com.example.data.model.VideoCategory
import com.example.data.repository.GetVideoRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/video") {
            val type = call.request.queryParameters["type"] ?: "ExerciseBasic"
            val category = call.request.queryParameters["category"] ?: "Introduction"

            val videoCategory = VideoCategory.fromString(category)
            val accountType = AccountTypeTherapy.fromString(type)
            val responseData = GetVideoRepository.getData(accountType, videoCategory)
            call.respond(HttpStatusCode.OK, responseData)
        }
    }
}