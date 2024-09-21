/*
 * *
 *  * Created by Rohan Programmer on 7/26/24, 10:04 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 7/26/24, 10:00 PM
 *
 */

package com.techvista.apnajanver.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.techvista.apnajanver.R
import com.techvista.apnajanver.databinding.ActivitySellBinding

class SellActivity : AppCompatActivity() {
    lateinit var binding: ActivitySellBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sell)
        binding = ActivitySellBinding.inflate(layoutInflater)
        setContentView(binding.root)

        WindowCompat.setDecorFitsSystemWindows(window, true)


        binding.back.setOnClickListener {
            finish()
        }

    }
}