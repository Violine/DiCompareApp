package com.di.test

import javax.inject.Inject

class OkHttpClient

class Retrofit @Inject constructor(okHttpClient: OkHttpClient) {

    fun hackAllBanks() {}
}