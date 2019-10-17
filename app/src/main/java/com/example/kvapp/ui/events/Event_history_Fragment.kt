package com.example.kvapp.ui.events


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kvapp.R
import com.example.kvapp.ui.events.adapter.EventHistory_Adapter

class Event_history_Fragment : Fragment() {
    val EventList= listOf(
        "K'20 Participants Recruitment",
        "K'20 Members Recruitment",
        "K'20 HighBoard Recruitment",
        "Career Launcher 6.0 ",
        "K'19 Opening "
    )
    val eventDetails=Event_Det_Fragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_event_history_, container, false)
        val re= view.findViewById<RecyclerView>(R.id.event_history_recyclerView)
        re.adapter=EventHistory_Adapter(EventList,context!!)
        re.layoutManager=LinearLayoutManager(activity)
        re.setOnClickListener {
            setFragment(eventDetails)
        }
        return view
    }

    private fun setFragment(Fra: Fragment) {
        val trans=childFragmentManager.beginTransaction()
        trans.replace(R.id.event_history_fra,Fra).commit()
    }


}
