package com.example.meuprimeiroapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meuprimeiroapp.R




class CachorroViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    private val Cachorro = itemView.findViewById<ImageView>(R.id.cachorroFragment)
    private val name = itemView.findViewById<TextView>(R.id.cachorroFragment)

    fun bind(cachorro: Cachorro){
        Cachorro.setImageResource(cachorro.image)
        name.text = cachorro.name
    }

}



