package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        Thread td = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    Intent intent = new Intent(splashscreen.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        };td.start();




    }
}