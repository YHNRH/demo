package com.example.launchscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread (()->{
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){}
            Intent intent = new Intent(this, Sign_in.class);
            startActivity(intent);
            finish();
        });
        thread.start();

    }
}