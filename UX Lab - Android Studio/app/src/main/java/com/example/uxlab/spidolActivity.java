package com.example.uxlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class spidolActivity extends AppCompatActivity {

    ImageButton home, bag, info, logout;

    ImageView balik;

    Button beli;

    EditText qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spidol);

        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(v-> {
            Intent intentHome = new Intent(spidolActivity.this, homeActivity.class);
            startActivity(intentHome);
        });

        bag = (ImageButton) findViewById(R.id.bag);
        bag.setOnClickListener(v -> {
            Intent intentBag = new Intent(spidolActivity.this, itemsActivity.class);
            startActivity(intentBag);
        });

        info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(v -> {
            Intent intentInfo = new Intent(spidolActivity.this, aboutActivity.class);
            startActivity(intentInfo);
        });

        logout = (ImageButton) findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            Intent intentLogout = new Intent(spidolActivity.this, loginActivity.class);
            startActivity(intentLogout);
        });

        balik = (ImageView) findViewById(R.id.balik);
        balik.setOnClickListener(v -> {
            Intent balikpage = new Intent(spidolActivity.this, itemsActivity.class);
            startActivity(balikpage);
        });

        qty = (EditText) findViewById(R.id.spidolTf);
        beli = (Button) findViewById(R.id.beliSpidol);
        beli.setOnClickListener(v -> {
            String ipt = qty.getText().toString();

            if(!ipt.isEmpty()){
                Integer quantity = Integer.parseInt(ipt);
                if(quantity < 0){
                    Toast.makeText(this, "Quantity Invalid", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Item Successfully Purchased", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Quantity Invalid", Toast.LENGTH_SHORT).show();
            }
        });
    }
}