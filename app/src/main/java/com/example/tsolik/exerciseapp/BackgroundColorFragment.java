package com.example.tsolik.exerciseapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tsolik on 2015-11-23.
 */
public class BackgroundColorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup rootView =(ViewGroup) inflater.inflate(R.layout.fragment_background, container,false);
        return rootView;
    }
}
