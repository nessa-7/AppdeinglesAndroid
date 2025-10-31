package com.van.miappvanessa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opciones);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void irMenu(View view){
        Intent siguiente = new Intent(Opciones.this,MenuApp.class);
        startActivity(siguiente);
    }

    public void volverMenu(View view){
        Intent volver = new Intent(Opciones.this,MainActivity.class);
        startActivity(volver);
    }
    public void irPregunta1(View view){
        Intent pregunta1 = new Intent(Opciones.this,Pregunta1.class);
        startActivity(pregunta1);
    }
}