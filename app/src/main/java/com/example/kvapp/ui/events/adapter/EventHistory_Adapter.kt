package com.example.kvapp.ui.events.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.kvapp.R
import com.example.kvapp.ui.events.Event_Det_Fragment


class EventHistory_Adapter(var EventList:List<String>, private val context: Context,var i: Int =0) : RecyclerView.Adapter<EventHistoryHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventHistoryHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(com.example.kvapp.R.layout.event_recyclerview_row, parent, false)

        return EventHistoryHolder(view,context)
    }

    override fun getItemCount(): Int {
        return EventList.size
    }

    override fun onBindViewHolder(holder: EventHistoryHolder, position: Int) {
        holder.onBind(EventList[position])
    }
}

class EventHistoryHolder (view: View, private val context: Context) : RecyclerView.ViewHolder(view) {
    fun onBind(EventItem:String){
        val eventName=itemView.findViewById<TextView>(com.example.kvapp.R.id.event_name)
        val eventImage=itemView.findViewById<ImageView>(com.example.kvapp.R.id.event_image)
        eventName.text=EventItem
        val  eventDet= Event_Det_Fragment()
        itemView.setOnClickListener {
            clickitem(EventItem)
            pushFragment(eventDet,context)
            Log.d("ksk",findNavController(it).currentDestination.toString()
            )
        }


    }

    private fun clickitem(EventItem: String){
        Toast.makeText(context,EventItem,Toast.LENGTH_SHORT).show()

    }
}

fun pushFragment(newFragment: Fragment, context: Context) {
    //TODO : replace fragment didn't work correctly
//    val close = (context as FragmentActivity).supportFragmentManager.popBackStack()
    val transaction = (context as FragmentActivity).supportFragmentManager.beginTransaction()
    transaction.replace(R.id.main_eve_fra,newFragment)
    transaction.addToBackStack(null)
    transaction.commit()

}


