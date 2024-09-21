/*
 * *
 *  * Created by Rohan Programmer on 4/21/24, 1:39 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/21/24, 1:39 PM
 *
 */

package com.techvista.apnajanver.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.databinding.ItemCategoryBinding
import com.techvista.apnajanver.databinding.NotificationRvBinding

class NotificationAdapter(var context: Context):RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {
    inner class ViewHolder(var binding:NotificationRvBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = NotificationRvBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
 return 5
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }
}