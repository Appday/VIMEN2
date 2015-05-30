package com.example.ole.vimen;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import android.location.Location;
import android.location.LocationManager;
import android.content.Context;

public class TourActivity extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);
        setUpMapIfNeeded();

        if (mMap != null) {
            mMap.setMyLocationEnabled(true);
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.086504, 12.109541)).title("Ulmencampus"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.0842192, 12.1125731)).title("Parkstrasse 6"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.0761305, 12.1048401)).title("Mensa Sued"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.077513, 12.106329)).title("Konrad-Zuse-Haus(KZH)/Institut Informatik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.0755451, 12.1035041)).title("Groﬂe Bibo"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.0815325, 12.114842)).title("Sekretariat Wirtschaftsinformatik"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.078917, 12.114819)).title("Zwischenbau"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(54.08076, 12.10233)).title("LT-Club"));

    }
}
