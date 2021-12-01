package com.huni.imagelibrarytestapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.huni.imagelibrarytestapp.databinding.FragmentMainViewBinding

class CoilFragment : Fragment() {
    private lateinit var binding : FragmentMainViewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainViewBinding.inflate(layoutInflater)

        return binding.root
    }
}