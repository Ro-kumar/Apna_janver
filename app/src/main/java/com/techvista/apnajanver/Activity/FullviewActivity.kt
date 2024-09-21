/*
 * *
 *  * Created by Rohan Programmer on 4/23/24, 3:07 AM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/23/24, 3:07 AM
 *
 */

package com.techvista.apnajanver.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.skydoves.elasticviews.ElasticButton
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.AnimalListAdapter
import com.techvista.apnajanver.adapter.RelatvieDataAdapter
import com.techvista.apnajanver.adapter.TabCategoryAdapter
import com.techvista.apnajanver.adapter.WishlistAdapter
import com.techvista.apnajanver.databinding.ActivityFullviewBinding

class FullviewActivity : AppCompatActivity() {

    lateinit var binding: ActivityFullviewBinding

    companion object{
        lateinit var activity: FullviewActivity
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fullview)
        activity=this

        binding = ActivityFullviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)


        binding.back.setOnClickListener { finish() }

      val adapter=
            AnimalListAdapter(applicationContext)
        val gridLayoutManager8 =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        binding.rvAnimale.layoutManager = gridLayoutManager8
        binding.rvAnimale.setHasFixedSize(true)
        binding.rvAnimale.itemAnimator = DefaultItemAnimator()
        binding.rvAnimale.adapter = adapter
//        tabCategoryAdapter.notifyDataSetChanged()

        relaytive()


        binding.enquiryBtn.setOnClickListener {
            enquiry()
        }

        binding.chate.setOnClickListener {

            val intent = Intent(this@FullviewActivity, CheatingActivity::class.java)
            startActivity(intent)
        }

    }


    fun relaytive() {
        val adpter8 = RelatvieDataAdapter(
           applicationContext
        )
        val gridLayoutManager8 =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL,false)
        binding.relaytiveRv.layoutManager = gridLayoutManager8
        binding.relaytiveRv.setHasFixedSize(true)
        binding.relaytiveRv.itemAnimator = DefaultItemAnimator()
        binding.relaytiveRv.adapter = adpter8


    }


    fun enquiry() {
        val builder = androidx.appcompat.app.AlertDialog.Builder(
            FullviewActivity.activity,
            R.style.CustomAlertDialog
        ).create()
        val sheetView = layoutInflater.inflate(R.layout.enquiry_layout, null)
        builder.setView(sheetView)
        builder.setCanceledOnTouchOutside(false)


        val close = sheetView.findViewById<ImageView>(R.id.close)
        val btn_submit = sheetView.findViewById<ElasticButton>(R.id.btn_submit)

        close.setOnClickListener {
            builder.dismiss()
        }

        btn_submit.setOnClickListener {
            builder.dismiss()
        }


        builder.show()
    }
}