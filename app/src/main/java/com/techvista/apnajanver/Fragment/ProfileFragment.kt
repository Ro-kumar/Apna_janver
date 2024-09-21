package com.techvista.apnajanver.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.techvista.apnajanver.Activity.AboutActivity
import com.techvista.apnajanver.Activity.ChatMammberListActivity
import com.techvista.apnajanver.Activity.ContactUsActivity
import com.techvista.apnajanver.Activity.MyBookingActivity
import com.techvista.apnajanver.Activity.SellActivity
import com.techvista.apnajanver.Activity.WalletActivity
import com.techvista.apnajanver.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater)

        binding.lvlMybooking.setOnClickListener {

            val intent = Intent(requireContext(), MyBookingActivity::class.java)
            startActivity(intent)
        }
        binding.lvlWallet.setOnClickListener {

            val intent = Intent(requireContext(), WalletActivity::class.java)
            startActivity(intent)
        }
        binding.lvlContect.setOnClickListener {

            val intent = Intent(requireContext(), ContactUsActivity::class.java)
            startActivity(intent)
        }

        binding.lvlAbout.setOnClickListener {
            val intent = Intent(requireContext(), AboutActivity::class.java)
            intent.putExtra("title","about")
            startActivity(intent)
        }

        binding.lvlPrivacy.setOnClickListener {
            val intent = Intent(requireContext(), AboutActivity::class.java)
            intent.putExtra("title","privacy")
            startActivity(intent)
        }

        binding.lvlTrams.setOnClickListener {
            val intent = Intent(requireContext(), AboutActivity::class.java)
            intent.putExtra("title","tram")
            startActivity(intent)
        }

        binding.btnSell.setOnClickListener {
            val intent = Intent(requireContext(), SellActivity::class.java)
            startActivity(intent)
        }
       binding.lvlChat.setOnClickListener {
            val intent = Intent(requireContext(), ChatMammberListActivity::class.java)
            startActivity(intent)
        }



        binding.lvlShare.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.setAction(Intent.ACTION_SEND)
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Install the app Now : " + "https://play.google.com/store/apps/details?id=com.techvista.apnajanver" +" Refer ID:- Apn564"
            )
            sendIntent.setType("text/plain")
            val shareIntent = Intent.createChooser(sendIntent, "Share via")
            startActivity(shareIntent)
        }

        return binding.root
    }


}