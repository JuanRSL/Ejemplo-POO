package com.mycompany.transporte;


public class Ruta {
    String Origen;
    String Destino;
    Double horaInicio;
    Double horaLlegada;

    public Ruta(String Origen, String Destino, Double horaInicio, Double horaLlegada) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.horaInicio = horaInicio;
        this.horaLlegada = horaLlegada;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Double getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Double horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
}
