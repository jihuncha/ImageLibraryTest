package com.huni.imagelibrarytestapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.huni.imagelibrarytestapp.R
import com.huni.imagelibrarytestapp.databinding.ItemRecyclerviewImageBinding

//Item 요소들을 담을 RecyclerViewAdapter
class RecyclerViewAdapter(val mContext: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class RecyclerViewViewHolder(val binding: ItemRecyclerviewImageBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        return RecyclerViewViewHolder(
            ItemRecyclerviewImageBinding.inflate(
                LayoutInflater.from(mContext),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as RecyclerViewViewHolder).binding

        binding.itemMainImageView.setImageDrawable(mContext.getDrawable(R.drawable.ic_launcher_background))
    }

    override fun getItemCount(): Int {
        return 1
    }
}