/*
 * *
 *  * Created by Rohan Programmer on 4/23/24, 3:24 AM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/23/24, 3:24 AM
 *
 */

package com.techvista.apnajanver.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.databinding.AnimalelistRvBinding
import com.techvista.apnajanver.databinding.ItemCategoryBinding

class AnimalListAdapter(var context: Context):RecyclerView.Adapter<AnimalListAdapter.ViewHolder>() {
    inner class ViewHolder(var binding:AnimalelistRvBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = AnimalelistRvBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
   return 4
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }
}