package com.example.uxlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class homeActivity extends AppCompatActivity {

    TextView ganti;
    ImageButton item, aboutus;
    ImageButton home, bag, info, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ganti = (TextView) findViewById(R.id.gantinama);
        Intent intent = getIntent();
        ganti.setText(intent.getStringExtra("username"));

        item = (ImageButton) findViewById(R.id.itemsbtn);
        aboutus = (ImageButton) findViewById(R.id.aboutusbtn);

        item.setOnClickListener(v -> {
            Intent intent1 = new Intent(homeActivity.this, itemsActivity.class);
            startActivity(intent1);
        });

        aboutus.setOnClickListener(v -> {
            Intent intent2 = new Intent(homeActivity.this, aboutActivity.class);
            startActivity(intent2);
        });

        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(v-> {
            Intent intentHome = new Intent(homeActivity.this, homeActivity.class);
            startActivity(intentHome);
        });

        bag = (ImageButton) findViewById(R.id.bag);
        bag.setOnClickListener(v -> {
            Intent intentBag = new Intent(homeActivity.this, itemsActivity.class);
            startActivity(intentBag);
        });

        info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(v -> {
            Intent intentInfo = new Intent(homeActivity.this, aboutActivity.class);
            startActivity(intentInfo);
        });

        logout = (ImageButton) findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            Intent intentLogout = new Intent(homeActivity.this, loginActivity.class);
            startActivity(intentLogout);
        });
    }
}