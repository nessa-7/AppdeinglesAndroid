package com.van.miappvanessa.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.van.miappvanessa.R;

public class Pregunta1 extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);

    }

    public void sonarCat(View view){
        sonido = MediaPlayer.create(Pregunta1.this,R.raw.cataudio);
        sonido.start();
    }
    public void sonarCorrecto(View view){
        sonido = MediaPlayer.create(Pregunta1.this,R.raw.sonidocorrecto);
        sonido.start();

        Intent siguiente = new Intent(Pregunta1.this, Pregunta2.class);
        startActivity(siguiente);
    }

    public void sonarIncorrecto(View view){
        sonido = MediaPlayer.create(Pregunta1.this,R.raw.sonidoincorrecto);
        sonido.start();
    }


}