package com.van.miappvanessa.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.van.miappvanessa.R;

public class Opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
    }

    public void irMenu(View view){
        Intent siguiente = new Intent(Opciones.this, MenuApp.class);
        startActivity(siguiente);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(Opciones.this, MainActivity.class);
        startActivity(volver);
    }
    public void irPregunta1(View view){
        Intent pregunta1 = new Intent(Opciones.this, Pregunta1.class);
        startActivity(pregunta1);
    }
}