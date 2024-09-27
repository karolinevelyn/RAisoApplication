package com.example.uxlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class aboutActivity extends AppCompatActivity {

    ImageButton home, bag, info, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(v-> {
            Intent intentHome = new Intent(aboutActivity.this, homeActivity.class);
            startActivity(intentHome);
        });

        bag = (ImageButton) findViewById(R.id.bag);
        bag.setOnClickListener(v -> {
            Intent intentBag = new Intent(aboutActivity.this, itemsActivity.class);
            startActivity(intentBag);
        });

        info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(v -> {
            Intent intentInfo = new Intent(aboutActivity.this, aboutActivity.class);
            startActivity(intentInfo);
        });

        logout = (ImageButton) findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            Intent intentLogout = new Intent(aboutActivity.this, loginActivity.class);
            startActivity(intentLogout);
        });
    }
}