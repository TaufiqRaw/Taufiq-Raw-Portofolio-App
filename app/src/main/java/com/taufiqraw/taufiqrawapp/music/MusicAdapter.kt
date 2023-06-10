package com.taufiqraw.taufiqrawapp.music

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.music.data_class.Music

/**
 * Tanggal Pengerjaan : 09-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class MusicAdapter(
    val musics : List<Music>
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    inner class MusicViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.title).text = musics[position].title
            findViewById<TextView>(R.id.artist).text = musics[position].artist
            findViewById<ImageView>(R.id.cover).setImageResource(musics[position].cover)
            this.setOnClickListener {
                val uri: Uri = Uri.parse(musics[position].link)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                this.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return musics.size
    }
}