package com.romasks.myshopapp.di

import com.romasks.myshopapp.data.repository.ShopRepositoryImpl
import com.romasks.myshopapp.domain.repository.ShopRepository
import dagger.Binds
import dagger.Module

@Module
interface AppModule {

    @Binds
    fun bindsShopRepository(repository: ShopRepositoryImpl): ShopRepository
}