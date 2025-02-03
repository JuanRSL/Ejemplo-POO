package com.mycompany.transporte;


import com.mycompany.transporte.Persona;


public class Pasajero extends Persona {
    String Boleto;
    int numeroBoleto;
    public Pasajero(String Nombres, int ID) {
        super(Nombres, ID);
        this.Boleto = Boleto;
        this.numeroBoleto = numeroBoleto;
    }

    public String getBoleto() {
        return Boleto;
    }

    public void setBoleto(String Boleto) {
        this.Boleto = Boleto;
    }

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }
    
}
