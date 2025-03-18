package com.example.route

import com.example.data.model.AccountTypeTherapy
import com.example.data.model.VideoCategory
import com.example.data.repository.CheckAccountTypeRepository
import com.example.data.repository.GetCategoryRepository
import com.example.data.repository.GetVideoRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

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

    routing {
        get(Routes.LOGIN) {
            val type = call.request.queryParameters[Parameters.TYPE] ?: ""
            call.respond(HttpStatusCode.OK, CheckAccountTypeRepository.isValidAccountType(type))
        }
    }
}

object Routes {
    const val VIDEO = "/video"
    const val CATEGORY = "/category"
    const val LOGIN = "/login"
}

object Parameters {
    const val TYPE = "type"
    const val CATEGORY = "category"
}