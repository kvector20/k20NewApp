package com.example.kvectorapp.ui.magazine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kvapp.R
import com.example.kvapp.ui.magazine.adapter.Person_Adapter
import kotlinx.android.synthetic.main.fragment_person.*


class PersonFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        magazine_person_recyclerView.apply {
            val AuthorList= listOf("Mohamed 1","Mohamed 2","Mohamed 3","Mohamed 4","Mohamed 5","Mohamed 6","Mohamed 7")
            adapter= Person_Adapter(AuthorList,context)
            layoutManager= LinearLayoutManager(activity)
        }
    }

}
