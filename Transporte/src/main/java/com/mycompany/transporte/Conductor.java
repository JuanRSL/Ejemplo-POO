package com.mycompany.transporte;


import com.mycompany.transporte.Persona;


public class Conductor extends Persona {
    int Licencia;
    public Conductor(String Nombres, int Licencia) {
        super(Nombres, Licencia);
        this.Licencia = Licencia;
    }

    public int getLicencia() {
        return Licencia;
    }

    public void setLicencia(int Licencia) {
        this.Licencia = Licencia;
    }
    
}
