package com.romasks.myshopapp.di

import com.romasks.myshopapp.presentation.basket.BasketFragment
import com.romasks.myshopapp.presentation.profile.ProfileFragment
import com.romasks.myshopapp.presentation.MainActivity
import com.romasks.myshopapp.presentation.home.HomeFragment

interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(fragment: HomeFragment)
    fun inject(fragment: BasketFragment)
    fun inject(fragment: ProfileFragment)
}