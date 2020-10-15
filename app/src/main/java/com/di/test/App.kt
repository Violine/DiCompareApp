package com.di.test

import android.app.Application
import org.kodein.di.*


class App : Application(), DIAware {

    lateinit var importModule: DI.Module
    lateinit var extModule: DI

    override fun onCreate() {
        super.onCreate()

        importModule = DI.Module("SUBMODULE") {
            bind<Utils>(tag = "StringUtils") with singleton { StringUtils() }
            bind<Utils>(tag = "NumberUtils") with singleton { NumberUtils() }
        }

        extModule = DI {
            bind() from singleton { TestClass() }
        }

    }

    override val di: DI
        get() = DI {
            extend(extModule)
            import(importModule)
            bind() from singleton { OkHttpClient() }
            bind() from provider { Retrofit(instance()) }
        }
}