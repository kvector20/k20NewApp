package com.example.kvectorapp.ui.magazine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.kvapp.R
import com.example.kvectorapp.ui.home.HomeViewModel
import com.fxn.OnBubbleClickListener
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_main_magazine.*

class MainMagazineFragment : Fragment(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {

        return true
    }

    val featured=FeaturedFragment()
    val person =PersonFragment()
    val issues=Issues_Fragment()



    private lateinit var magazineViewModel: MagazineViewModel
    lateinit var homeViewModel: HomeViewModel

    val observer: Observer<String> =
        Observer { t -> handleString(t) }


    private fun handleString(t: String?) {
        Toast.makeText(activity, t, Toast.LENGTH_LONG).show()
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        magazineViewModel = ViewModelProviders.of(this).get(MagazineViewModel::class.java)
        homeViewModel = ViewModelProviders.of(this)[HomeViewModel::class.java]
        val root = inflater.inflate(R.layout.fragment_main_magazine, container, false)
        magazineViewModel.text.observe(this, Observer {
        })
        homeViewModel.text.observe(this, observer)
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragment(featured)
        bubbleTabBar.addBubbleListener(object : OnBubbleClickListener {
            override fun onBubbleClick(id: Int) {
                when (id) {
                    R.id.magazine_featured ->setFragment(featured)
                    R.id.magazine_person ->setFragment(person)
                    R.id.magazine_issues ->setFragment(issues)
                }
            }
        })
    }

     fun setFragment(Fra: Fragment) {

       val trans=childFragmentManager.beginTransaction()
        trans.replace(R.id.mag_frag,Fra).commit()
    }
}
