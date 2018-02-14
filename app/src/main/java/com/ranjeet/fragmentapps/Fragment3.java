package com.ranjeet.fragmentapps;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment3 extends Fragment {
    ViewGroup view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

          view= (ViewGroup) inflater.inflate(R.layout.frag3,null);

        return  view;
    }

    void setMessage(String msg){
        TextView txt=(TextView)view.findViewById(R.id.tv1);
        txt.setText(msg);
    }
}
