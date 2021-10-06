package com.example.meuprimeiroapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meuprimeiroapp.R

class CachorroAdapter (private val listCachorro: List<Cachorro>):RecyclerView.Adapter<CachorroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CachorroViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.cachorro_item_layout, parent, false )
        return CachorroViewHolder(view)
    }

    override fun onBindViewHolder(holder: CachorroViewHolder, position: Int)  =
        holder.bind(listCachorro[position])




    override fun getItemCount(): Int = listCachorro.size

}

