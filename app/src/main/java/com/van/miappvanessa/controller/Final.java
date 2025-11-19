package com.van.miappvanessa.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.van.miappvanessa.R;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(Final.this, Opciones.class);
        startActivity(volver);
    }
}