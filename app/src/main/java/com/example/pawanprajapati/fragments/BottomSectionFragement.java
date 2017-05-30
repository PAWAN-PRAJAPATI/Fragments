package com.example.pawanprajapati.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragement extends Fragment {
    private static TextView toptext;
    private static TextView bottomtext;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_bottom_section_fragement,container,false);
        toptext=(TextView)view.findViewById(R.id.toptext);
        bottomtext=(TextView)view.findViewById(R.id.bottomtext);
        return view;
    }
    public void setMemeText(String top,String bot){
        toptext.setText(top);
        bottomtext.setText(bot);
    }
}
