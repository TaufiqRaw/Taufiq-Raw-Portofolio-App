package com.taufiqraw.taufiqrawapp.walkthrough

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.taufiqraw.taufiqrawapp.R

/**
 * Tanggal Pengerjaan : 17-05-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class WalkthroughPagerAdapter(
    private val slides: Array<WalkthroughSlide>
) : RecyclerView.Adapter<WalkthroughPagerAdapter.ViewHolder>() {
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pager_walkthrough, parent, false)
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.apply {
            val image = findViewById<ImageView>(R.id.imageMain)
            val title = findViewById<TextView>(R.id.textTitle)
            val description = findViewById<TextView>(R.id.textDescription)

            image.setImageResource(slides[position].img)
            title.text = slides[position].title
            description.text = slides[position].description
        }
    }

    override fun getItemCount(): Int {
        return slides.size
    }
}