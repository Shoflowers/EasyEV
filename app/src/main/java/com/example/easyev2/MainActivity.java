package com.example.easyev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void batteryOptions(View view){
        Intent battery = new Intent(this, batteryLife2.class);
        startActivity(battery);
    }
    public void tripOptions(View view){
        Intent trip = new Intent(this, tripPlanner2.class);
        startActivity(trip);
    }
    public void resourceOptions(View view){
        Intent resource = new Intent(this, resourcesPage2.class);
        startActivity(resource);
    }
}
