package com.example.uas_10118435.Fragment_navigation;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uas_10118435.R;

import org.jetbrains.annotations.NotNull;

public class Profile extends Fragment {

    //    12/8/2021
    //    Saeful Apriana
    //    10118435

    String url_instagram="https://www.instagram.com/saaefulapriana/";
    String url_linkedin="https://linkedin.com/saefulapriana";
    String url_facebook="https://web.facebook.com/saefullapriana/";
    ImageButton linkedin,instagram,facebook;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.profile, container, false);

        instagram = view.findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_instagram);
            }
        });
        facebook = view.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_facebook);
            }
        });
        linkedin = view.findViewById(R.id.linkedin);
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_linkedin);
            }
        });
        return view;
    }
    public void gotoUrl(String url){
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}

