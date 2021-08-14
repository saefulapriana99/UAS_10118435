package com.example.uas_10118435;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.uas_10118435.Fragments.Fragment_1;
import com.example.uas_10118435.Fragments.Fragment_2;

import java.util.ArrayList;
import java.util.List;

public class Walkthrough extends AppCompatActivity {

//    12/8/2021
    //    Saeful Apriana
    //    10118435

    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    TextView tv_pageCounter;
    int total = 3 , count = 1;
    Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walkthrought);

        List<Fragment> list = new ArrayList<>();
        list.add(new Fragment_1());
        list.add(new Fragment_2());


        skip = findViewById(R.id.btn_skip);
        tv_pageCounter = findViewById(R.id.pageCounter);
        pager = findViewById(R.id.view_pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Walkthrough.this,Bottom_navigation.class));
                finish();
            }
        });


        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                count = 0;
                count = position + 1;
                tv_pageCounter.setText(count +"/"+ total);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
