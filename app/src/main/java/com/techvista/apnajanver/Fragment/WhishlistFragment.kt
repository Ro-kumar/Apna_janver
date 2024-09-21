package com.techvista.apnajanver.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.NearByAdapter
import com.techvista.apnajanver.adapter.WishlistAdapter
import com.techvista.apnajanver.databinding.FragmentWhishlistBinding



class WhishlistFragment : Fragment() {
    lateinit var binding: FragmentWhishlistBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWhishlistBinding.inflate(layoutInflater)

        whishlit()

        return binding.root
    }
    fun whishlit() {
        val adpter8 = WishlistAdapter(
            requireContext()
        )
        val gridLayoutManager8 =
            GridLayoutManager(requireContext(), 2,)
        binding.recyclerWishlist.layoutManager = gridLayoutManager8
        binding.recyclerWishlist.setHasFixedSize(true)
        binding.recyclerWishlist.itemAnimator = DefaultItemAnimator()
        binding.recyclerWishlist.adapter = adpter8


    }


}