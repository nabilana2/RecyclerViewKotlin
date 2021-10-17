package com.example.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KartunAdapter (private val context : Context, private val Kartun: List<Kartun>, val listener: (Kartun)-> Unit)
    :RecyclerView.Adapter<KartunAdapter.KartunViewHolder>() {

    class KartunViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgKartun = view.findViewById<ImageView>(R.id.img_item_photo)
        val NameKartun = view.findViewById<TextView>(R.id.tv_item_name)
        val descKartun = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(kartun: Kartun, listener: (Kartun) -> Unit){
            imgKartun.setImageResource(kartun.imgKartun)
            NameKartun.text = kartun.NameKartun
            descKartun.text = kartun.descKartun
            itemView.setOnClickListener{
                listener(kartun)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KartunViewHolder {
        return KartunViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kartun, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KartunViewHolder, position: Int) {
        holder.bindView(Kartun[position],listener)
    }

    override fun getItemCount(): Int = Kartun.size
    }
