package com.techvista.apnajanver.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.techvista.apnajanver.R
import com.techvista.apnajanver.adapter.CategoryAdapter
import com.techvista.apnajanver.adapter.NotificationAdapter
import com.techvista.apnajanver.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {

lateinit var binding:FragmentNotificationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= FragmentNotificationBinding.inflate(layoutInflater)

        val adpter8 = NotificationAdapter(
            requireContext()
        )
        val gridLayoutManager8 =
            GridLayoutManager(requireContext(), 1)
        binding.notificationRv.layoutManager = gridLayoutManager8
        binding.notificationRv.setHasFixedSize(true)
        binding.notificationRv.itemAnimator = DefaultItemAnimator()
        binding.notificationRv.adapter = adpter8


        return binding.root
    }


}