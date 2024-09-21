/*
 * *
 *  * Created by Rohan Programmer on 4/25/24, 5:20 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/25/24, 5:19 PM
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
import com.techvista.apnajanver.adapter.AllCategoryAdapter
import com.techvista.apnajanver.adapter.CategoryAdapter
import com.techvista.apnajanver.databinding.ActivityCategoryFullBinding
import com.techvista.mvvmtest.models.Category.CategoryModel

class CategoryFullActivity : AppCompatActivity() {
    lateinit var binding: ActivityCategoryFullBinding
    var categoryModel: MutableList<CategoryModel> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_category_full)
        binding = ActivityCategoryFullBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WindowCompat.setDecorFitsSystemWindows(window, true)


        binding.back.setOnClickListener { finish() }

        categoryModel.add(CategoryModel(1, R.drawable.cow_cat, getString(R.string.cow)))
        categoryModel.add(CategoryModel(2, R.drawable.hen_cat, getString(R.string.hen)))
        categoryModel.add(CategoryModel(3, R.drawable.horse_cat, getString(R.string.horse)))
        categoryModel.add(CategoryModel(4, R.drawable.beffelo_cat, getString(R.string.buffalo)))
        categoryModel.add(CategoryModel(5, R.drawable.egg_cat, getString(R.string.egg)))
        categoryModel.add(CategoryModel(6, R.drawable.mouse, getString(R.string.mouse)))
        categoryModel.add(CategoryModel(7, R.drawable.cat_catogy, getString(R.string.cat)))
        categoryModel.add(CategoryModel(8, R.drawable.dog_cat, getString(R.string.dog)))

        val adpter8 = AllCategoryAdapter(
            applicationContext, categoryModel
        )
        val gridLayoutManager8 =
            GridLayoutManager(applicationContext, 4)
        binding.fullcategoryRv.layoutManager = gridLayoutManager8
        binding.fullcategoryRv.setHasFixedSize(true)
        binding.fullcategoryRv.itemAnimator = DefaultItemAnimator()
        binding.fullcategoryRv.adapter = adpter8
    }
}