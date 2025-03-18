package com.example.data.repository

object CheckAccountTypeRepository {

    fun isValidAccountType(value: String) =
        when (value) {
            "ExerciseBasic", "ExercisePro",
            "RehabilitationFirst", "RehabilitationSecond" -> true
            else -> false
        }
}