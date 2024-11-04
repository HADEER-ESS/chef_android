package com.hadeer.data.repoImpl

import android.content.Context
import com.hadeer.data.api.ApiService
import com.hadeer.domain.entity.NetworkResponse
import com.hadeer.domain.entity.foodMain.FoodResponseModel
import com.hadeer.domain.entity.foodMain.toGetFoodResponse
import com.hadeer.domain.repo.MealsRepo
import javax.inject.Inject

class MealsRepoImpl @Inject constructor(
    private val apiService: ApiService,
) : MealsRepo {
    override suspend fun getMealsFromApi(): NetworkResponse<FoodResponseModel> {
        val response = apiService.getMealsGategories()
        return if (response.isSuccessful) {
            NetworkResponse.Success(response.body()!!.toGetFoodResponse())
        } else {
            NetworkResponse.ApiError(response.errorBody().toString(), response.code())
        }
    }
}