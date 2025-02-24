package com.example.data.model

sealed class AccountTypeTherapy {
    data object ExerciseBasic : AccountTypeTherapy()
    data object ExercisePro : AccountTypeTherapy()
    data object RehabilitationFirst : AccountTypeTherapy()
    data object RehabilitationSecond : AccountTypeTherapy()

    fun getId(): Int = when (this) {
        ExerciseBasic -> 1
        ExercisePro -> 2
        RehabilitationFirst -> 3
        RehabilitationSecond -> 4
    }

    companion object {
        fun fromString(value: String): AccountTypeTherapy = when (value) {
            "ExerciseBasic" -> ExerciseBasic
            "ExercisePro" -> ExercisePro
            "RehabilitationFirst" -> RehabilitationFirst
            "RehabilitationSecond" -> RehabilitationSecond
            else -> ExerciseBasic
        }
    }
}
