package com.android.myvideo.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.android.myvideo.R
import com.android.myvideo.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initToolbar()
        binding.list.setOnClickListener { changeWeatherDataSet() }

    }

    private fun changeWeatherDataSet() {
        TODO("Not yet implemented")
    }

    private fun initToolbar() {
        TODO("Not yet implemented")
    }

}