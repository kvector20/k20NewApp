package com.example.kvapp.ui.magazine.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kvapp.R

class Featured_Adapter(var FeaturedList:List<String>, private val context: Context) : RecyclerView.Adapter<FeaturedHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeaturedHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.magazine_featured_recyclerview_row, parent, false)
        return FeaturedHolder(view,context)
    }

    override fun getItemCount(): Int {
        return FeaturedList.size
    }

    override fun onBindViewHolder(holder: FeaturedHolder, position: Int) {
        holder.onBind(FeaturedList[position])
    }
}

class FeaturedHolder (view: View, private val context: Context) : RecyclerView.ViewHolder(view){
    fun onBind(FeaturedItem:String){
        val articleName=itemView.findViewById<TextView>(R.id.article_name)
        val articleImage=itemView.findViewById<ImageView>(R.id.article_image)
        articleName.text=FeaturedItem
        itemView.setOnClickListener{
            clickitem(FeaturedItem)
        }
    }

    private fun clickitem(featuredItem: String){
        Toast.makeText(context,featuredItem,Toast.LENGTH_SHORT).show()
    }
}
