package com.van.miappvanessa.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionBd extends SQLiteOpenHelper {
    public ConexionBd(@Nullable Context context) {
        super(context, Constantes.Name_BD, null, Constantes.VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DATOS(NOMBRE TEXT, NICK TEXT, EDAD INT, COLEGIO TEXT, GENERO TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE DATOS");
    }
}
