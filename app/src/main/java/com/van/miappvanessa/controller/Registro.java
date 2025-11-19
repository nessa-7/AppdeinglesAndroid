package com.van.miappvanessa.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.van.miappvanessa.R;
import com.van.miappvanessa.model.ConexionBd;

public class Registro extends AppCompatActivity {

    ConexionBd conexionbd;
    SQLiteDatabase db;
    EditText edtNombre, edtNick, edtEdad;
    Spinner spColegios;
    RadioGroup rgGenero;
    RadioButton rbF, rbM;

    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        edtNombre = findViewById(R.id.edNombre);
        edtNick = findViewById(R.id.edNick);
        edtEdad = findViewById(R.id.edEdad);

        spColegios = findViewById(R.id.spColegios);

        rgGenero = findViewById(R.id.rgGenero);
        rbF = findViewById(R.id.rbFemenino);
        rbM = findViewById(R.id.rbMasculino);

        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = edtNombre.getText().toString();
                String nick = edtNick.getText().toString();
                String edad = edtEdad.getText().toString();

                String colegio = spColegios.getSelectedItem().toString();

                int generogroup = rgGenero.getCheckedRadioButtonId();
                RadioButton rbSeleccionado = findViewById(generogroup);
                String genero = rbSeleccionado.getText().toString();
                Intent siguiente = new Intent(Registro.this, Opciones.class);
                startActivity(siguiente);

                conexionbd = new ConexionBd(Registro.this);
                db = conexionbd.getWritableDatabase();
                Toast.makeText(Registro.this, "Bd creada", Toast.LENGTH_SHORT).show();
            }
        });





    }

}