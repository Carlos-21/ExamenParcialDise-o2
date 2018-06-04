/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Viaje;
import Estructuras.ListaEnlazada;
import Frames.propiedad.Directorio;

/**
 *
 * @author Seven
 */
public class Menu extends javax.swing.JFrame {
    private ListaEnlazada<Viaje> vuelos;
    
    public Menu() {
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

        TitleMenu = new javax.swing.JLabel();
        ButtonReservarVuelo = new javax.swing.JButton();
        ButtonCancelarReserva = new javax.swing.JButton();
        ButtonCancelarVuelo = new javax.swing.JButton();
        ButtonRegistrarVuelo = new javax.swing.JButton();
        FondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleMenu.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        TitleMenu.setForeground(new java.awt.Color(153, 0, 0));
        TitleMenu.setText("MENÚ PRINCIPAL");
        getContentPane().add(TitleMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 50, 440, 60));

        ButtonReservarVuelo.setBackground(new java.awt.Color(102, 102, 255));
        ButtonReservarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        ButtonReservarVuelo.setForeground(new java.awt.Color(0, 0, 0));
        ButtonReservarVuelo.setText("Registrar Reserva");
        ButtonReservarVuelo.setActionCommand("");
        ButtonReservarVuelo.setBorder(null);
        ButtonReservarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReservarVueloActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonReservarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 270, 50));

        ButtonCancelarReserva.setBackground(new java.awt.Color(102, 102, 255));
        ButtonCancelarReserva.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        ButtonCancelarReserva.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelarReserva.setText("Cancelar Reserva");
        ButtonCancelarReserva.setBorder(null);
        ButtonCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCancelarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 270, 50));

        ButtonCancelarVuelo.setBackground(new java.awt.Color(102, 102, 255));
        ButtonCancelarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        ButtonCancelarVuelo.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelarVuelo.setText("Cancelar Viaje");
        ButtonCancelarVuelo.setBorder(null);
        ButtonCancelarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarVueloActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCancelarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 230, 270, 50));

        ButtonRegistrarVuelo.setBackground(new java.awt.Color(102, 102, 255));
        ButtonRegistrarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        ButtonRegistrarVuelo.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistrarVuelo.setText("Registrar Viaje");
        ButtonRegistrarVuelo.setActionCommand("");
        ButtonRegistrarVuelo.setBorder(null);
        ButtonRegistrarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarVueloActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRegistrarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 150, 270, 50));
        getContentPane().add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarReservaActionPerformed
        this.dispose();
        
        CancelarReserva reserva = new CancelarReserva();
        reserva.setVisible(true);
        reserva.setLocationRelativeTo(null);
        
        reserva.setVuelos(vuelos);     
    }//GEN-LAST:event_ButtonCancelarReservaActionPerformed

    private void ButtonReservarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReservarVueloActionPerformed
        this.dispose();
        
        RegistrarReserva reserva = new RegistrarReserva();
        reserva.setVisible(true);
        reserva.setLocationRelativeTo(null);
      
        reserva.setVuelos(vuelos);
    }//GEN-LAST:event_ButtonReservarVueloActionPerformed

    private void ButtonCancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarVueloActionPerformed
        this.dispose();
        
        CancelarViaje cancelar = new CancelarViaje();
        cancelar.setVisible(true);
        cancelar.setLocationRelativeTo(null);
        
        cancelar.setVuelos(vuelos);
    }//GEN-LAST:event_ButtonCancelarVueloActionPerformed

    private void ButtonRegistrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarVueloActionPerformed
        this.dispose();
        
        RegistrarViaje vuelo = new RegistrarViaje();
        vuelo.setVisible(true);
        vuelo.setLocationRelativeTo(null);
        
        vuelo.setVuelos(vuelos);
    }//GEN-LAST:event_ButtonRegistrarVueloActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarReserva;
    private javax.swing.JButton ButtonCancelarVuelo;
    private javax.swing.JButton ButtonRegistrarVuelo;
    private javax.swing.JButton ButtonReservarVuelo;
    private javax.swing.JLabel FondoMenu;
    private javax.swing.JLabel TitleMenu;
    // End of variables declaration//GEN-END:variables
}
