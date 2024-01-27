package com.romasks.myshopapp.domain.logic

import com.romasks.myshopapp.domain.repository.ShopRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: ShopRepository
) {

    suspend operator fun invoke(name: String, password: String) {
        repository.login(name, password)
    }
}