/*
 * *
 *  * Created by Rohan Programmer on 4/26/24, 1:53 AM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/26/24, 1:52 AM
 *
 */

package com.techvista.apnajanver.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.techvista.apnajanver.R
import com.techvista.apnajanver.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    var titles = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        titles = intent.getStringExtra("title").toString()

        binding.back.setOnClickListener { finish() }

        when (titles) {

            "about" -> {
                binding.title.setText(R.string.menu3)
            }

            "privacy" -> {
                binding.title.setText(R.string.privacy)
            }

            "tram" -> {
                binding.title.setText(R.string.trams)
            }
        }


    }
}