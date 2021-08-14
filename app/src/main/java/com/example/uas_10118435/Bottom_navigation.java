package com.example.uas_10118435;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.uas_10118435.Fragment_navigation.Profile;
import com.example.uas_10118435.Fragment_navigation.Tempat_wisata;
import com.example.uas_10118435.Fragment_navigation.Tentang_aplikasi;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.jetbrains.annotations.NotNull;

public class Bottom_navigation extends AppCompatActivity {
//    12/8/2021
    //    Saeful Apriana
    //    10118435

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.menu_profile:
                    f = new Profile();
                    break;
                case R.id.menu_wisata:
                    f = new Tempat_wisata();
                    break;
                case R.id.menu_tentang:
                    f = new Tentang_aplikasi();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.isi, f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation);

        bottomNavigationView = findViewById(R.id.button_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);


    }
}

