package com.di.test

import android.app.Application
import toothpick.Scope
import toothpick.Toothpick


class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val applicationScope: Scope = Toothpick.openScope("APPLICATION_SCOPE")
        applicationScope.installModules(ExampleModule(applicationContext))
    }

    override fun onTerminate() {
        Toothpick.closeScope("APPLICATION_SCOPE")
        super.onTerminate()
    }
}