package com.example.ankur.navdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragment_main extends Fragment {

    ViewPager mPager;
    PagerAdapter mPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void onStart() {
        super.onStart();

        mPager = (ViewPager) getActivity().findViewById(R.id.pager);
        mPager.setPageTransformer(true, new ZoomOutTransform());
        mPagerAdapter = new ViewSliderAdapter(getActivity().getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }

    public void onBackPressed() {
        if(mPager.getCurrentItem() == 0){
            super.getActivity().onBackPressed();
        }
        else{
            mPager.setCurrentItem(mPager.getCurrentItem()-1);
        }
    }
}
