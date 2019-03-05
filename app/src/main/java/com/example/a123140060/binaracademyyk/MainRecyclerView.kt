package com.example.a123140060.binaracademyyk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainRecyclerView : AppCompatActivity() {

    val and:ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler_view)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        val listAnd = ArrayList<setData>()
        listAnd.add(setData("Pie","android 9","API Level 28"))
        listAnd.add(setData("Oreo","android 8.1","API Level 27"))
        listAnd.add(setData("Oreo","android 8.0","API Level 26"))
        listAnd.add(setData("Nougat","android 7.1","API Level 25"))
        listAnd.add(setData("Nougat","android 7.0","API Level 24"))
        listAnd.add(setData("Marshmallow","android 6.0","API Level 23"))
        listAnd.add(setData("Lolipop","android 5.1","API Level 22"))


        var adapter = myAdapter(listAnd)
        rv.adapter = adapter
    }


}
