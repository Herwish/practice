package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                // do something here
                finish();
                startActivity(new Intent(result.this,MainActivity.class));

            }
        };
        Timer opening=new Timer();
        opening.schedule(task,5000);
    }
}