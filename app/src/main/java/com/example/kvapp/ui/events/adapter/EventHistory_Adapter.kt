package com.example.kvapp.ui.events.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kvapp.R

class EventHistory_Adapter(var EventList:List<String>, private val context: Context) : RecyclerView.Adapter<EventHistoryHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventHistoryHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.event_recyclerview_row, parent, false)
        return EventHistoryHolder(view,context)
    }

    override fun getItemCount(): Int {
        return EventList.size
    }

    override fun onBindViewHolder(holder: EventHistoryHolder, position: Int) {
        holder.onBind(EventList[position])
    }
}

class EventHistoryHolder (view: View, private val context: Context) : RecyclerView.ViewHolder(view){
    fun onBind(EventItem:String){
        val eventName=itemView.findViewById<TextView>(R.id.event_name)
        val eventImage=itemView.findViewById<ImageView>(R.id.event_image)
        eventName.text=EventItem
        itemView.setOnClickListener{


            clickitem(EventItem)
        }
    }

    private fun clickitem(EventItem: String){
        Toast.makeText(context,EventItem,Toast.LENGTH_SHORT).show()

    }
}
