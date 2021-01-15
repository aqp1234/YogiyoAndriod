package com.kms.yogiyoandriod

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kms.yogiyoandrioclass.Category_Restaurant_Adapter

class testfrag : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_category, container, false)

        val rv_list : RecyclerView = view.findViewById(R.id.rv_list)

        val RestaurantList = arrayListOf(
            RestaurantClass(R.drawable.findimg, "매장이름", "4.5", "리뷰 23", "사장님 댓글 20", "배달요금 2000", "배달예상시간 50~60"),
            RestaurantClass(R.drawable.findimg, "매장이름", "4.5", "리뷰 24", "사장님 댓글 20", "배달요금 2000", "배달예상시간 50~60"),
            RestaurantClass(R.drawable.findimg, "매장이름", "4.5", "리뷰 25", "사장님 댓글 20", "배달요금 2000", "배달예상시간 50~60")
        )

        val adapter = Category_Restaurant_Adapter(RestaurantList)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = adapter

        return view
    }
}