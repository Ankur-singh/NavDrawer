package com.example.ankur.navdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by ankur on 10/3/2017.
 */

public class ViewSliderAdapter extends FragmentStatePagerAdapter{
    ArrayList<view_slider_fragment> slides = new ArrayList<view_slider_fragment>();




    int Num_pages = 5;
    public ViewSliderAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return view_slider_fragment.create(position);
    }

    @Override
    public int getCount() {
        return Num_pages;
    }
}
