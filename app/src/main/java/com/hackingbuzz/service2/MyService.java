package com.hackingbuzz.service2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 11/15/2016.
 */

public class MyService extends Service {              // before creating it first put that in manifest..do everytime

// here service using the Main Thread..Plz create seperate thread for Intensive Work...
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {                                   // get data with the help of intent u have in ur paramenter
        Toast.makeText(this,"Starting the Service",Toast.LENGTH_SHORT).show();

        String msgComing =  intent.getStringExtra("Msgeuv");                                         //here must be msg name u wrote in putExtra method in activity class   // in String form  (msg coming from activity)
        Toast.makeText(this, "Activity: "+ msgComing, Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service is Stopping",Toast.LENGTH_SHORT).show();

    }
}

// onStartCommand...we sending intent using startService...n here onStartCommand Mehtod has intent obj to recieve intent..
//we cant set text to ..TextView..coz we are not extending this class from Activity n we dont have findViewById method..
// advantege of extending service class to handle multi threading..more than one start request...
// but you have to create every thread..for every start request...
