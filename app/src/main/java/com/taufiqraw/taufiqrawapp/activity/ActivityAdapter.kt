package com.taufiqraw.taufiqrawapp.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.activity.data_class.Activity

/**
 * Tanggal Pengerjaan : 08-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class ActivityAdapter(
    var activity : List<Activity>
) : RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {
    inner class ActivityViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, false);
        return ActivityViewHolder(view);
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.title).text = activity[position].title
            findViewById<TextView>(R.id.location).text = activity[position].location
            findViewById<TextView>(R.id.time).text = activity[position].time
        }
    }

    override fun getItemCount(): Int {
        return activity.size
    }
}