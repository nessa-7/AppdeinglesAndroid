package com.van.miappvanessa.model;

public class Datos {

    private  String nombre ;
   private  String nick ;
   private int edad ;
   private String colegio ;

   private String genero;


   public Datos(String nom, String nick, int ed, String co, String ge){
       //constructor
       this.nombre = nom;
       this.nick = nick;
       this.edad = ed;
       this.colegio = co;
       this.genero = ge;
   }

    //metodos set para darle valor a las variables
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNick(String nick){
       this.nick = nick;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setColegio(String colegio){
        this.colegio = colegio;
    }

    public void setGenero(String genero){
       this.genero = genero;
    }


    //metodos set para obtener el  valor a las variables
    public String getNombre(){
        return nombre;
    }

    public String getNick(){
       return nick;
    }

    public int getEdad(){
       return edad;
    }

    public String getColegio(){
       return colegio;
    }

    public String getGenero(){
       return genero;
    }

}
