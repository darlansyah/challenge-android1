package com.example.a123140060.binaracademyyk

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class myAdapter(val andList:ArrayList<setData>): RecyclerView.Adapter<myAdapter.ViewHolder>() {

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val jen = itemView.findViewById<TextView>(R.id.jenis_android)
        val ver = itemView.findViewById<TextView>(R.id.version)
        val lev  = itemView.findViewById<TextView>(R.id.level)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.activity_blue_print,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return andList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.jen?.text = andList[p1].jenis
        p0?.ver?.text = andList[p1].version
        p0?.lev?.text = andList[p1].level
    }



}