package com.example.custombasicadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.custombasicadapter.R
import com.example.custombasicadapter.model.User

class CustomAdapter(val users:List<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout, parent, false)
        return CustomViewzHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users.get(position)
        if (holder is CustomViewzHolder) {
            holder.first_name.setText(user.firstName)
            holder.last_name.setText(user.lastName)
            holder.img_view.setImageResource(user.image)
        }
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class CustomViewzHolder(initView: View) : RecyclerView.ViewHolder(initView) {
        val first_name = initView.findViewById<TextView>(R.id.first_name)
        val last_name = initView.findViewById<TextView>(R.id.last_name)
        val img_view = initView.findViewById<ImageView>(R.id.iv_profile)
    }


}
