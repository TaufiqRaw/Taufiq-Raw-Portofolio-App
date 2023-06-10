package com.taufiqraw.taufiqrawapp.home

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.home.data_class.Repository

/**
 * Tanggal Pengerjaan : 08-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class RepositoryAdapter (
    var repository : List<Repository>
) : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    inner class RepositoryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_github_repo, parent, false)
        return RepositoryViewHolder(view);
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.title).text = repository[position].title
            findViewById<TextView>(R.id.language).text = repository[position].language
            findViewById<MaterialCardView>(R.id.languageColor).setCardBackgroundColor(Color.parseColor(repository[position].languageColor))
            this.setOnClickListener {
                val uri: Uri = Uri.parse(repository[position].url)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                this.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return repository.size
    }
}