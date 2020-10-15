package com.di.test

import javax.inject.Inject

interface StringUtils {

    fun dropAllSymbol()
}

class StringUtilsImpl @Inject constructor() : StringUtils {
    override fun dropAllSymbol() {}
}

class OkHttpClient @Inject constructor()

class Retrofit @Inject constructor(okHttpClient: OkHttpClient) {

    fun crackAllBanks() {}
}