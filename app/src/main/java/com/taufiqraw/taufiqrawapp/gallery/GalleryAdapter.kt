package com.taufiqraw.taufiqrawapp.gallery

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.taufiqraw.taufiqrawapp.R

/**
 * Tanggal Pengerjaan : 09-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class GalleryAdapter (
    val images : List<Int>
) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>(){
    inner class GalleryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gallery, parent, false)
        return GalleryViewHolder(view)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<ImageView>(R.id.image).setImageResource(images[position])
        }
    }

    override fun getItemCount(): Int {
        return images.size
    }
}