package com.example.pawanprajapati.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFrag extends Fragment{
    private static EditText toptextinput;
    private static EditText bottomtextinput;
    private static Button meme;

    TopSectionListner activityCommondar;
    public interface TopSectionListner{
        public void CreateMeme(String top,String bottom);

        public void SetInput(String top,String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommondar = (TopSectionListner) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_top_section_frag,container,false);
        toptextinput=(EditText)view.findViewById(R.id.toptext);
        bottomtextinput=(EditText)view.findViewById(R.id.bottomtext);
        meme=(Button)view.findViewById(R.id.meme);

        meme.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttononClicked(v);
                    }
                }
        );
        return  view;
    }

    public void buttononClicked(View v){
        activityCommondar.CreateMeme(toptextinput.getText().toString(),bottomtextinput.getText().toString());
        activityCommondar.SetInput("top","bottom");
    }

    public void inputs(String top,String bottom){
        toptextinput.setText(top);
        bottomtextinput.setText(bottom);
    }
}
