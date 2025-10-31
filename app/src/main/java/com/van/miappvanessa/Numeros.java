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

public class Numeros extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(Numeros.this,MenuApp.class);
        startActivity(volver);
    }

    public void sonarOne(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.oneaudio);
        sonido.start();
    }

    public void sonarTwo(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.twoaudio);
        sonido.start();
    }

    public void sonarThree(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.threeaudio);
        sonido.start();
    }
}