package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.practica2.adapters.PagerAdapter
import com.example.practica2.fragments.BebidasFragment
import com.example.practica2.fragments.FrutasFragment
import com.example.practica2.fragments.VerdurasFragment
import com.example.practica2.fragments.ViveresFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_frutas.*

class MainActivity : AppCompatActivity() {

    lateinit var tv:Toolbar
    var prevMenu:MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = appBar as Toolbar
        tv.title = getString(R.string.frutas)

        setPager(getPA())
        setNav()
    }

    private fun getPA():PagerAdapter{
        val adapter = PagerAdapter(supportFragmentManager)
        adapter.addFrag(FrutasFragment())
        adapter.addFrag(VerdurasFragment())
        adapter.addFrag(ViveresFragment())
        adapter.addFrag(BebidasFragment())
        return adapter
    }

    private fun setPager(adapter:PagerAdapter){
        pager.adapter = adapter
        pager.offscreenPageLimit = adapter.count
        pager.addOnPageChangeListener(object:ViewPager.OnPageChangeListener{
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageSelected(position: Int) {
                prevMenu?.let { prevMenu!!.isChecked = false }
                    ?: run { nav.menu.getItem(0).isChecked = false }
                nav.menu.getItem(position).isChecked = true
                when(position){
                    0 -> tv.title = "Frutas"
                    1 -> tv.title = "Verduras"
                    2 -> tv.title = "Viveres"
                    3 -> tv.title = "Bebidas"
                }
                prevMenu = nav.menu.getItem(position)
            }
        })
    }
    private fun setNav(){
        nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.frutas ->{
                    pager.currentItem = 0
                    tv.title = "Frutas"
                    true
                }
                R.id.verduras ->{
                    pager.currentItem = 1
                    tv.title = "Verduras"
                    true
                }
                R.id.viveres ->{
                    pager.currentItem = 2
                    tv.title = "Viveres"
                    true
                }
                R.id.bebidas ->{
                    pager.currentItem = 3
                    tv.title = "Bebidas"
                    true
                }
                else -> false
            }
        }
    }
}