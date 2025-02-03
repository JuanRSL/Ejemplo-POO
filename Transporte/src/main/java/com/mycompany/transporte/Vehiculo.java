package com.mycompany.transporte;


public class Vehiculo {

    String placa;
    String modelo;
    int capacidad;

    public Vehiculo(String placa, String modelo, int capacidad) {

        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
