package com.example.custombasicadapter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.custombasicadapter.R
import com.example.custombasicadapter.adapter.CustomAdapter
import com.example.custombasicadapter.model.User
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        val users = prepareMemberList()
        refreshAdapter(users)
    }

     fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

    }
    private fun refreshAdapter(users:List<User>){
        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }
    private fun prepareMemberList():List<User>{
        val users = ArrayList<User>()
        for (i in 0..30){
            users.add(User("UChqun"+i,"Azimboyev"+i,R.drawable.img1))

        }
        return users
    }

}