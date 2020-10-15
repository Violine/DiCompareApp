package com.di.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.kodein.di.DIAware
import org.kodein.di.android.di
import org.kodein.di.instance


class MainActivity : AppCompatActivity(), DIAware {

	override val di by di()

	private val retrofit: Retrofit by instance()
	private val stringUtils: Utils by instance("StringUtils")
	private val numberUtils: Utils by instance("NumberUtils")


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setSupportActionBar(findViewById(R.id.toolbar))

		val s = (stringUtils as StringUtils).getString()
		retrofit.setTrumpIsPresident()
	}
}