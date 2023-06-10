package com.taufiqraw.taufiqrawapp.profile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.taufiqraw.taufiqrawapp.R


/**
 * Tanggal Pengerjaan : 10-06-2023
 * Nama : Taufiq Ridho A.W
 * NIM  : 10120789
 * Kelas: IF-9
 */
class ProfileFragment : Fragment(R.layout.fragment_profile), OnMapReadyCallback {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            findViewById<CardView>(R.id.instagram).setOnClickListener {
                val uri: Uri = Uri.parse("https://www.instagram.com/taufiqraw/")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                this.context.startActivity(intent)
            }
            findViewById<CardView>(R.id.whatsapp).setOnClickListener {
                val uri: Uri = Uri.parse("https://wa.me/+6285854069663")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                this.context.startActivity(intent)
            }
            findViewById<CardView>(R.id.gmail).setOnClickListener {
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("mailto:")
                intent.putExtra(Intent.EXTRA_EMAIL, "waskitaufiq@gmail.com")
                intent.putExtra(Intent.EXTRA_SUBJECT, "hello")
                if (intent.resolveActivity(this.context.packageManager) != null) {
                    this.context.startActivity(intent)
                }
            }

            val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
            mapFragment.getMapAsync(this@ProfileFragment);
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val bangbayang = LatLng(-6.880656444675135, 107.61817159598326)

        googleMap.addMarker(
            MarkerOptions()
                .position(bangbayang)
                .title("My Boarding House")
        )

        val camPos: CameraPosition = CameraPosition.Builder()
            .target(bangbayang)
            .zoom(13f)
            .build()

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(camPos));
    }
}