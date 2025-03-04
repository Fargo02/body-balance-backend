package com.example.data.repository

import com.example.data.model.VideoCategory

object GetCategoryRepository {

    fun getCategory(): List<String> {
        return VideoCategory.getCategories()
    }
}