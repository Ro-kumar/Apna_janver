/*
 * *
 *  * Created by Rohan Programmer on 4/20/24, 9:26 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/20/24, 9:26 PM
 *
 */

package com.techvista.apnajanver.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.Activity.FullviewActivity
import com.techvista.apnajanver.Activity.SubCategoryActivity
import com.techvista.apnajanver.databinding.ItemCategoryBinding
import com.techvista.apnajanver.databinding.NearbyRvBinding

class NearByAdapter(var context:Context):RecyclerView.Adapter<NearByAdapter.ViewHolder>() {
    inner class ViewHolder(var binding:NearbyRvBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = NearbyRvBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return 5
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.binding.card.setOnClickListener {


                var intent= Intent(context, FullviewActivity::class.java)
                intent.flags= Intent.FLAG_ACTIVITY_NEW_TASK
//                intent.putExtra("title",list[p1].name)
//                intent.putExtra("postion",p1.toString())
                context.startActivity(intent)



        }

    }
}