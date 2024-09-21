/*
 * *
 *  * Created by Rohan Programmer on 4/25/24, 5:14 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/25/24, 5:14 PM
 *
 */

package com.techvista.apnajanver.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.databinding.RelativeRvBinding
import com.techvista.apnajanver.databinding.WishlistRvBinding


class RelatvieDataAdapter(var context: Context): RecyclerView.Adapter<RelatvieDataAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: RelativeRvBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = RelativeRvBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }
}