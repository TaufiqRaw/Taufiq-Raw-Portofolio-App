package com.taufiqraw.taufiqrawapp.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.home.data_class.Repository

/**
 * Tanggal Pengerjaan : 08-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var repositoryList = mutableListOf(
            Repository("maze-backtracking", "TypeScript", "#3278C8", "https://github.com/TaufiqRaw/maze-backtracking"),
            Repository("sudoku-solver", "Rust", "#DCA586", "https://github.com/TaufiqRaw/sudoku-solver"),
            Repository("Mapbox-practice", "TypeScript", "#3278C8", "https://github.com/TaufiqRaw/Mapbox-practice"),
        )

        val adapter = RepositoryAdapter(repositoryList)
        val recyclerRepository = view.findViewById<RecyclerView>(R.id.recycler_repository)
        recyclerRepository.adapter = adapter
        recyclerRepository.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
    }
}