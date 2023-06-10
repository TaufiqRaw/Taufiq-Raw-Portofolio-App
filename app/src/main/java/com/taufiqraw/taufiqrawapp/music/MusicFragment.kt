package com.taufiqraw.taufiqrawapp.music

import android.app.Application
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore.Audio.Media
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.taufiqraw.taufiqrawapp.R
import com.taufiqraw.taufiqrawapp.music.data_class.Music
/**
 * Tanggal Pengerjaan : 09-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class MusicFragment : Fragment(R.layout.fragment_music) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val videoView = view.findViewById<VideoView>(R.id.videoView)
        val videoPath = "android.resource://" + view.context.packageName + "/" + R.raw.akad
        val uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri)

        val mediaController = MediaController(view.context)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        val musics = listOf(
            Music("朝焼け", "Casiopea", R.drawable.casiopeamintjamsalbumcover,"https://open.spotify.com/track/3kn85OLlFlbQDCiKmj17MO?si=1c619e1988074886&nd=1"),
            Music("Emily", "Bill Evans", R.drawable.music_bill_evans, "https://open.spotify.com/track/2ZUOnw8xi4HzQMqkkqXrFD?si=2c639ff0d9744bde&nd=1"),
            Music("Them Changes", "Thundercat", R.drawable.music_thundercat , "https://open.spotify.com/track/7CH99b2i1TXS5P8UUyWtnM?si=639e3f35611949bc"),
            Music("Aguas De Marco", "Elis & Tom Jobim", R.drawable.music_elis_tom, "https://open.spotify.com/track/15ouqiBsgL12olEwP3COsH?si=74a20ca6ff1d422e&nd=1"),
            Music("Everything you've ever dreamed (M11)", "Shiro Sagisu", R.drawable.music_shiro, "https://open.spotify.com/track/7Cdoo8IwFjEtryeJA9DODn?si=c88a904d08664058&nd=1"),
            Music("Song of The Ancients", "Keiichi Okabe", R.drawable.music_nier2, "https://open.spotify.com/track/4vr1YnZEJnCOrk5RbymjFa?si=1176c310dccb4432&nd=1"),
            Music("Kick Back", "Kenshi Yonezu", R.drawable.music_kenshi, "https://open.spotify.com/track/3khEEPRyBeOUabbmOPJzAG?si=26e9e4696da6458a&nd=1"),
            Music("アセテート - Instrumental", "フレネシ (Frenesi)", R.drawable.music_frenesi, "https://open.spotify.com/album/758SQhbduGjDqXcWrbIDuM?si=jteXK9tWTxy543TRqovPDA&nd=1"),
            Music("Muchuu", "Mei Semones", R.drawable.music_mei, "https://open.spotify.com/track/0e2lVYFeMmWa5jD1cVwRCD?si=dfd9d87a2f944e92&nd=1"),
            Music("Peaceful Sleep", "Keiichi Okabe", R.drawable.music_nier, "https://open.spotify.com/track/1y4vvMeQPkzMTqHpRpzaDb?si=a1e142efd062465d&nd=1"),
        )

        val recyclerMusic = view.findViewById<RecyclerView>(R.id.recycler_music)
        recyclerMusic.adapter = MusicAdapter(musics)
        recyclerMusic.layoutManager = LinearLayoutManager(view.context)
    }
}