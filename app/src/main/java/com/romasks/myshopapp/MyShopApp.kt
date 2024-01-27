package com.romasks.myshopapp

import android.app.Application
import com.romasks.myshopapp.di.DaggerApplicationComponent

class MyShopApp : Application() {

    val appComponent = DaggerApplicationComponent.create()
}