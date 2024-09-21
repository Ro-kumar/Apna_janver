/*
 * *
 *  * Created by Rohan Programmer on 8/2/24, 2:01 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 8/2/24, 1:55 PM
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
import com.techvista.apnajanver.adapter.MemmberListAdaper
import com.techvista.apnajanver.databinding.ActivityChatMammberListBinding

class ChatMammberListActivity : AppCompatActivity() {

    lateinit var binding: ActivityChatMammberListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat_mammber_list)
        binding = ActivityChatMammberListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)

        binding.back.setOnClickListener { finish() }

        chat()
    }

    fun chat() {
        var adpter8 = MemmberListAdaper(
            applicationContext
        )
        val gridLayoutManager8 =
            GridLayoutManager(applicationContext, 1)
        binding.memmberlistRv.layoutManager = gridLayoutManager8
        binding.memmberlistRv.setHasFixedSize(true)
        binding.memmberlistRv.itemAnimator = DefaultItemAnimator()
        binding.memmberlistRv.adapter = adpter8

    }
}