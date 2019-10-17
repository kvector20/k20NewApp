package com.example.kvapp.ui.magazine.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kvapp.R

class Person_Adapter(var authorList:List<String>,val context: Context) :RecyclerView.Adapter<PersonHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.magazine_person_recyclerview_row, parent, false)
        return PersonHolder(view,context)
    }

    override fun getItemCount(): Int {
        return authorList.size
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        holder.onBind(authorList[position])
    }

}

class PersonHolder(view: View, private val context: Context): RecyclerView.ViewHolder(view) {
    fun onBind(AuthorItem:String){
        val authorName=itemView.findViewById<TextView>(R.id.author_name)
        val authorImage=itemView.findViewById<ImageView>(R.id.article_image)
        val numOfArtical=itemView.findViewById<TextView>(R.id.numOfArticle)
        authorName.text=AuthorItem
        itemView.setOnClickListener{
            clickitem(AuthorItem)
        }
    }

    private fun clickitem(AuthorItem: String){
        Toast.makeText(context,AuthorItem, Toast.LENGTH_SHORT).show()
    }

}
