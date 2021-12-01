package com.huni.imagelibrarytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.huni.imagelibrarytestapp.databinding.ActivityMainBinding
import com.huni.imagelibrarytestapp.ui.adapter.FragmentPagerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        val TAG:String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        //어댑터 생성
        val adapter = FragmentPagerAdapter(this)

        binding.vpMain.adapter = adapter
    }
}