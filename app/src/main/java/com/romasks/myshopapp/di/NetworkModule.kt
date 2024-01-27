package com.romasks.myshopapp.di

import com.romasks.myshopapp.data.remote.ShopApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun provideShopApiService(): ShopApiService =
        Retrofit.Builder()
            .baseUrl("SOME_URL")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ShopApiService::class.java)
}