package com.example.uxlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class itemsActivity extends AppCompatActivity {

    int[] images = {R.drawable.carohapus, R.drawable.caropenggaris, R.drawable.caropensil,
            R.drawable.carosarasa, R.drawable.carospidol};

    ViewFlipper caro;

    ImageButton home, bag, info, logout;

    ImageView sarasa, penghapus, penggaris, pensil, spidol;

    Button all, hot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        caro = findViewById(R.id.caro);

        for (int image: images) {
            slideimage(image);
        }

        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(v-> {
            Intent intentHome = new Intent(itemsActivity.this, homeActivity.class);
            startActivity(intentHome);
        });

        bag = (ImageButton) findViewById(R.id.bag);
        bag.setOnClickListener(v -> {
            Intent intentBag = new Intent(itemsActivity.this, itemsActivity.class);
            startActivity(intentBag);
        });

        info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(v -> {
            Intent intentInfo = new Intent(itemsActivity.this, aboutActivity.class);
            startActivity(intentInfo);
        });

        logout = (ImageButton) findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            Intent intentLogout = new Intent(itemsActivity.this, loginActivity.class);
            startActivity(intentLogout);
        });

        all = (Button) findViewById(R.id.allitems);
        all.setOnClickListener(v -> {
            Intent allitems = new Intent(itemsActivity.this, allActivity.class);
            startActivity(allitems);
        });

        hot = (Button) findViewById(R.id.hotseller);
        hot.setOnClickListener(v -> {
            Intent hotseller = new Intent(itemsActivity.this, itemsActivity.class);
            startActivity(hotseller);
        });

        sarasa = (ImageView) findViewById(R.id.sarasaI);
        sarasa.setOnClickListener(v -> {
            Intent sara = new Intent(itemsActivity.this, sarasaActivity.class);
            startActivity(sara);
        });

        penghapus = (ImageView) findViewById(R.id.penghapusI);
        penghapus.setOnClickListener(v -> {
            Intent hapus = new Intent(itemsActivity.this, DetailActivity.class);
            startActivity(hapus);
        });

        penggaris = (ImageView) findViewById(R.id.penggarisI);
        penggaris.setOnClickListener(v -> {
            Intent gariss = new Intent(itemsActivity.this, penggarisActivity.class);
            startActivity(gariss);
        });

        spidol = (ImageView) findViewById(R.id.spidolI);
        spidol.setOnClickListener(v -> {
            Intent spido = new Intent(itemsActivity.this, spidolActivity.class);
            startActivity(spido);
        });

        pensil = (ImageView) findViewById(R.id.pensilI);
        pensil.setOnClickListener(v -> {
            Intent pens = new Intent(itemsActivity.this, pensilActivity.class);
            startActivity(pens);
        });
    }

    public void slideimage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        caro.addView(imageView);
        caro.setFlipInterval(2000);
        caro.setAutoStart(true);
    }
}