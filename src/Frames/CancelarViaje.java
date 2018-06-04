/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Viaje;
import Estructuras.ListaEnlazada;
import Frames.propiedad.Directorio;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Seven
 */
public class CancelarViaje extends javax.swing.JFrame {
    private ListaEnlazada<Viaje> vuelos;
    
    public CancelarViaje() {
        initComponents();
        Directorio.ponerImagenLabel(FondoMenu, Directorio.fondo);
        vuelos = new ListaEnlazada<>();
    }

    public ListaEnlazada<Viaje> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ListaEnlazada<Viaje> vuelos) {
        this.vuelos = vuelos;
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleCancelarVuelo = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        NumeroVueloLabel = new javax.swing.JLabel();
        textoNumeroVuelo = new javax.swing.JTextField();
        detalleVuelo = new javax.swing.JLabel();
        FondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleCancelarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        TitleCancelarVuelo.setForeground(new java.awt.Color(153, 0, 0));
        TitleCancelarVuelo.setText("Cancelar viaje");
        getContentPane().add(TitleCancelarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 290, 50));

        botonCancelar.setBackground(new java.awt.Color(102, 102, 255));
        botonCancelar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelar.setText("Cancelar");
        botonCancelar.setActionCommand("CANCELAR");
        botonCancelar.setBorder(null);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 435, 130, 40));

        botonAceptar.setBackground(new java.awt.Color(102, 102, 255));
        botonAceptar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(0, 0, 0));
        botonAceptar.setText("Aceptar");
        botonAceptar.setBorder(null);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 435, 130, 40));

        NumeroVueloLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        NumeroVueloLabel.setForeground(new java.awt.Color(0, 102, 153));
        NumeroVueloLabel.setText("Número de viaje ");
        getContentPane().add(NumeroVueloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 123, -1, -1));

        textoNumeroVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNumeroVueloActionPerformed(evt);
            }
        });
        getContentPane().add(textoNumeroVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 238, 30));

        detalleVuelo.setBackground(new java.awt.Color(255, 204, 204));
        detalleVuelo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        detalleVuelo.setForeground(new java.awt.Color(0, 102, 153));
        detalleVuelo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de viaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 102, 153))); // NOI18N
        getContentPane().add(detalleVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 460, 210));
        getContentPane().add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
        
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        menu.setVuelos(vuelos);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        String Nvuelo = textoNumeroVuelo.getText();
        
        int longitud = vuelos.longitud;
        String detalle = new String();      
        
        Iterator<Viaje> ITVuelo = vuelos.getDescendingIterator();
        int i = 0;
        
        boolean bandera = false;
        
        while(ITVuelo.hasNext() && i < longitud){
            Viaje vuelo = ITVuelo.next();
            if(vuelo.getNumeroVuelo().equals(Nvuelo)){
                detalle = "<html>"+
                                        "<p>Número de viaje : " + vuelo.getNumeroVuelo() + "</p>"+
                                        "<p>Origen :" + vuelo.getOrigen() + "</p>"+
                                        "<p>Destino :" + vuelo.getDestino() + "</p>"+
                                        "<p>Asientos disponibles :" + (vuelo.getAsientos().length-vuelo.asientosReservados()) + "</p>"+
                                        "<p>Asientos vendidos :" + vuelo.asientosReservados() + "</p>"+
                              "</html>";
                bandera = true;
                vuelos.eliminar(vuelo);
            }
        }
        
        detalleVuelo.setText(detalle);
        
        if(bandera == true){
            JOptionPane.showMessageDialog(null, "Se ha cancelado el viaje.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Viaje no encontrado.");
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void textoNumeroVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNumeroVueloActionPerformed
        String Nvuelo = textoNumeroVuelo.getText();
        
        int longitud = vuelos.longitud;
        String detalle = new String();      
        
        Iterator<Viaje> ITVuelo = vuelos.getDescendingIterator();
        int i = 0;
        
        boolean bandera = false;
        
        while(ITVuelo.hasNext() && i < longitud){
            Viaje vuelo = ITVuelo.next();
            if(vuelo.getNumeroVuelo().equals(Nvuelo)){
                detalle = "<html>"+
                                        "<p>Número de viaje : " + vuelo.getNumeroVuelo() + "</p>"+
                                        "<p>Origen :" + vuelo.getOrigen() + "</p>"+
                                        "<p>Destino :" + vuelo.getDestino() + "</p>"+
                                        "<p>Asientos disponibles :" + (vuelo.getAsientos().length-vuelo.asientosReservados()) + "</p>"+
                                        "<p>Asientos vendidos :" + vuelo.asientosReservados() + "</p>"+
                              "</html>";
                bandera = true;
                vuelos.eliminar(vuelo);
            }
        }
        
        detalleVuelo.setText(detalle);
        
        if(bandera == true){
            JOptionPane.showMessageDialog(null, "Se ha cancelado el viaje.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Viaje no encontrado.");
        }
    }//GEN-LAST:event_textoNumeroVueloActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CancelarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelarViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoMenu;
    private javax.swing.JLabel NumeroVueloLabel;
    private javax.swing.JLabel TitleCancelarVuelo;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel detalleVuelo;
    private javax.swing.JTextField textoNumeroVuelo;
    // End of variables declaration//GEN-END:variables
}
