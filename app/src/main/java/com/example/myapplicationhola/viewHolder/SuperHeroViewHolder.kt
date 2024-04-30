package com.example.myapplicationhola.viewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplicationhola.R
import com.example.myapplicationhola.SuperHeroModel.SuperHeroModel

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.superHeroName)
    val author = view.findViewById<TextView>(R.id.superHeroAuthor)
    val photo = view.findViewById<ImageView>(R.id.superheroimageview)

    fun render (model:SuperHeroModel){
        name.text=model.name
        author.text=model.author
        Glide.with(photo.context).load(model.image).into(photo)
    }

}