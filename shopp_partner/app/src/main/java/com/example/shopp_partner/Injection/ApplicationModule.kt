package com.example.shopp_partner.Injection


import android.content.Context
import androidx.room.Room
import com.example.shopp_partner.data.local.AppDatabase
import com.example.shopp_partner.data.local.DatabaseDAO
import com.example.shopp_partner.data.repository.ProductRepository
import com.example.shopp_partner.domain.usercase.CreateBascket
import com.example.shopp_partner.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val presentationModule : Module = module {
    factory { MainViewModel(get()) }
}


val domainModule : Module = module {
    factory {CreateBascket(get()) }
}

val dataModule : Module = module {

    single { ProductRepository() }

    single { createDataBase(androidContext()) }

}

fun createDataBase(androidContext: Context): DatabaseDAO {
    val appDatabase : AppDatabase = Room.databaseBuilder(
        androidContext,
        AppDatabase::class.java, "database_product"
    ).build()
   return appDatabase.databaseDao()

}
