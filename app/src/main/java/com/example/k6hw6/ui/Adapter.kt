package com.example.k6hw6.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.k6hw6.databinding.ItemBinding

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
    private var model = arrayListOf<model>()
    inner class ViewHolder(private var binding :ItemBinding) :RecyclerView.ViewHolder(binding.root){
        fun bind(model: model) {
            binding.text.text = model.result.toString()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model[position])
    }

    override fun getItemCount(): Int {
        return model.size
    }
}