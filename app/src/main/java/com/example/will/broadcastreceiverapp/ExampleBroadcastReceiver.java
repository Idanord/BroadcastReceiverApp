package com.example.will.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

/**
 * Created by Will on 6/9/2018.
 */

public class ExampleBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //check to see if boot was successful
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Toast.makeText(context, "Boot completed", Toast.LENGTH_SHORT).show();
        }

        //check to see if the connectivity changed
        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            Toast.makeText(context, "Connectivity changed", Toast.LENGTH_SHORT).show();
        }
    }
}

