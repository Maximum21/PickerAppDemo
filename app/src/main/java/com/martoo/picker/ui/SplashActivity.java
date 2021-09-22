package com.martoo.picker.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.martoo.picker.Constant;
import com.martoo.picker.R;
import com.martoo.picker.SharedPrefHelper;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    int delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Context context = this;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                if (SharedPrefHelper.readString(context, Constant.token) != null) {
                    startActivity(new Intent(context, ListingActivity.class));
                } else
                    startActivity(new Intent(context, LoginActivity.class));
                finish();
            }
        }, delay);
    }
}