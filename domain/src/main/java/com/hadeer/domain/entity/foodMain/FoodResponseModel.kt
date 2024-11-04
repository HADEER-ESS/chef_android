package com.hadeer.domain.entity.foodMain

data class FoodResponseModel(
    val data : List<CategoryItemResponseModel>
)
data class CategoryItemResponseModel(
    val id : String,
    val name : String,
    val description : String,
)
