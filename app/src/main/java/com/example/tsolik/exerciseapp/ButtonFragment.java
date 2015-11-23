package com.example.tsolik.exerciseapp;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by tsolik on 2015-11-23.
 */
public class ButtonFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_button, container, false);

        view.findViewById(R.id.example_fragment_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(ButtonFragment.this);

                builder.setTitle("Tytuł okna");
                builder.setMessage("wiadomość " + "Treść 12345");
                builder.setPositiveButton("Ok", null);

                builder.create().show();
            }
        });
        return  view;


    }


}
