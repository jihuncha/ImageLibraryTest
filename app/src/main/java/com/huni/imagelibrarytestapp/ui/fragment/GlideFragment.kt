package com.huni.imagelibrarytestapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.huni.imagelibrarytestapp.databinding.FragmentMainViewBinding

// fragment에서 viewBinding사용시 메모리 누수 위험
// https://developer.android.com/topic/libraries/view-binding#fragments
class GlideFragment : Fragment() {
//    private lateinit var binding : FragmentMainViewBinding

    private var _binding: FragmentMainViewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainViewBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}