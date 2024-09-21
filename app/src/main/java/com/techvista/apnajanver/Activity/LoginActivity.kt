/*
 * *
 *  * Created by Rohan Programmer on 4/20/24, 12:58 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/20/24, 12:58 PM
 *
 */

package com.techvista.apnajanver.Activity

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.skydoves.elasticviews.ElasticButton
import com.techvista.apnajanver.R
import com.techvista.apnajanver.databinding.ActivityLoginBinding
import java.util.Locale

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)

//        alerdiloag()

        binding.btnSlogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnSregister.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }



        binding.txtSlogin.setOnClickListener {
//            Toast.makeText(applicationContext, "Login", Toast.LENGTH_SHORT).show()
            binding.txtSlogin.background = getResources().getDrawable(R.drawable.tab1)
            binding.txtSlogin.setTextColor(getResources().getColor(R.color.white))
            binding.txtSRegistion.background = getResources().getDrawable(R.drawable.tab2)
            binding.txtSRegistion.setTextColor(getResources().getColor(R.color.black))
            binding.lvlLogin.visibility = View.VISIBLE
            binding.lvlRegister.visibility = View.GONE
        }


        binding.txtSRegistion.setOnClickListener {
//            Toast.makeText(applicationContext, "gegistiobn", Toast.LENGTH_SHORT).show()
            binding.txtSlogin.background = getResources().getDrawable(R.drawable.tab2)
            binding.txtSlogin.setTextColor(getResources().getColor(R.color.black))
            binding.txtSRegistion.background = getResources().getDrawable(R.drawable.tab1)
            binding.txtSRegistion.setTextColor(getResources().getColor(R.color.white))
            binding.lvlLogin.visibility = View.GONE
            binding.lvlRegister.visibility = View.VISIBLE
        }


    }

    fun setLocal(language: String) {
        val locale = Locale(language)
        val config = Configuration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
        recreate()

    }


    fun alerdiloag() {
        val builder = androidx.appcompat.app.AlertDialog.Builder(
            this@LoginActivity,
            R.style.CustomAlertDialog
        ).create()
        val sheetView = layoutInflater.inflate(R.layout.tranlaterlayout_diloag, null)
        builder.setView(sheetView)
        builder.setCanceledOnTouchOutside(false)

        val hindi = sheetView.findViewById<LinearLayout>(R.id.hindi)
        val english = sheetView.findViewById<LinearLayout>(R.id.english)
        val close = sheetView.findViewById<ImageView>(R.id.close)
        val btn_submit = sheetView.findViewById<ElasticButton>(R.id.btn_submit)

        close.setOnClickListener {
            builder.dismiss()
        }

        btn_submit.setOnClickListener {
            builder.dismiss()
        }
        hindi.setOnClickListener {

            setLocal("hi")
        }

        english.setOnClickListener {

//            builder.dismiss()
            setLocal("en")
        }

        builder.show()
    }


}