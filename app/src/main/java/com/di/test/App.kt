package com.di.test

import android.app.Application
import dagger.Module
import dagger.android.ContributesAndroidInjector

class App : Application() {

    lateinit var component: AppComponent

    lateinit var subComponent: AppSubComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .utilsModule(UtilsModule())
            .networkModule(NetworkModule())
            .build()

        subComponent = component.addSubComponent(UtilsModule())
    }

    fun getAppComponent(): AppComponent =
        component

    @Module
    interface UtilsModule {

        @ContributesAndroidInjector(modules = [UtilsModule::class])
        fun contributeFirstFragment(): FirstFragment
    }
}