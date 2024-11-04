package com.hadeer.data.api

import com.hadeer.domain.entity.foodMain.FoodResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/categories.php")
    suspend fun getMealsGategories(): Response<FoodResponse>
}