package com.example.praktikum5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;


public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;
        LatLng umm = new LatLng(-7.9215166, 112.5973649);
        mapAPI.addMarker(new MarkerOptions().position(umm).title("University of Muhammadiyah Malang, Campus III")
                .snippet("Jalan Raya Tlogomas No. 246 Tlogomas, Babatan, Tegalgondo, Kec. Lowokwaru, Kota Malang, Jawa Timur")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.start_blue)));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLngZoom(umm,17));

        LatLng ict = new LatLng(-7.921472, 112.598565);
        mapAPI.addMarker(new MarkerOptions().position(ict).title("Laboratorium Infokom UMM (A, B, dan C)")
                .snippet("Jl. Karyawiguna No.336, Babatan, Tegalgondo, Kec. Karang Ploso, Malang, Jawa Timur")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.end_green)));

        mapAPI.addPolyline(new PolylineOptions().add(umm, new LatLng(-7.921395, 112.597050),
                new LatLng(-7.920957, 112.597219), new LatLng(-7.920786, 112.597303),
                new LatLng(-7.920827, 112.597535), new LatLng(-7.920854, 112.597641),
                new LatLng(-7.920894, 112.597723), new LatLng(-7.921069, 112.597956),
                new LatLng(-7.921180, 112.598071), new LatLng(-7.921214, 112.598121),
                new LatLng(-7.921272, 112.598154), new LatLng(-7.921301, 112.598159),
                new LatLng(-7.921403, 112.598154), new LatLng(-7.921453, 112.598154),
                new LatLng(-7.921492, 112.598163), new LatLng(-7.921541, 112.598192),
                new LatLng(-7.921571, 112.598260), new LatLng(-7.921591, 112.598358),
                new LatLng(-7.921600, 112.598514), new LatLng(-7.921598, 112.598538), ict).width(10).color(Color.RED)
        );
    }
}
