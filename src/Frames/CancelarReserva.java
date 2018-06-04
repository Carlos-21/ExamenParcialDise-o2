/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Pasajero;
import Clases.Reserva;
import Clases.Viaje;
import Estructuras.ListaEnlazada;
import Frames.propiedad.Directorio;
import java.util.Iterator;
import javax.swing.JOptionPane;


/**
 *
 * @author Seven
 */
public class CancelarReserva extends javax.swing.JFrame {
    private ListaEnlazada<Viaje> vuelos;
    
    public CancelarReserva() {
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
        NombreLabel = new javax.swing.JLabel();
        textoDNI = new javax.swing.JTextField();
        DetallePasajero = new javax.swing.JLabel();
        NombreLabel1 = new javax.swing.JLabel();
        textoNumeroVuelo = new javax.swing.JTextField();
        radioPasajero = new javax.swing.JRadioButton();
        radioPasajeros = new javax.swing.JRadioButton();
        FondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleCancelarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        TitleCancelarVuelo.setForeground(new java.awt.Color(153, 0, 0));
        TitleCancelarVuelo.setText("Cancelar reserva");
        getContentPane().add(TitleCancelarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 40));

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
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 150, 40));

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
        getContentPane().add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 150, 40));

        NombreLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(0, 102, 153));
        NombreLabel.setText("Número de viaje");
        getContentPane().add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 30));
        getContentPane().add(textoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 260, 30));

        DetallePasajero.setBackground(new java.awt.Color(255, 204, 204));
        DetallePasajero.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        DetallePasajero.setForeground(new java.awt.Color(0, 102, 153));
        DetallePasajero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle del pasajero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 18), new java.awt.Color(0, 102, 153))); // NOI18N
        getContentPane().add(DetallePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 480, 220));

        NombreLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        NombreLabel1.setForeground(new java.awt.Color(0, 102, 153));
        NombreLabel1.setText("DNI del pasajero");
        getContentPane().add(NombreLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));
        getContentPane().add(textoNumeroVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 260, 30));

        radioPasajero.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        radioPasajero.setForeground(new java.awt.Color(0, 102, 153));
        radioPasajero.setSelected(true);
        radioPasajero.setText("Un pasajero");
        radioPasajero.setOpaque(false);
        radioPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPasajeroActionPerformed(evt);
            }
        });
        getContentPane().add(radioPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        radioPasajeros.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        radioPasajeros.setForeground(new java.awt.Color(0, 102, 153));
        radioPasajeros.setText("Varios pasajeros");
        radioPasajeros.setOpaque(false);
        radioPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPasajerosActionPerformed(evt);
            }
        });
        getContentPane().add(radioPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));
        getContentPane().add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        menu.setVuelos(vuelos);
        
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        int DNI = Integer.parseInt(textoDNI.getText());
        String numeroVuelo = textoNumeroVuelo.getText();
        
        String detalle = new String();
        
        int longitud = vuelos.longitud;

        Iterator<Viaje> ITVuelo = vuelos.getDescendingIterator();
        int i = 0;
        
        boolean band = false;
        
        while(ITVuelo.hasNext() && i < longitud && band == false){
            Viaje vuelo = ITVuelo.next();
            boolean bandera = false;
            
            Iterator<Reserva> ITReserva = vuelo.getReservas().getDescendingIterator();            
            
            if (vuelo.getNumeroVuelo().equals(numeroVuelo)) {
                if (radioPasajeros.isSelected()) {
                    while (ITReserva.hasNext() && bandera == false) {
                        Reserva reserva = ITReserva.next();
                        if (reserva.existePasajero(DNI)) {
                            detalle = reserva.existePasajero(DNI, detalle);
                            vuelo.getReservas().eliminar(reserva);
                            bandera = true;
                        }
                    }
                }

                if (radioPasajero.isSelected()) {
                    while (ITReserva.hasNext() && bandera == false) {
                        Reserva reserva = ITReserva.next();
                        Iterator<Pasajero> ITPasajero = reserva.getPasajeros().getDescendingIterator();
                        while (ITPasajero.hasNext() && bandera == false) {
                            Pasajero pasajero = ITPasajero.next();
                            if (pasajero.getDni() == DNI) {
                                detalle = "<html>"
                                        + "<p>DNI : " + pasajero.getDni() + "</p>"
                                        + "<p>Nombres :" + pasajero.getNombres() + "</p>"
                                        + "<p>Apellidos :" + pasajero.getApellidos() + "</p>"
                                        + "<p>Telefono :" + pasajero.getTelefono() + "</p>"
                                        + "<p>Asiento :" + pasajero.getAsiento() + "</p>"
                                        + "</html>";
                                bandera = true;
                                reserva.getPasajeros().eliminar(pasajero);
                            }
                        }
                    }
                }
                
                band = true;
            }
        }
        
        DetallePasajero.setText(detalle);
        
        if(band == true){
            JOptionPane.showMessageDialog(null, "Se ha cancelado la reserva. ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Psajero no encontrado. ");
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void radioPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPasajerosActionPerformed
        radioPasajero.setSelected(false);
    }//GEN-LAST:event_radioPasajerosActionPerformed

    private void radioPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPasajeroActionPerformed
        radioPasajeros.setSelected(false);
    }//GEN-LAST:event_radioPasajeroActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CancelarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DetallePasajero;
    private javax.swing.JLabel FondoMenu;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel NombreLabel1;
    private javax.swing.JLabel TitleCancelarVuelo;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JRadioButton radioPasajero;
    private javax.swing.JRadioButton radioPasajeros;
    private javax.swing.JTextField textoDNI;
    private javax.swing.JTextField textoNumeroVuelo;
    // End of variables declaration//GEN-END:variables
}
