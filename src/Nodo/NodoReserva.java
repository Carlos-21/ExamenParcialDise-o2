/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

import Clases.Reserva;

/**
 *
 * @author User
 */
public class NodoReserva {  
    private Reserva reserva;
    private NodoReserva siguiente;

    public NodoReserva(Reserva reserva) {
        this.reserva = reserva;
        this.siguiente = null;
    }
    
    public void enlazarSiguiente (NodoReserva n){
        siguiente = n;
    }
    
    public NodoReserva obtenerSiguiente(){
        return siguiente;
    }
    
    public Reserva obtenerReserva(){
        return reserva;
    }
    
}
