package com.hackingbuzz.service2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // we need a component to start a service


    public void startMethod(View view) {
        Intent i;
        i = new Intent(this,MyService.class);                                                        // sending data to service (to onStartCommand)
        i.putExtra("Msgeuv"," Hello Service..its just send to say hi");                 // sending data to service..now service need to get this String data..using getString method..
        startService(i);

    }

    public void stopMethod(View view) {

        Intent i  = new Intent(this,MyService.class);
        stopService(i);
    }
}
