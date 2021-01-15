package com.kms.yogiyoandriod

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.frag_home.*


class frag_home : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag_home, container, false)

        val chinese_category_LinearLayout : LinearLayout = view.findViewById(R.id.chinese_category_LinearLayout)
        chinese_category_LinearLayout.setOnClickListener {
            categorySelectListener(this.chinese_category_LinearLayout)
        }


        return view
    }


    private fun categorySelectListener(item: LinearLayout): Boolean {
        when(item.id){
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
            R.id.chinese_category_LinearLayout ->{
                setFrag(5)
            }
        }
        return true
    }

    private fun setFrag(fragNum : Int) {
        val ft = parentFragmentManager.beginTransaction()
        when(fragNum){
            0 -> {
                ft.replace(R.id.main_frame, frag_home()).commit()
            }
            1 -> {
                ft.replace(R.id.main_frame, testfrag()).commit()
            }
            5 -> {
                ft.replace(R.id.main_frame, testfrag()).commit()
            }
        }
    }
}