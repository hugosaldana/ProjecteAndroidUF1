package com.example.projecteandroiduf1.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.projecteandroiduf1.R
import com.example.projecteandroiduf1.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,
            R.layout.fragment_main,container,false)


        binding.button.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_mainFragment_to_LoginFragment)
            Log.i("Loginbutton", "Loginbutton press")
        }

        return binding.root
    }

}