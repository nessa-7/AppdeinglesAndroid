package com.van.miappvanessa.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.van.miappvanessa.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewFlag = findViewById(R.id.miGif);
        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/330/330425.png")
                .into(imageViewFlag);


    }

    public void irRegistro(View view){
        Intent siguiente = new Intent(MainActivity.this, Registro.class);
        startActivity(siguiente);
    }
}