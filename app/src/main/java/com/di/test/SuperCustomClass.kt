package com.di.test

import android.content.Context
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ApplicationComponent

class SuperCustomClass(context: Context) {

    @EntryPoint
    @InstallIn(ApplicationComponent::class)
    interface SuperCustomClassEntryPoint {
        fun okHttpClient(): OkHttpClient
    }

    val okHttpClientTwo: OkHttpClient =
        EntryPointAccessors.fromApplication(context, SuperCustomClassEntryPoint::class.java).okHttpClient()
}