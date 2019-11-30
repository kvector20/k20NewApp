package com.example.kvectorapp.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.kvapp.ui.events.Event_history_Fragment
import com.example.kvapp.ui.events.Event_upComing_Fragment
import com.fxn.OnBubbleClickListener
import kotlinx.android.synthetic.main.fragment_main_magazine.*



open class EventFragment : Fragment() {

    private lateinit var eventViewModel: EventViewModel

    val  history= Event_history_Fragment()
    val upComing = Event_upComing_Fragment()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        eventViewModel =
                ViewModelProviders.of(this).get(EventViewModel::class.java)
        val root = inflater.inflate(com.example.kvapp.R.layout.fragment_event, container, false)
        eventViewModel.text.observe(this, Observer {
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragment(history)
        bubbleTabBar.addBubbleListener(object : OnBubbleClickListener {
            override fun onBubbleClick(id: Int) {
                when (id) {
                    com.example.kvapp.R.id.event_history->setFragment(history)
                    com.example.kvapp.R.id.event_upcoming ->setFragment(upComing)
                }
            }
        })
    }
    private fun setFragment(Fra: Fragment) {

        val trans=childFragmentManager.beginTransaction()
        trans.replace(com.example.kvapp.R.id.eve_frag,Fra).commit()
    }

}