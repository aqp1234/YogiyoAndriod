package com.kms.yogiyoandriod

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_Nav.setOnNavigationItemSelectedListener (this)

        setFrag(0)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home ->{
                setFrag(0)
            }
            R.id.heart ->{
                setFrag(1)
            }
            R.id.search ->{
                setFrag(2)
            }
            R.id.orderhistory ->{
                setFrag(3)
            }
            R.id.myyogiyo ->{
                setFrag(4)
            }
        }
        return true
    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum){
            0 -> {
                ft.replace(R.id.main_frame, frag_home()).commit()
            }
            1 -> {
                ft.replace(R.id.main_frame, testfrag()).commit()
            }
        }
    }
}