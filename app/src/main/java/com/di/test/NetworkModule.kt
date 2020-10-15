package com.di.test

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient()
}

@Module
@InstallIn(FragmentComponent::class)
abstract class UtilsModule {

    @Binds
    abstract fun bindsStringUtils(stringUtils: StringUtilsImpl): StringUtils
}