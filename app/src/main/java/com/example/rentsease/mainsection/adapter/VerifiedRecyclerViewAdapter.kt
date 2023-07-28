package com.example.rentsease.mainsection.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.rentsease.R
import com.example.rentsease.mainsection.data.House

class VerifiedRecyclerViewAdapter (private val houseList:ArrayList<House>):
    RecyclerView.Adapter<VerifiedRecyclerViewAdapter.HouseViewHolder>(){

    class HouseViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val leftHousePicture:ImageView=itemView.findViewById(R.id.leftHousePics)
        val leftHousePrice:TextView=itemView.findViewById(R.id.leftHousePrice)
        val leftHouseDes:TextView=itemView.findViewById(R.id.leftHouseDes)

        val rightHousePicture:ImageView=itemView.findViewById(R.id.rightHousePics)
        val rightHousePrice:TextView=itemView.findViewById(R.id.rightHousePrice)
        val rightHouseDes:TextView=itemView.findViewById(R.id.rightHouseDes)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VerifiedRecyclerViewAdapter.HouseViewHolder { val view=LayoutInflater.from(parent.context).inflate(R.layout.verifieditems,parent,false)
        return HouseViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: VerifiedRecyclerViewAdapter.HouseViewHolder,
        position:  Int
    ) {
        val house=houseList[position]
        holder.leftHousePicture.setImageResource(house.leftHouseImage)
        holder.leftHouseDes.text=house.leftHouseDes
        holder.leftHousePrice.text=house.leftHousePrice

        holder.rightHousePicture.setImageResource(house.rightHouseImage)
        holder.rightHouseDes.text=house.rightHouseDes
        holder.rightHousePrice.text=house.rightHousePrice
    }

    override fun getItemCount(): Int {
        return houseList.size
    }
}