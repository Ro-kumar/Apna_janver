/*
 * *
 *  * Created by Rohan Programmer on 4/25/24, 6:33 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/25/24, 6:32 PM
 *
 */

package com.techvista.apnajanver.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.NearByAdapter
import com.techvista.apnajanver.adapter.OrderHistoryAdapter
import com.techvista.apnajanver.databinding.ActivityMyBookingBinding

class MyBookingActivity : AppCompatActivity() {

    lateinit var binding: ActivityMyBookingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_booking)
        binding = ActivityMyBookingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        orderhistory()

binding.back.setOnClickListener { finish() }
    }

    fun orderhistory() {
        val adpter8 = OrderHistoryAdapter(
            applicationContext
        )
        val gridLayoutManager8 =
            GridLayoutManager(applicationContext, 1)
        binding.orderhistroyRv.layoutManager = gridLayoutManager8
        binding.orderhistroyRv.setHasFixedSize(true)
        binding.orderhistroyRv.itemAnimator = DefaultItemAnimator()
        binding.orderhistroyRv.adapter = adpter8


    }

}