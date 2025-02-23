package com.example.app

import com.example.route.configureRouting
import io.ktor.server.application.Application

fun Application.module() {
    configurePlugins()
    configureRouting()
}