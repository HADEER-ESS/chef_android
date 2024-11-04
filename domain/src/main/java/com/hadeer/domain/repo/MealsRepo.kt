package com.hadeer.domain.repo

import com.hadeer.domain.entity.foodMain.FoodResponseModel
import com.hadeer.domain.entity.NetworkResponse

interface MealsRepo {
    suspend fun getMealsFromApi() : NetworkResponse<FoodResponseModel>
}