/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

import Clases.Pasajero;

/**
 *
 * @author User
 */
public class NodoPasajero {
    private Pasajero pas;
    private NodoPasajero siguiente;

    public NodoPasajero(Pasajero pas) {
        this.pas = pas;
        this.siguiente = null;
    }
       
    public void enlazarSiguiente ( NodoPasajero n){
        siguiente = n;
    }
    
    public NodoPasajero obtenerSiguiente(){
        return siguiente;
    }
    
    public Pasajero obtenerPasajero(){
        return pas;
    }
    
}
