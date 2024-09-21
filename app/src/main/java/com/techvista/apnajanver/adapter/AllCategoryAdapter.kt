/*
 * *
 *  * Created by Rohan Programmer on 4/25/24, 5:26 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/25/24, 5:26 PM
 *
 */

package com.techvista.apnajanver.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.Activity.SubCategoryActivity
import com.techvista.apnajanver.databinding.AllcategoryRvBinding
import com.techvista.apnajanver.databinding.ItemCategoryBinding
import com.techvista.mvvmtest.models.Category.CategoryModel

class AllCategoryAdapter(var context: Context, var list: MutableList<CategoryModel>) :
    RecyclerView.Adapter<AllCategoryAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: AllcategoryRvBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = AllcategoryRvBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding.txtTitle.text = list[p1].name
        p0.binding.imageView.setImageResource(list[p1].img)


        p0.binding.item.setOnClickListener {
            var intent= Intent(context, SubCategoryActivity::class.java)
            intent.flags= Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("title",list[p1].name)
            intent.putExtra("postion",p1.toString())
            context.startActivity(intent)
        }
    }
}