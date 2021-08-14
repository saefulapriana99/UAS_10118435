package com.example.uas_10118435.Fragment_navigation;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uas_10118435.R;

import org.jetbrains.annotations.NotNull;

public class Tempat_wisata extends Fragment {

    //    12/8/2021
    //    Saeful Apriana
    //    10118435

    String url_map1 = "https://www.google.com/maps/place/D'+Dieuland/@-6.8414781,107.6249162,14z/data=!4m5!3m4!1s0x0:0x67627cb5b6f1829e!8m2!3d-6.8419332!4d107.6234187";
    String url_map2 = "https://www.google.com/maps/place/LERENG+ANTENG+Panoramic+Coffee/@-6.8426273,107.6226946,15z/data=!4m2!3m1!1s0x0:0x32c5e4a6a21426a2?sa=X&ved=2ahUKEwjKxf34prDyAhWPXSsKHaUrCvUQ_BIwHXoECGYQBQ";
    Button map1, map2;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tempat_wisata, container, false);

        map1 = view.findViewById(R.id.map1);
        map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_map1);
            }
        });
        map2 = view.findViewById(R.id.map2);
        map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_map2);
            }
        });
        return view;
    }

    public void gotoUrl(String url) {
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
