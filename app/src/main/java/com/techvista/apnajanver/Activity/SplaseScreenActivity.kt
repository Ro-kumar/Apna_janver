/*
 * *
 *  * Created by Rohan Programmer on 4/20/24, 12:44 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/20/24, 12:42 PM
 *
 */

package com.techvista.apnajanver.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.techvista.apnajanver.R
import com.techvista.apnajanver.databinding.ActivitySplaseScreenBinding

class SplaseScreenActivity : AppCompatActivity() {
    lateinit var binding:ActivitySplaseScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splase_screen)


        binding=ActivitySplaseScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Handler(Looper.getMainLooper()).postDelayed({

            //IntroActivity

            val intent = Intent(this@SplaseScreenActivity,LoginActivity ::class.java)
            startActivity(intent)
            finish()

        }, 3000)


    }
}