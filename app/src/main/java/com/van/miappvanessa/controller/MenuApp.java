package com.van.miappvanessa.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.van.miappvanessa.R;

public class MenuApp extends AppCompatActivity {

    CheckBox chApr1, chApr2, chApr3, chApr4;
    Button btnColores, btnAnimales, btnFrutas, btnNumeros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);

        chApr1 = findViewById(R.id.chxAprendido1);
        chApr2 = findViewById(R.id.chxAprendido2);
        chApr3 = findViewById(R.id.chxAprendido3);
        chApr4 = findViewById(R.id.chxAprendido4);

        btnColores = findViewById(R.id.btnColores);
        btnAnimales = findViewById(R.id.btnAnimales);
        btnFrutas = findViewById(R.id.btnFrutas);
        btnNumeros = findViewById(R.id.btnNumeros);


        chApr1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
                if(b){
                    btnColores.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.blue)
                    );
                }
                else {
                    btnColores.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.blue2)
                    );
                }
            }
        });

        chApr2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
                if(b){
                    btnAnimales.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.purple)
                    );
                }
                else {
                    btnAnimales.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.purple2)
                    );
                }
            }
        });

        chApr3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
                if(b){
                    btnFrutas.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.green)
                    );
                }
                else {
                    btnFrutas.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.green2)
                    );
                }
            }
        });

        chApr4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
                if(b){
                    btnNumeros.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.pink)
                    );
                }
                else {
                    btnNumeros.setBackgroundTintList(
                            ContextCompat.getColorStateList(MenuApp.this, R.color.pink2)
                    );
                }
            }
        });
    }
    public void irColores(View view){
        Intent colores = new Intent(MenuApp.this, Colores.class);
        startActivity(colores);
    }

    public void irAnimales(View view){
        Intent animales = new Intent(MenuApp.this, Animales.class);
        startActivity(animales);
    }

    public void irFrutas(View view){
        Intent frutas = new Intent(MenuApp.this, Frutas.class);
        startActivity(frutas);
    }

    public void irNumeros(View view){
        Intent numeros = new Intent(MenuApp.this, Numeros.class);
        startActivity(numeros);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(MenuApp.this, Opciones.class);
        startActivity(volver);
    }


}