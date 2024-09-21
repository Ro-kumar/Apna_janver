/*
 * *
 *  * Created by Rohan Programmer on 4/25/24, 9:46 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/25/24, 9:46 PM
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
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.NearByAdapter
import com.techvista.apnajanver.adapter.WalletAdapter
import com.techvista.apnajanver.databinding.ActivityWalletBinding

class WalletActivity : AppCompatActivity() {
    lateinit var binding: ActivityWalletBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wallet)

        binding = ActivityWalletBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)


        binding.back.setOnClickListener { finish() }
        wallet()

        binding.btnWithdraw.setOnClickListener {
            val intent = Intent(this@WalletActivity, WithdrawActivity::class.java)
            startActivity(intent)
        }

    }

    fun wallet() {
        val adpter8 = WalletAdapter(
            applicationContext
        )
        val gridLayoutManager8 =
            GridLayoutManager(applicationContext, 1)
        binding.walletRv.layoutManager = gridLayoutManager8
        binding.walletRv.setHasFixedSize(true)
        binding.walletRv.itemAnimator = DefaultItemAnimator()
        binding.walletRv.adapter = adpter8


    }
}