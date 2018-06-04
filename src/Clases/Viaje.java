/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Estructuras.ListaEnlazada;

/**
 *
 * @author CARLOS
 */
public class Viaje implements Comparable<Viaje>{
    private String numeroVuelo;
    private String origen;
    private String destino;
    private Asiento[] asientos;
    private String piloto;
    private String copiloto;
    private ListaEnlazada<Reserva> reservas;

    public Viaje(String numeroVuelo, String origen, String destino, Asiento[] asientos, String piloto, String copiloto) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.asientos = asientos;
        this.piloto = piloto;
        this.copiloto = copiloto;
        reservas = new ListaEnlazada<>();
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[] asientos) {
        this.asientos = asientos;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public ListaEnlazada<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ListaEnlazada<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    public int asientosReservados(){
        int cantidad = 0;
        for (int i = 0; i < asientos.length; i++) {
            if(asientos[i].isEstado() == false){
                cantidad++;
            }
        }
        return cantidad;
    }

    @Override
    public int compareTo(Viaje o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
