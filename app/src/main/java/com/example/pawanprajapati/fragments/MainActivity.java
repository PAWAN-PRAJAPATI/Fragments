package com.example.pawanprajapati.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFrag.TopSectionListner {

    @Override
    public void CreateMeme(String top, String bottom) {
        BottomSectionFragement bottomSectionFragement=(BottomSectionFragement)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomSectionFragement.setMemeText(top,bottom);
        TopSectionFrag topSectionFrag =(TopSectionFrag) getSupportFragmentManager().findFragmentById(R.id.fragment);

    }

    @Override
    public void SetInput(String top, String bottom) {
        TopSectionFrag topSectionFrag=(TopSectionFrag)getSupportFragmentManager().findFragmentById(R.id.fragment);
        topSectionFrag.inputs(top,bottom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
