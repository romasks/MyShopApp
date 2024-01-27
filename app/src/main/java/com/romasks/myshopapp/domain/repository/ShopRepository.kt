package com.romasks.myshopapp.domain.repository

import com.romasks.myshopapp.domain.entity.SomeData

interface ShopRepository {
    suspend fun getData(): SomeData
    suspend fun login(login: String, password: String)
}