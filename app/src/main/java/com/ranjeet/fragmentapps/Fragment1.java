package com.ranjeet.fragmentapps;


import android.app.Activity;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {
    Communicator com;
View root;
    EditText et1,et2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         root =  inflater.inflate(R.layout.frag1,container,false);
        init(root);
        return root;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (Communicator) getActivity();
    }

    void init(View root){
         et1=(EditText)root.findViewById(R.id.first);
         et2=(EditText)root.findViewById(R.id.second);

        Button but=(Button)root.findViewById(R.id.button1);

        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                com.sendData(et1.getText().toString(),et2.getText().toString());
            }
        });
    }
}

