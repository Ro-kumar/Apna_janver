package com.techvista.apnajanver.adapter


import alirezat775.carouselview.sample.EmptySampleModel
import alirezat775.carouselview.sample.SampleModel
import alirezat775.lib.carouselview.CarouselAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.techvista.apnajanver.R



class SampleAdapter : CarouselAdapter() {

    private val EMPTY_ITEM = 0
    private val NORMAL_ITEM = 1

    private var vh: CarouselViewHolder? = null
    var onClick: OnClick? = null

    fun setOnClickListener(onClick: OnClick?) {
        this.onClick = onClick
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItems()[position]) {
            is EmptySampleModel -> EMPTY_ITEM
            else -> NORMAL_ITEM
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == NORMAL_ITEM) {
            val v = inflater.inflate(R.layout.item_carousel, parent, false)
            vh = MyViewHolder(v)
            vh as MyViewHolder
        } else {
            val v = inflater.inflate(R.layout.item_empty_carousel, parent, false)
            vh = EmptyMyViewHolder(v)
            vh as EmptyMyViewHolder
        }
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        when (holder) {
            is MyViewHolder -> {
                vh = holder
                val model = getItems()[position] as SampleModel
                (vh as MyViewHolder).title.setImageResource(model.getId())

            }
            else -> {
                vh = holder
                val model = getItems()[position] as EmptySampleModel
                (vh as EmptyMyViewHolder).titleEmpty.text = model.getText()
            }
        }
    }

    inner class MyViewHolder(itemView: View) : CarouselViewHolder(itemView) {

        var title: ImageView = itemView.findViewById(R.id.item_text)

        init {
            title.setOnClickListener { onClick?.click(getItems()[adapterPosition] as SampleModel) }
        }

    }

    inner class EmptyMyViewHolder(itemView: View) : CarouselViewHolder(itemView) {
        var titleEmpty: TextView = itemView.findViewById(R.id.item_empty_text)
    }

    interface OnClick {
        fun click(model: SampleModel)
    }
}