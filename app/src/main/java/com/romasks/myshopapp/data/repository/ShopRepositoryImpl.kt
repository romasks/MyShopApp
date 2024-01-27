package com.romasks.myshopapp.data.repository

import com.romasks.myshopapp.data.remote.ShopApiService
import com.romasks.myshopapp.domain.entity.SomeData
import com.romasks.myshopapp.domain.repository.ShopRepository

class ShopRepositoryImpl(
    private val api: ShopApiService
) : ShopRepository {

    override suspend fun getData(): SomeData {
        TODO("Not yet implemented")
    }

    override suspend fun login(login: String, password: String) {
        TODO("Not yet implemented")
    }
}