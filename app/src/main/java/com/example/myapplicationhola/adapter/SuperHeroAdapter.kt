package com.example.myapplicationhola.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationhola.R
import com.example.myapplicationhola.SuperHeroModel.SuperHeroModel
import com.example.myapplicationhola.superHeroProvider.SuperHeroProvider.Companion.superHeroList
import com.example.myapplicationhola.viewHolder.SuperHeroViewHolder


class SuperHeroAdapter(var superHeroList:List<SuperHeroModel> ) :
        RecyclerView.Adapter<SuperHeroViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero_cell,parent,false))
    }

    override fun getItemCount(): Int = superHeroList.size
    // Esto devuelve el tamaño de la lista. siempre lo mismo

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item) // el render es para "pintar" el elemento.
    }


}