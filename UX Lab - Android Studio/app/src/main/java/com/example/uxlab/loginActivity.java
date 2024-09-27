package com.example.uxlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText email, pw;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.emailTf);
        pw = (EditText) findViewById(R.id.pwTf);

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(v -> {
            String emaill = email.getText().toString();
            String pww = pw.getText().toString();

            if(emaill.isEmpty() || pww.isEmpty()){
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
            }else if(!emaill.contains(".")){
                Toast.makeText(this, "Email must contains ‘.’", Toast.LENGTH_SHORT).show();
            }else{
                Intent intent = new Intent(loginActivity.this, homeActivity.class);
                intent.putExtra("username", emaill);
                startActivity(intent);
            }
        });

    }
}