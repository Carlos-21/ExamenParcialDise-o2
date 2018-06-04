/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Estructuras.ListaEnlazada;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class Reserva implements Comparable<Reserva>{
    
    private int vuelo;
    private Date fecha;
    private String tramo;
    private ListaEnlazada<Pasajero> pasajeros;
    
    public Reserva(int vuelo, Date fecha, String tramo, ListaEnlazada<Pasajero>pasajeros) {
        this.vuelo = vuelo;
        this.fecha = fecha;
        this.tramo = tramo;
        this.pasajeros = pasajeros;
    }

    public int getVuelo() {
        return vuelo;
    }

    public void setVuelo(int vuelo) {
        this.vuelo = vuelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTramo() {
        return tramo;
    }

    public void setTramo(String tramo) {
        this.tramo = tramo;
    }

    public ListaEnlazada<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ListaEnlazada<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean existePasajero(int DNI){
        Iterator<Pasajero> ITPasajero = pasajeros.getDescendingIterator(); 
        boolean bandera = false;
        while(ITPasajero.hasNext() && bandera == false){
                Pasajero pasajero = ITPasajero.next();
                if(pasajero.getDni() == DNI){
                    bandera = true;
                }
        }
        return bandera;
    }
    
    public String existePasajero(int DNI, String detalle){
        Iterator<Pasajero> ITPasajero = pasajeros.getDescendingIterator(); 
        boolean bandera = false;
        while(ITPasajero.hasNext() && bandera == false){
                Pasajero pasajero = ITPasajero.next();
                if(pasajero.getDni() == DNI){
                    detalle = "<html>"
                                    + "<p>DNI : " + pasajero.getDni() + "</p>"
                                    + "<p>Nombres :" + pasajero.getNombres()+ "</p>"
                                    + "<p>Apellidos :" + pasajero.getApellidos()+ "</p>"
                                    + "<p>Telefono :" + pasajero.getTelefono() + "</p>"
                                    + "<p>Asiento :" + pasajero.getAsiento() + "</p>"
                                    + "</html>";
                    bandera = true;
                }
        }
        return detalle;
    }

    @Override
    public int compareTo(Reserva o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
