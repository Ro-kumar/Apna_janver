package com.techvista.apnajanver.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techvista.apnajanver.Activity.CheatingActivity

import com.techvista.apnajanver.databinding.MammberlistRvBinding

class MemmberListAdaper(var context: Context) :
    RecyclerView.Adapter<MemmberListAdaper.ViewHolder>() {
    inner class ViewHolder(var binding: MammberlistRvBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding =
            MammberlistRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.card.setOnClickListener {
            var intent = Intent(context, CheatingActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            context.startActivity(intent)
        }

    }
}