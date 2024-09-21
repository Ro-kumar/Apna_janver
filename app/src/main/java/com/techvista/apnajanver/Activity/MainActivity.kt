/*
 * *
 *  * Created by Rohan Programmer on 18/02/24, 6:42 pm
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 18/02/24, 6:42 pm
 *
 */

package com.techvista.apnajanver.Activity

import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.skydoves.elasticviews.ElasticButton
import com.techvista.apnajanver.Fragment.HomeFragment
import com.techvista.apnajanver.Fragment.NotificationFragment
import com.techvista.apnajanver.Fragment.ProfileFragment
import com.techvista.apnajanver.Fragment.WhishlistFragment
import com.techvista.apnajanver.R
import com.techvista.apnajanver.models.Login.loginRequest


import com.techvista.apnajanver.api.RetrofitClientApplication
import com.techvista.apnajanver.adapter.ProductAdapter
import com.techvista.apnajanver.databinding.ActivityMainBinding
import com.techvista.apnajanver.utils.NetworkResult
import com.techvista.apnajanver.viewmodels.MainViewModel
import com.techvista.apnajanver.viewmodels.MainViewModelFactory
import java.util.Locale

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    lateinit var mainViewModel: MainViewModel
    lateinit var binding: ActivityMainBinding
    companion object{
        lateinit var activity: MainActivity
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContentView(R.layout.activity_main)
        activity=this

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = (application as RetrofitClientApplication).repository
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository))
            .get(MainViewModel::class.java)


        alerdiloag()

        loadFragment(HomeFragment())
        val navigation: BottomNavigationView = findViewById(R.id.bottom_navigations)
        navigation.setOnNavigationItemSelectedListener(this@MainActivity)
    }


    private fun loadFragment(fragment: Fragment?): Boolean {
        //switching fragment
        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (item.itemId) {
            R.id.page_1 -> fragment = HomeFragment()
            R.id.page_2 -> fragment = WhishlistFragment()
            R.id.page_3 -> fragment = NotificationFragment()
            R.id.page_4 -> fragment = ProfileFragment()
            else -> throw IllegalStateException("Unexpected value: " + item.itemId)
        }
        return loadFragment(fragment)
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
            MainActivity.activity,
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