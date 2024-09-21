/*
 * *
 *  * Created by Rohan Programmer on 4/21/24, 2:06 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/21/24, 2:06 PM
 *
 */

package com.techvista.apnajanver.Activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.NearByAdapter
import com.techvista.apnajanver.adapter.TabCategoryAdapter
import com.techvista.apnajanver.databinding.ActivitySubCategoryBinding
import com.techvista.mvvmtest.models.Category.CategoryModel
import okhttp3.internal.notify

class SubCategoryActivity : AppCompatActivity(), TabCategoryAdapter.OnTabSelectedListener {
    lateinit var binding: ActivitySubCategoryBinding
    var categoryModel: MutableList<CategoryModel> = ArrayList()

    var title = ""


    var postion = ""
    lateinit var tabCategoryAdapter: TabCategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sub_category)
        binding = ActivitySubCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)



        subcategory()
        tabCategory()

        title = intent.getStringExtra("title").toString()
        postion = intent.getStringExtra("postion").toString()


        binding.title.text = title

        binding.back.setOnClickListener { finish() }


        binding.filter.setOnClickListener { v ->
            val menu = PopupMenu(applicationContext, v)
            menu.menu.add(Menu.NONE, 1, 1, getString(R.string.lowtohigh))
            menu.menu.add(Menu.NONE, 2, 2, getString(R.string.hightolow))
            menu.menu.add(Menu.NONE, 3, 3, getString(R.string.near_by))
            menu.show()
            menu.setOnMenuItemClickListener { item ->
                val i = item.itemId

                when (item.itemId) {
                    1 -> {

                        true
                    }

                    2 -> {

                        true
                    }

                    3 -> {

                        true
                    }

                    else -> {
                        true
                    }
                }


            }
        }


    }

    fun subcategory() {
        val adpter8 = NearByAdapter(
            applicationContext
        )
        val gridLayoutManager8 =
            GridLayoutManager(applicationContext, 1)
        binding.recyclerSubcategory.layoutManager = gridLayoutManager8
        binding.recyclerSubcategory.setHasFixedSize(true)
        binding.recyclerSubcategory.itemAnimator = DefaultItemAnimator()
        binding.recyclerSubcategory.adapter = adpter8


    }

    @SuppressLint("NotifyDataSetChanged")
    fun tabCategory() {
        categoryModel.add(CategoryModel(0, R.drawable.cow_cat, getString(R.string.cow)))
        categoryModel.add(CategoryModel(1, R.drawable.hen_cat, getString(R.string.hen)))
        categoryModel.add(CategoryModel(2, R.drawable.horse_cat, getString(R.string.horse)))
        categoryModel.add(CategoryModel(3, R.drawable.beffelo_cat, getString(R.string.buffalo)))
        categoryModel.add(CategoryModel(4, R.drawable.egg_cat, getString(R.string.egg)))
        categoryModel.add(CategoryModel(5, R.drawable.mouse, getString(R.string.mouse)))
        categoryModel.add(CategoryModel(6, R.drawable.cat_catogy, getString(R.string.cat)))
        categoryModel.add(CategoryModel(7, R.drawable.dog_cat, getString(R.string.dog)))


        tabCategoryAdapter =
            TabCategoryAdapter(applicationContext, categoryModel, this@SubCategoryActivity)
        val gridLayoutManager8 =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        binding.tabcatgoryRv.layoutManager = gridLayoutManager8
        binding.tabcatgoryRv.setHasFixedSize(true)
        binding.tabcatgoryRv.itemAnimator = DefaultItemAnimator()
        binding.tabcatgoryRv.adapter = tabCategoryAdapter
        tabCategoryAdapter.notifyDataSetChanged()


    }

    @SuppressLint("NotifyDataSetChanged")
    override fun OnTabSelectedListener(
        position: Int,
        list: MutableList<CategoryModel>,
        holder: TabCategoryAdapter.ViewHolder
    ) {


        if (list[position].id.toString().equals(postion)) {
            holder.binding.name.setTextColor(
                ContextCompat.getColor(
                    applicationContext,
                    R.color.red
                )
            )
            holder.binding.viewText.visibility = View.VISIBLE
        } else {
            holder.binding.name.setTextColor(
                ContextCompat.getColor(
                    applicationContext,
                    R.color.black
                )
            )
            holder.binding.viewText.visibility = View.GONE
        }

        holder.itemView.setOnClickListener {
            postion = list[position].id.toString()
            holder.binding.name.setTextColor(
                ContextCompat.getColor(
                    applicationContext,
                    R.color.red
                )
            )
            holder.binding.viewText.visibility = View.VISIBLE
            tabCategoryAdapter.notifyDataSetChanged()
        }

    }

}