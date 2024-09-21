/*
 * *
 *  * Created by Rohan Programmer on 4/26/24, 3:01 AM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/26/24, 3:01 AM
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
import androidx.recyclerview.widget.LinearLayoutManager
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.RelatvieDataAdapter
import com.techvista.apnajanver.databinding.ActivityAllNearByBinding

class AllNearByActivity : AppCompatActivity() {
    lateinit var binding: ActivityAllNearByBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_all_near_by)
        binding = ActivityAllNearByBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        nearyboy()

        binding.back.setOnClickListener { finish() }
    }


    fun nearyboy() {
        val adpter8 = RelatvieDataAdapter(
            applicationContext
        )
        val gridLayoutManager8 =
            GridLayoutManager(applicationContext,2)
        binding.recyclerNearyby.layoutManager = gridLayoutManager8
        binding.recyclerNearyby.setHasFixedSize(true)
        binding.recyclerNearyby.itemAnimator = DefaultItemAnimator()
        binding.recyclerNearyby.adapter = adpter8


    }
}