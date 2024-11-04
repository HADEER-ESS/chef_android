package com.hadeer.domain.useCase

import com.hadeer.domain.entity.foodMain.FoodResponseModel
import com.hadeer.domain.entity.NetworkResponse
import com.hadeer.domain.repo.MealsRepo

class MealsCategoryUseCase(
    private val mealRepo: MealsRepo
){
     suspend fun getMealsFromApi(): NetworkResponse<FoodResponseModel> {
        return mealRepo.getMealsFromApi()
    }
}