package com.example.kvectorapp.ui.contactus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.kvapp.R

class ContactUsFragment : Fragment() {

    private lateinit var contactUsViewModel: ContactUsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contactUsViewModel =
                ViewModelProviders.of(this).get(ContactUsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_contactus, container, false)
        contactUsViewModel.text.observe(this, Observer {
        })
        return root
    }
}