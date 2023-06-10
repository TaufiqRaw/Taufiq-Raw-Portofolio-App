package com.taufiqraw.taufiqrawapp.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.activity.data_class.Friend

/**
 * Tanggal Pengerjaan : 08-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class FriendAdapter(
    var friends : List<Friend>
) : RecyclerView.Adapter<FriendAdapter.FriendViewHolder>() {
    inner class FriendViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_friend, parent, false)
        return FriendViewHolder(view)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<ImageView>(R.id.profile_picture).setImageResource(friends[position].profilePicture)
            findViewById<TextView>(R.id.username).text = friends[position].username
        }
    }

    override fun getItemCount(): Int {
        return friends.size
    }
}