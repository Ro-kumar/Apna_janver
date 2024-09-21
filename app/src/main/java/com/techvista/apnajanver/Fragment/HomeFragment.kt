/*
 * *
 *  * Created by Rohan Programmer on 4/20/24, 4:28 PM
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 4/20/24, 4:28 PM
 *
 */

package com.techvista.apnajanver.Fragment

import alirezat775.carouselview.sample.SampleModel
import alirezat775.lib.carouselview.Carousel
import alirezat775.lib.carouselview.CarouselLazyLoadListener
import alirezat775.lib.carouselview.CarouselListener
import alirezat775.lib.carouselview.CarouselView
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.app.ActivityCompat.recreate
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.skydoves.elasticviews.ElasticButton
import com.techvista.apnajanver.Activity.AllNearByActivity
import com.techvista.apnajanver.Activity.CategoryFullActivity
import com.techvista.apnajanver.Activity.MainActivity
import com.techvista.apnajanver.Activity.SearchActivity
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.CategoryAdapter
import com.techvista.apnajanver.adapter.NearByAdapter
import com.techvista.apnajanver.adapter.SampleAdapter
import com.techvista.apnajanver.databinding.FragmentHomeBinding
import com.techvista.mvvmtest.models.Category.CategoryModel
import java.util.Locale


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    private val textToAnimate = "Cow, Hen, Goat, Buffalo"
    private val animationDelay: Long = 100
    private var hasNextPage: Boolean = true
    val TAG: String = this::class.java.name

    var categoryModel: MutableList<CategoryModel> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)

        animateText()
        banner()
        category()
        nearby()



        binding.catViewall.setOnClickListener {
            val intent = Intent(requireContext(), CategoryFullActivity::class.java)
            startActivity(intent)
        }

        binding.search.setOnClickListener {
            val intent = Intent(requireContext(), SearchActivity::class.java)
            startActivity(intent)
        }

        binding.txtViewall.setOnClickListener {
            val intent = Intent(requireContext(), AllNearByActivity::class.java)
            startActivity(intent)
        }

        binding.langauage.setOnClickListener { alerdiloag() }

        return binding.root
    }

    private fun animateText() {
        val handler = Handler(Looper.getMainLooper())
        var index = 0

        handler.post(object : Runnable {
            override fun run() {
                binding.edSearch.text = textToAnimate.subSequence(0, index++)
                if (index <= textToAnimate.length) {
                    handler.postDelayed(this, animationDelay)
                } else {
                    // Reset index and call animateText() again after a delay
                    index = 0
                    handler.postDelayed(this, 1000)
                }
            }
        })
    }

    fun banner() {
        val adapter = SampleAdapter()
        val carousel = Carousel(MainActivity.activity, binding.carouselView, adapter)
        carousel.setOrientation(CarouselView.HORIZONTAL, false)
        carousel.autoScroll(true, 3000, true)
        carousel.scaleView(true)
        carousel.lazyLoad(true, object : CarouselLazyLoadListener {
            override fun onLoadMore(page: Int, totalItemsCount: Int, view: CarouselView) {
                if (hasNextPage) {
                    Log.d(TAG, "load new item on lazy mode")
                    hasNextPage = false
                }
            }
        })
        adapter.setOnClickListener(object :
            SampleAdapter.OnClick {
            override fun click(model: SampleModel) {
                carousel.remove(model)
            }
        })

        carousel.addCarouselListener(object : CarouselListener {
            override fun onPositionChange(position: Int) {
                Log.d(TAG, "currentPosition : $position")
            }

            override fun onScroll(dx: Int, dy: Int) {
                Log.d(TAG, "onScroll dx : $dx -- dy : $dx")
            }
        })
        carousel.add(SampleModel(R.drawable.cow))
        carousel.add(SampleModel(R.drawable.hen))
        carousel.add(SampleModel(R.drawable.beffelow))
        carousel.add(SampleModel(R.drawable.goat))
        carousel.add(SampleModel(R.drawable.horse))

    }

    fun category() {
        categoryModel.add(CategoryModel(1, R.drawable.cow_cat, getString(R.string.cow)))
        categoryModel.add(CategoryModel(2, R.drawable.hen_cat, getString(R.string.hen)))
        categoryModel.add(CategoryModel(3, R.drawable.horse_cat, getString(R.string.horse)))
        categoryModel.add(CategoryModel(4, R.drawable.beffelo_cat, getString(R.string.buffalo)))
        categoryModel.add(CategoryModel(5, R.drawable.egg_cat, getString(R.string.egg)))
        categoryModel.add(CategoryModel(6, R.drawable.mouse, getString(R.string.mouse)))
        categoryModel.add(CategoryModel(7, R.drawable.cat_catogy, getString(R.string.cat)))
        categoryModel.add(CategoryModel(8, R.drawable.dog_cat, getString(R.string.dog)))


        val adpter8 = CategoryAdapter(
            requireContext(), categoryModel
        )
        val gridLayoutManager8 =
            GridLayoutManager(requireContext(), 4)
        binding.recyclerCategory.layoutManager = gridLayoutManager8
        binding.recyclerCategory.setHasFixedSize(true)
        binding.recyclerCategory.itemAnimator = DefaultItemAnimator()
        binding.recyclerCategory.adapter = adpter8

    }

    fun nearby() {
        val adpter8 = NearByAdapter(
            requireContext()
        )
        val gridLayoutManager8 =
            GridLayoutManager(requireContext(), 1)
        binding.recyclerNearyby.layoutManager = gridLayoutManager8
        binding.recyclerNearyby.setHasFixedSize(true)
        binding.recyclerNearyby.itemAnimator = DefaultItemAnimator()
        binding.recyclerNearyby.adapter = adpter8


    }


    fun setLocal(language: String) {
        val locale = Locale(language)
        val config = Configuration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
        recreate(requireActivity())

    }


    fun alerdiloag() {
        val builder = androidx.appcompat.app.AlertDialog.Builder(
            requireContext(),
            R.style.CustomAlertDialog
        ).create()
        val sheetView = layoutInflater.inflate(R.layout.tranlaterlayout_diloag, null)
        builder.setView(sheetView)
        builder.setCanceledOnTouchOutside(false)

        val hindi = sheetView.findViewById<LinearLayout>(R.id.hindi)
        val english = sheetView.findViewById<LinearLayout>(R.id.english)
        val close = sheetView.findViewById<ImageView>(R.id.close)
        val btn_submit = sheetView.findViewById<ElasticButton>(R.id.btn_submit)

        close.setOnClickListener {
            builder.dismiss()
        }

        btn_submit.setOnClickListener {
            builder.dismiss()
        }
        hindi.setOnClickListener {

            setLocal("hi")
        }

        english.setOnClickListener {
            setLocal("en")
        }

        builder.show()
    }

}