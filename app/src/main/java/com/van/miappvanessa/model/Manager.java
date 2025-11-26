package com.van.miappvanessa.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Manager {

    //declarar variables para llamar la conexion

    private ConexionBd conexionBd;
    private SQLiteDatabase db;

    public Manager(Context context) {

        //llamo a la conexion de la bd
        conexionBd = new ConexionBd(context);
    }
    public void openBdWr(){

        //abre la bd en modo escritura
        db = conexionBd.getWritableDatabase();

    }

    public void openBdRd(){
        //abre la bd en modo lectura
        db = conexionBd.getReadableDatabase();
    }


    public void closeBd(){
        //cerrar la base de datos
        db.close();
    }


    public  long insertData(Datos datos){
        openBdWr();
        ContentValues values = new ContentValues();
        values.put("NOMBRE", datos.getNombre());
        values.put("NICK", datos.getNick());
        values.put("EDAD", datos.getEdad());
        values.put("COLEGIO", datos.getColegio());
        values.put("GENERO", datos.getGenero());

        long id = db.insert("DATOS", null, values);

        return id;
    }

}
