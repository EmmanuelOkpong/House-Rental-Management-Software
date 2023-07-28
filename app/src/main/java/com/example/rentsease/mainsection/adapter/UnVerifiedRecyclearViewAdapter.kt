package com.example.rentsease.mainsection.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rentsease.R
import com.example.rentsease.mainsection.data.House

class UnVerifiedRecyclearViewAdapter (private val houseList:ArrayList<House>):
    RecyclerView.Adapter<UnVerifiedRecyclearViewAdapter.UnverifiedHouseViewHolder>() {

    class UnverifiedHouseViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val leftHousePicture: ImageView =itemView.findViewById(R.id.leftHousePics)
        val leftHousePrice: TextView =itemView.findViewById(R.id.leftHousePrice)
        val leftHouseDes: TextView =itemView.findViewById(R.id.leftHouseDes)

        val rightHousePicture: ImageView =itemView.findViewById(R.id.rightHousePics)
        val rightHousePrice: TextView =itemView.findViewById(R.id.rightHousePrice)
        val rightHouseDes: TextView =itemView.findViewById(R.id.rightHouseDes)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): UnverifiedHouseViewHolder { val view=
        LayoutInflater.from(parent.context).inflate(R.layout.unverifiedhouseitem,parent,false)
        return UnverifiedHouseViewHolder(view)
    }

    override fun getItemCount(): Int {
      return houseList.size
    }

    override fun onBindViewHolder(
        holder: UnverifiedHouseViewHolder,
        position: Int) {
        val house=houseList[position]
        holder.leftHousePicture.setImageResource(house.leftHouseImage)
        holder.leftHouseDes.text=house.leftHouseDes
        holder.leftHousePrice.text=house.leftHousePrice

        holder.rightHousePicture.setImageResource(house.rightHouseImage)
        holder.rightHouseDes.text=house.rightHouseDes
        holder.rightHousePrice.text=house.rightHousePrice
    }

}
