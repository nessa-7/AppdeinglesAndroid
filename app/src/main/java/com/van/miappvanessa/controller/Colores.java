package com.van.miappvanessa.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.van.miappvanessa.R;

public class Colores extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(Colores.this, MenuApp.class);
        startActivity(volver);
    }

    public void sonarBlue(View view){
        sonido = MediaPlayer.create(Colores.this,R.raw.blueaudio);
        sonido.start();
    }

    public void sonarPink(View view){
        sonido = MediaPlayer.create(Colores.this,R.raw.pinkaudio);
        sonido.start();
    }

    public void sonarPurple(View view){
        sonido = MediaPlayer.create(Colores.this,R.raw.purpleaudio);
        sonido.start();
    }


}