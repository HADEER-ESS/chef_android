package com.hadeer.chef.di

import com.hadeer.data.api.ApiService
import com.hadeer.data.repoImpl.MealsRepoImpl
import com.hadeer.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
//Where I like Repo with Repo-implementation
object RepoModule {

//    Provider that take api-service which returned in provideApiService in **NETWORKMODULE**
    @Provides
    @Singleton
    fun provideRepo(apiService: ApiService): MealsRepo = MealsRepoImpl(apiService)
}