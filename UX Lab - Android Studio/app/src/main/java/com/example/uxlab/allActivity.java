package com.example.uxlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class allActivity extends AppCompatActivity {

    ImageButton home, bag, info, logout;
    Button all, hot;

    ImageView sarasa, penghapus, penggaris, pensil, spidol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(v-> {
            Intent intentHome = new Intent(allActivity.this, homeActivity.class);
            startActivity(intentHome);
        });

        bag = (ImageButton) findViewById(R.id.bag);
        bag.setOnClickListener(v -> {
            Intent intentBag = new Intent(allActivity.this, itemsActivity.class);
            startActivity(intentBag);
        });

        info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(v -> {
            Intent intentInfo = new Intent(allActivity.this, aboutActivity.class);
            startActivity(intentInfo);
        });

        logout = (ImageButton) findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            Intent intentLogout = new Intent(allActivity.this, loginActivity.class);
            startActivity(intentLogout);
        });

        all = (Button) findViewById(R.id.allitems);
        all.setOnClickListener(v -> {
            Intent allitems = new Intent(allActivity.this, allActivity.class);
            startActivity(allitems);
        });

        hot = (Button) findViewById(R.id.hotseller);
        hot.setOnClickListener(v -> {
            Intent hotseller = new Intent(allActivity.this, itemsActivity.class);
            startActivity(hotseller);
        });

        sarasa = (ImageView) findViewById(R.id.sarasaAll);
        sarasa.setOnClickListener(v -> {
            Intent sarasaAll = new Intent(allActivity.this, sarasaActivity.class);
            startActivity(sarasaAll);
        });

        penghapus = (ImageView) findViewById(R.id.penghapusAll);
        penghapus.setOnClickListener(v -> {
            Intent eraser = new Intent(allActivity.this, DetailActivity.class);
            startActivity(eraser);
        });

        penggaris = (ImageView) findViewById(R.id.penggarisAll);
        penggaris.setOnClickListener(v -> {
            Intent garis = new Intent(allActivity.this, penggarisActivity.class);
            startActivity(garis);
        });

        pensil = (ImageView) findViewById(R.id.pensilAll);
        pensil.setOnClickListener(v -> {
            Intent pencil = new Intent(allActivity.this, pensilActivity.class);
            startActivity(pencil);
        });

        spidol = (ImageView) findViewById(R.id.spidolAll);
        spidol.setOnClickListener(v -> {
            Intent spidi = new Intent(allActivity.this, spidolActivity.class);
            startActivity(spidi);
        });
    }
}