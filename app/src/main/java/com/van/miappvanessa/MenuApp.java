package com.van.miappvanessa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);

    }
    public void irColores(View view){
        Intent colores = new Intent(MenuApp.this,Colores.class);
        startActivity(colores);
    }

    public void irAnimales(View view){
        Intent animales = new Intent(MenuApp.this,Animales.class);
        startActivity(animales);
    }

    public void irFrutas(View view){
        Intent frutas = new Intent(MenuApp.this,Frutas.class);
        startActivity(frutas);
    }

    public void irNumeros(View view){
        Intent numeros = new Intent(MenuApp.this,Numeros.class);
        startActivity(numeros);
    }
}