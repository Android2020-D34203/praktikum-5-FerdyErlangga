package com.example.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText teks1, teks2;
    Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teks1 = findViewById(R.id.userName);
        teks2 = findViewById(R.id.Password);
        button1 = findViewById(R.id.login);
        button2 = findViewById(R.id.forgot);
    }

    public void login(View v){
        Intent i = new Intent(MainActivity.this, ActivityKedua.class);
        i.putExtra("username",teks1.getText().toString());
        i.putExtra("password",teks2.getText().toString());
        startActivity(i);
    }

    public void forgot(View v){
        Intent i = new Intent(MainActivity.this, ActivityKetiga.class);
        startActivity(i);
    }
}