package com.di.test

import android.content.Context
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

	@Inject
	lateinit var retrofit: Retrofit

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setSupportActionBar(findViewById(R.id.toolbar))

		applicationContext.getApp.getAppComponent().inject(this)

		retrofit.crackAllBanks()
	}
}

val Context.getApp: App
	get() = applicationContext as App