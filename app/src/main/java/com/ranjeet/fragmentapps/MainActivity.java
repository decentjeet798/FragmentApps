package com.ranjeet.fragmentapps;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements Communicator {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void sendData(String one, String two) {



        Fragment2 Obj=(Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        Obj.setMessage(one,two);
    }
}
