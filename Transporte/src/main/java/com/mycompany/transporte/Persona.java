package com.mycompany.transporte;


public class Persona {

    String Nombres;
    int ID;

    public Persona(String Nombres, int ID) {
        this.Nombres = Nombres;
        this.ID = ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }   
}
