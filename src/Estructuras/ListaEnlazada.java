/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Victor Palma
 * @param <T>
 */
public class ListaEnlazada<T>  {
    public int longitud = 0;
    Nodo<T> cabecera;
    Comparator<T> comparador;

    public Nodo<T> getCabecera() {
        return cabecera;
    }

    public void setCabecera(Nodo<T> cabecera) {
        this.cabecera = cabecera;
    }

    public Comparator<T> getComparador() {
        return comparador;
    }

    public void setComparador(Comparator<T> comparador) {
        this.comparador = comparador;
    }

    private class IteradorDescendente implements Iterator<T> {

        Nodo<T> aux;

        public IteradorDescendente() {
            aux = cabecera;
        }

        @Override
        public boolean hasNext() {
            return aux != null;
        }

        @Override
        public T next() {
            T datoG = aux.dato;
            aux = aux.sig;
            return datoG;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public Iterator<T> getDescendingIterator() {
        return new IteradorDescendente();
    }
    
    public void insertarAlInicio(T nuevo) {
        Nodo<T> nuevoNodo = new Nodo<>(nuevo);
        nuevoNodo.sig = cabecera;
        if (cabecera != null) {
            cabecera.ant = nuevoNodo;
        }
        cabecera = nuevoNodo;
        longitud++;
    }
    
     @Override
    public String toString() {
        String cadena = "";
        Nodo<T> aux = cabecera;
        while (aux != null) {
            cadena += aux.dato + ", ";
            aux = aux.sig;
        }
        return cadena;
    }
    
    private void intercambiar (Nodo<T> i, Nodo<T> j){
        T aux = i.dato;
        i.dato = j.dato;
        j.dato = aux;
    }
    
    public boolean eliminar(T val) {
        //implementa el metodo eliminar
        return false;
    }
}
