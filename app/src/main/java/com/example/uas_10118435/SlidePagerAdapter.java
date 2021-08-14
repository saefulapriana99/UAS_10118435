package com.example.uas_10118435;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SlidePagerAdapter extends FragmentStatePagerAdapter {

//    12/8/2021
    //    Saeful Apriana
    //    10118435

    private List<Fragment> fragmentList;

    public SlidePagerAdapter(FragmentManager fm,List<Fragment> fragmentList){

        super(fm);
        this.fragmentList = fragmentList;

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}

