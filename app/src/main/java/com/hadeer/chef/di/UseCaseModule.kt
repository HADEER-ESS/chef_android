package com.hadeer.chef.di

import com.hadeer.domain.repo.MealsRepo
import com.hadeer.domain.useCase.MealsCategoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): MealsCategoryUseCase {
        return MealsCategoryUseCase(mealsRepo)
    }

}