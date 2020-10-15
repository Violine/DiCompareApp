package com.di.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import toothpick.Toothpick
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

	@Inject
	lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

		val applicationScope = Toothpick.openScope("APPLICATION_SCOPE")
		Toothpick.inject(this, applicationScope)
		retrofit.hackAllBanks()
    }
}