package com.example.ankur.navdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class view_slider_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    int counter = 0;
    private int mPageNumber;
    public static final String ARG_PAGE = "page1";

    public static view_slider_fragment create(int pageNumber) {
        view_slider_fragment fragment = new view_slider_fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  (View) inflater.inflate(R.layout.view_slider_single, container, false);

        TextView text = (TextView) view.findViewById(R.id.view_slider_description);
        //text.setText("outside switch description for images");

        switch(mPageNumber){

            case 0: text.setText("first image description");
                break;

            case 1: text.setText("second image description");
                break;

            case 2: text.setText("third image description");
                break;

            case 3: text.setText("forth image description");
                break;

            case 4: text.setText("fifth image description");
                break;

        }

        return view;
    }

    public int getPageNumber(){ return mPageNumber;}

}
