/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.propiedad;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author CARLOS
 */
public class Directorio {
    public static String login = "src/Frames/imagenes/seguridad/login.png";
    public static String fondoLogin = "src/Frames/imagenes/seguridad/fondoLogin.jpg";
    public static String fondo = "src/Frames/imagenes/fondo.png";
    public static String botonAtras = "src/Frames/imagenes/iconos/retroceso.png";
    public static String botonSalir = "src/Frames/imagenes/iconos/salir.png";
    public static Color asientoReservado = new Color(204,0,0);
    public static Color asientoDisponible = new Color(13,13,77);
    
    public static void ponerImagenLabel(JLabel label, String ruta){
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono); 
    }
    
    public static void ponerImagenBoton(JButton boton, String ruta){
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icono); 
    }
}
