package com.romasks.myshopapp.domain.logic

import com.romasks.myshopapp.domain.entity.SomeData
import com.romasks.myshopapp.domain.repository.ShopRepository
import javax.inject.Inject

class GetDataUseCase @Inject constructor(
    private val repository: ShopRepository
) {

    suspend operator fun invoke(): SomeData {
        return repository.getData()
    }
}