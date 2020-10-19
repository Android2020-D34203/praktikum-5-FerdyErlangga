package com.example.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    TextView teksView1, teksView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        teksView1 = findViewById(R.id.dataUser);
        teksView2 = findViewById(R.id.dataPass);

        Intent i = getIntent();

        String username = getIntent().getExtras().getString("username");
        String password = getIntent().getExtras().getString("password");

        teksView1.setText("Username : " + username);
        teksView2.setText("Password : " + password);
    }
}