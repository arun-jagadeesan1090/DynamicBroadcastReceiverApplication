package com.example.dynamicbroadcastreceiverapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MySampleReceiver mySampleReceiver = new MySampleReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(mySampleReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(mySampleReceiver);
    }
}
