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
import com.van.miappvanessa.model.Datos;
import com.van.miappvanessa.model.Manager;

public class Registro extends AppCompatActivity {


    EditText edtNombre, edtNick, edtEdad;
    Spinner spColegios;
    RadioGroup rgGenero;
    RadioButton rbF, rbM;

    Button btnEnviar;

    Manager manager;


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
                int edad = Integer.parseInt(edtEdad.getText().toString());

                String colegio = spColegios.getSelectedItem().toString();

                int generogroup = rgGenero.getCheckedRadioButtonId();
                RadioButton rbSeleccionado = findViewById(generogroup);
                String genero = rbSeleccionado.getText().toString();

                Intent siguiente = new Intent(Registro.this, Opciones.class);
                startActivity(siguiente);

                manager = new Manager(Registro.this);

                //pasamos los valores al pojo
                Datos datos = new Datos(nombre, nick, edad, colegio, genero);

                //llamamos al metodo insertar
                long resul =  manager.insertData(datos);

                if (resul>0){
                    Toast.makeText(Registro.this, "Datos insertados", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Registro.this, "Error al insertar datos", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }

}