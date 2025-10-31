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

public class Pregunta1 extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pregunta1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sonarCat(View view){
        sonido = MediaPlayer.create(Pregunta1.this,R.raw.cataudio);
        sonido.start();
    }
    public void sonarCorrecto(View view){
        sonido = MediaPlayer.create(Pregunta1.this,R.raw.sonidocorrecto);
        sonido.start();

        Intent siguiente = new Intent(Pregunta1.this,Pregunta2.class);
        startActivity(siguiente);
    }

    public void sonarIncorrecto(View view){
        sonido = MediaPlayer.create(Pregunta1.this,R.raw.sonidoincorrecto);
        sonido.start();
    }


}