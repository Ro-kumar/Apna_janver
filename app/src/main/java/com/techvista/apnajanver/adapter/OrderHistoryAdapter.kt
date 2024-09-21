/*
 * *
 *  * Created by Rohan Programmer on 4/25/24, 6:30 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/25/24, 6:30 PM
 *
 */

package com.techvista.apnajanver.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.databinding.MyoderRvBinding


class OrderHistoryAdapter(var context: Context) :
    RecyclerView.Adapter<OrderHistoryAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: MyoderRvBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var binding = MyoderRvBinding.inflate(LayoutInflater.from(p0.context), p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
//        p0.binding.txtTitle.text = list[p1].name
//        p0.binding.imageView.setImageResource(list[p1].img)
//
//
//        p0.binding.item.setOnClickListener {
//            var intent= Intent(context, SubCategoryActivity::class.java)
//            intent.flags= Intent.FLAG_ACTIVITY_NEW_TASK
//            intent.putExtra("title",list[p1].name)
//            intent.putExtra("postion",p1.toString())
//            context.startActivity(intent)
//        }
    }
}