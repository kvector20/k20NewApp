package com.example.kvectorapp.ui.magazine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kvapp.R
import com.example.kvapp.ui.magazine.adapter.Featured_Adapter
import kotlinx.android.synthetic.main.fragment_featured.*

class FeaturedFragment : Fragment() {
    val FeaturedList= listOf(
        "article name 1","article name 2",
        "article name 3","article name 4",
        "article name 5","article name 6"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_featured, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        magazine_featured_recyclerView.apply {
            adapter= Featured_Adapter(FeaturedList,context)
            layoutManager=LinearLayoutManager(activity)
        }
    }

}
