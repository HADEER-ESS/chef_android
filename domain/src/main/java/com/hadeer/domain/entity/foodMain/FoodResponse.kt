package com.hadeer.domain.entity.foodMain

data class FoodResponse(

	val categories: List<CategoriesItem?>? = null
)

data class CategoriesItem(

	val strCategory: String? = null,

	val strCategoryDescription: String? = null,

	val idCategory: String? = null,

	val strCategoryThumb: String? = null
)
