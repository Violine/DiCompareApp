package com.di.test

import android.content.Context
import toothpick.config.Module

class ExampleModule(context: Context) : Module() {

    init {
        val okHttpClient = OkHttpClient()

        bind(OkHttpClient::class.java).toInstance(okHttpClient)

        bind(Retrofit::class.java)
    }
}