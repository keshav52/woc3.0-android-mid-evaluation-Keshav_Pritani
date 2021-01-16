package com.example.timetableapp;

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

    public void mondayClicked(View view) {
        startActivity(new Intent(this,MondayActivity.class));
    }

    public void tuesdayClicked(View view) {
        startActivity(new Intent(this,TuesdayActivity.class));
    }

    public void wednesdayClicked(View view) {
        startActivity(new Intent(this,WednesdayActivity.class));
    }

    public void thursdayClicked(View view) {
        startActivity(new Intent(this, ThursdayActivity.class));
    }

    public void fridayClicked(View view) {
        startActivity(new Intent(this,FridayActivity.class));
    }

    public void saturdayClicked(View view) {
        startActivity(new Intent(this,SaturdayActivity.class));
    }
}