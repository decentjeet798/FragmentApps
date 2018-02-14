package com.ranjeet.fragmentapps;

import android.media.Image;
import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

          view=  inflater.inflate(R.layout.frag2,container,false);

        return  view;
    }

    void setMessage(String f,String s){
        TextView txt1=(TextView)view.findViewById(R.id.tv1);
        TextView txt2=(TextView)view.findViewById(R.id.tv2);
        txt1.setText(f);
        txt2.setText(s);
    }



}
