package com.ranjeet.fragmentapps;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.transition.TransitionManager;
import android.view.View;

public class MainActivity4 extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


    }
    void  fragA(View view){

        Fragment1  fragment1=new Fragment1();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transitionManager=fragmentManager.beginTransaction();
        transitionManager.add(R.id.mgroup,fragment1,"FragA");
        transitionManager.commit();

    }
}
