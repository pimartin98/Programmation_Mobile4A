package com.example.shopp_partner.Injection
import android.app.Activity
import android.app.Application
import android.os.Bundle
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
class ShopApplication : Application() {

    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@ShopApplication)
            modules(presentationModule, presentationModule, domainModule, dataModule)
        }

    }
}