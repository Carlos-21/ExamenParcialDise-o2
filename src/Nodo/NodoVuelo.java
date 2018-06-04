/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

import Clases.Viaje;

/**
 *
 * @author CARLOS
 */
public class NodoVuelo {
    private Viaje vuelo;
    private NodoVuelo siguiente;
    
    public NodoVuelo(Viaje vuelo) {
        this.vuelo = vuelo;
        this.siguiente = null;
    }
       
    public void enlazarSiguiente(NodoVuelo nodo){
        siguiente = nodo;
    }
    
    public NodoVuelo obtenerSiguiente(){
        return siguiente;
    }
    
    public Viaje obtenerVuelo(){
        return vuelo;
    }
    
}
