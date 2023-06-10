package com.taufiqraw.taufiqrawapp.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.activity.data_class.Activity
import com.taufiqraw.taufiqrawapp.activity.data_class.Friend

/**
 * Tanggal Pengerjaan : 08-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class ActivityFragment : Fragment(R.layout.fragment_activity) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activities = listOf(
            Activity("Mornin' Walking", "Dago", "05.30"),
            Activity("Free Time", "Kos", "06.00"),
            Activity("Attend College (if any)", "Unikom", "09.30"),
            Activity("Cooking", "Kos", "11.30"),
            Activity("Brunch", "Kos", "12.00"),
            Activity("Attend College (if any)", "Unikom", "13.00"),
            Activity("Practice Guitar", "Kos", "13.00"),
            Activity("Learn New Language", "Kos", "13.30"),
            Activity("Watch anime, youtube, movie, etc", "Kos", "14.00"),
            Activity("Cooking", "Kos", "17.00"),
            Activity("Dinner", "Kos", "17.30"),
            Activity("Study", "Kos", "19.00"),
            Activity("Free Time", "Kos", "20.30"),
            Activity("Sleeping", "Kos", "22.00"),
        )

        val recyclerActivity = view.findViewById<RecyclerView>(R.id.recycler_activity)
        recyclerActivity.adapter = ActivityAdapter(activities)
        recyclerActivity.layoutManager = LinearLayoutManager(view.context)

        val friends = listOf(
            Friend("masupiks", R.drawable.masupiks),
            Friend("urdnsatrioo", R.drawable.urdnsatrioo),
            Friend("farougadii", R.drawable.farougadii),
            Friend("hilal_khabib", R.drawable.hilal_khabib),
            Friend("dendi_rf06", R.drawable.dendi_rf06),
            Friend("abi_wiraatmadja", R.drawable.abi_wiraatmadja),
            Friend("renald.s", R.drawable.renald_s),
            Friend("zulnurdiana", R.drawable.zulnurdiana),
            Friend("saputro_tri_hadi", R.drawable.saputro_tri_hadi),
            Friend("aryamardiya", R.drawable.aryamardiya),
        )

        val recyclerFriend = view.findViewById<RecyclerView>(R.id.recycler_friend)
        recyclerFriend.adapter = FriendAdapter(friends)
        recyclerFriend.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
    }
}