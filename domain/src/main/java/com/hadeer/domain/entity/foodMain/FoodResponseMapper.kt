package com.hadeer.domain.entity.foodMain

public fun FoodResponse.toGetFoodResponse() : FoodResponseModel {
    return FoodResponseModel(
        data = categories!!.map { it!!.toGetItem() }
    )
}

private fun CategoriesItem.toGetItem() : CategoryItemResponseModel {
    return CategoryItemResponseModel(
        id = idCategory!!,
        name = strCategory!!,
        description = strCategoryDescription!!
    )
}