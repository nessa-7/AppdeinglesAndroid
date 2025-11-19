package com.van.miappvanessa.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.van.miappvanessa.R;

public class Animales extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(Animales.this, MenuApp.class);
        startActivity(volver);
    }


    public void sonarCat(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.cataudio);
        sonido.start();
    }

    public void sonarDog(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.dogaudio);
        sonido.start();
    }

    public void sonarConejo(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.rabbitaudio);
        sonido.start();
    }
}