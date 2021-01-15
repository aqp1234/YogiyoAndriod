package com.kms.yogiyoandrioclass

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.kms.yogiyoandriod.Detail_restaurant
import com.kms.yogiyoandriod.R
import com.kms.yogiyoandriod.RestaurantClass

class Category_Restaurant_Adapter(val items: ArrayList<RestaurantClass>) : RecyclerView.Adapter<Category_Restaurant_Adapter.ViewHolder>(){
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var view : View = v
        fun bind(listener : View.OnClickListener, item: RestaurantClass){
            view.findViewById<ImageView>(R.id.category_restaurant_thumbnail).setImageResource(item.thumbnail)
            view.findViewById<TextView>(R.id.category_restaurant_name).text = item.name
            view.findViewById<TextView>(R.id.category_restaurant_review_score).text = item.review_score
            view.findViewById<TextView>(R.id.category_restaurant_review_count).text = item.review_count
            view.findViewById<TextView>(R.id.category_restaurant_boss_review_count).text = item.boss_review_count
            view.findViewById<TextView>(R.id.category_restaurant_delivery_fee).text = item.delivery_fee
            view.findViewById<TextView>(R.id.category_restaurant_delivery_time).text = item.delivery_time
            view.setOnClickListener(listener)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): Category_Restaurant_Adapter.ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.list_category_restaurant_item, parent, false)
        return Category_Restaurant_Adapter.ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Category_Restaurant_Adapter.ViewHolder, position: Int) {
        val item = items[position]
        /*val listener = View.OnClickListener {
                it -> Toast.makeText(it.context, "Click", Toast.LENGTH_SHORT).show()
        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }*/
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Detail_restaurant::class.java)
            startActivity(holder.itemView.context, intent, null)
        }
    }
}