package com.van.miappvanessa;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Frutas extends AppCompatActivity {

    MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(Frutas.this,MenuApp.class);
        startActivity(volver);
    }

    public void sonarApple(View view){
       sonido = MediaPlayer.create(Frutas.this,R.raw.appleaudio);
       sonido.start();
    }

    public void sonarFresa(View view){
        sonido = MediaPlayer.create(Frutas.this,R.raw.strawberryaudio);
        sonido.start();
    }

    public void sonarUvas(View view){
        sonido = MediaPlayer.create(Frutas.this,R.raw.grapesaudio);
        sonido.start();
    }

}