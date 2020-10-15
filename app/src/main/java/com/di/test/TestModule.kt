package com.di.test

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

	@Provides
	fun provideContext(): Context = context
}

@Module
class UtilsModule {

	@Provides
	fun provideStringUtils(): StringUtils = StringUtilsImpl()
}

@Module
class NetworkModule {

	@Provides
	fun provideOkHttpClient(): OkHttpClient =
		OkHttpClient()

	@Provides
	fun provideRetrofit(okHttClient: OkHttpClient) =
		Retrofit(okHttClient)
}