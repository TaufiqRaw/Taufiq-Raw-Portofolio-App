package com.taufiqraw.taufiqrawapp.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.taufiqraw.taufiqrawapp.R

/**
 * Tanggal Pengerjaan : 09-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class GalleryFragment : Fragment(R.layout.fragment_gallery) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val images = listOf(
            R.drawable.gallery_164345784476,
            R.drawable.gallery_2019,
            R.drawable.gallery_314667435_1489987964856732_1241097991929270734_n,
            R.drawable.gallery_expo,
            R.drawable.gallery_ceremony,
            R.drawable.gallery_img_20210310_wa0009,
            R.drawable.gallery_img_20211012_wa00234,
            R.drawable.gallery_img_6579,
            R.drawable.gallery_keroncong_trio,
            R.drawable.gallery_as314rd,
            R.drawable.gallery_as321,
            R.drawable.gallery_as342
        )


        val recyclerGallery = view.findViewById<RecyclerView>(R.id.recycler_gallery);
        recyclerGallery.adapter = GalleryAdapter(images);
        recyclerGallery.layoutManager = GridLayoutManager(view.context, 3)
    }
}