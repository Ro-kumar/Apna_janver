/*
 * *
 *  * Created by Rohan Programmer on 4/25/24, 10:25 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/25/24, 10:25 PM
 *
 */

package com.techvista.apnajanver.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.databinding.AnimalelistRvBinding
import com.techvista.apnajanver.databinding.WalletHistoryLayoutBinding

class WalletAdapter(var context: Context):RecyclerView.Adapter<WalletAdapter.ViewHolder>() {
    inner class ViewHolder(var binding:WalletHistoryLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = WalletHistoryLayoutBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
  return 5
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }
}