/*
 * *
 *  * Created by Rohan Programmer on 4/21/24, 8:52 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/21/24, 8:52 PM
 *
 */

package com.techvista.apnajanver.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.techvista.apnajanver.Activity.SubCategoryActivity
import com.techvista.apnajanver.R
import com.techvista.apnajanver.databinding.NotificationRvBinding
import com.techvista.apnajanver.databinding.TabcategoryRvBinding
import com.techvista.mvvmtest.models.Category.CategoryModel

class TabCategoryAdapter(var context: Context, var list: MutableList<CategoryModel>,   private val listener: OnTabSelectedListener) :
    RecyclerView.Adapter<TabCategoryAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: TabcategoryRvBinding) :
        RecyclerView.ViewHolder(binding.root)


    interface OnTabSelectedListener {
        @SuppressLint("NotConstructor")
        fun OnTabSelectedListener(
            position: Int,
            list: MutableList<CategoryModel>,
            holder: ViewHolder

        )
    }

    private fun OnTabSelectedListener(
        position: Int, list: MutableList<CategoryModel>, holder: ViewHolder
    ) {
        listener.OnTabSelectedListener(position, list, holder)
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = TabcategoryRvBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binding.name.text = list[p1].name


        OnTabSelectedListener(p1,list,p0)


//        Log.e("postion",list[p1].id.toString()+" "+SubCategoryActivity.postion.toString())
//        if (list[p1].id.toString().equals( SubCategoryActivity.postion)){
//         p0.binding.name.setTextColor(ContextCompat.getColor(context,R.color.red))
//        }
//        else{
//            p0.binding.name.setTextColor(ContextCompat.getColor(context,R.color.black))
//        }
//        if (p1==0){
//            p0.binding.name.setTextColor(ContextCompat.getColor(context,R.color.red))
//        }else{
//            p0.binding.name.setTextColor(ContextCompat.getColor(context,R.color.black))
//        }
//
//        p0.itemView.setOnClickListener {
//            SubCategoryActivity.postion = list[p1].id.toString()
//            notifyDataSetChanged()
//        }


    }
}