package com.huni.imagelibrarytestapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.huni.imagelibrarytestapp.databinding.FragmentMainViewBinding
import com.huni.imagelibrarytestapp.ui.adapter.RecyclerViewAdapter

// fragment에서 viewBinding사용시 메모리 누수 위험
// https://developer.android.com/topic/libraries/view-binding#fragments
class GlideFragment : Fragment() {
//    private lateinit var binding : FragmentMainViewBinding

    private var _binding: FragmentMainViewBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainViewBinding.inflate(layoutInflater, container, false)

        initView()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun initView() {
        recyclerViewAdapter = RecyclerViewAdapter(requireContext())

        //GridLayout 사용
        val layoutManager = GridLayoutManager(context, 3);

        binding.rvImageList.layoutManager = layoutManager
        binding.rvImageList.adapter = recyclerViewAdapter
    }
}

