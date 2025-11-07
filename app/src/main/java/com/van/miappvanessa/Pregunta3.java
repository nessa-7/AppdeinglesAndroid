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

public class Pregunta3 extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
    }

    public void sonarPurple(View view){
        sonido = MediaPlayer.create(Pregunta3.this,R.raw.purpleaudio);
        sonido.start();
    }

    public void sonarCorrecto(View view){
        sonido = MediaPlayer.create(Pregunta3.this,R.raw.sonidocorrecto);
        sonido.start();

        Intent siguiente = new Intent(Pregunta3.this,Pregunta4.class);
        startActivity(siguiente);
    }

    public void sonarIncorrecto(View view){
        sonido = MediaPlayer.create(Pregunta3.this,R.raw.sonidoincorrecto);
        sonido.start();
    }
}