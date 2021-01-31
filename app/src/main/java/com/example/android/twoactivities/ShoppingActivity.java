package com.example.android.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static com.example.android.twoactivities.MainActivity.MEAT_OK;
import static com.example.android.twoactivities.MainActivity.RICE_OK;

public class ShoppingActivity extends AppCompatActivity {
    // Unique tag for the intent reply.
    public static final String RICE_REPLY =
            "com.example.android.twoactivities.extra.RICEREPLY";

    // Unique tag for the intent reply.
    public static final String MEAT_REPLY =
            "com.example.android.twoactivities.extra.MEATREPLY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }

    public void returnRiceCount(View view) {
        Intent RiceIntent = new Intent();
        RiceIntent.putExtra(RICE_REPLY, "1");
        setResult(RICE_OK, RiceIntent);
        finish();
    }

    public void returnMeatCount(View view) {
        Intent MeatIntent = new Intent();
        MeatIntent.putExtra(MEAT_REPLY, "1");
        setResult(MEAT_OK, MeatIntent);
        finish();
    }
}