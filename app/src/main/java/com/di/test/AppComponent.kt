package com.di.test

import dagger.Component
import dagger.Subcomponent

@Component(modules = [AppModule::class, UtilsModule::class, NetworkModule::class])
interface AppComponent {

    fun addSubComponent(utilsModule: UtilsModule): AppSubComponent

    fun inject(mainActivity: MainActivity)
}

@Subcomponent(modules = [UtilsModule::class])
interface AppSubComponent {

    fun inject(firstFragment: FirstFragment)
}
