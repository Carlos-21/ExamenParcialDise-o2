/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;



import Clases.Pasajero;
import Clases.Viaje;
import Estructuras.ListaEnlazada;
import Frames.propiedad.Directorio;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;


/**
 *
 * @author Seven
 */
public class AgregarPasajero extends javax.swing.JFrame {
    private ListaEnlazada<Pasajero> pasajeros;
    private ListaEnlazada<Viaje> vuelos;
    private int asientosDisponibles;
    private Viaje auxiliar;
    private Date fecha;
    
    public AgregarPasajero() {
        initComponents();
        Directorio.ponerImagenLabel(FondoRegistrarPasajero, Directorio.fondo);
    }

    public ListaEnlazada<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ListaEnlazada<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setVuelos(ListaEnlazada<Viaje> vuelos) {
        this.vuelos = vuelos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
        SpinnerNumberModel modelo = new SpinnerNumberModel();
        modelo.setMaximum(this.asientosDisponibles);
        modelo.setMinimum(1);
        numeroAsiento.setModel(modelo);
        numeroAsiento.setValue(1);
    }

    public void setAuxiliar(Viaje auxiliar) {
        this.auxiliar = auxiliar;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleReservarVuelo = new javax.swing.JLabel();
        NombrePasajeroLabel = new javax.swing.JLabel();
        TelefonoLabel = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        NumAsientoLabel = new javax.swing.JLabel();
        numeroAsiento = new javax.swing.JSpinner();
        DNILabel = new javax.swing.JLabel();
        textoDNI = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        ButtonAceptar = new javax.swing.JButton();
        NombrePasajeroLabel1 = new javax.swing.JLabel();
        textoApellido = new javax.swing.JTextField();
        FondoRegistrarPasajero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleReservarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        TitleReservarVuelo.setForeground(new java.awt.Color(153, 0, 0));
        TitleReservarVuelo.setText("Registrar pasajero");
        getContentPane().add(TitleReservarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 360, 50));

        NombrePasajeroLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        NombrePasajeroLabel.setForeground(new java.awt.Color(0, 102, 153));
        NombrePasajeroLabel.setText("Nombres");
        getContentPane().add(NombrePasajeroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 25));

        TelefonoLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        TelefonoLabel.setForeground(new java.awt.Color(0, 102, 153));
        TelefonoLabel.setText("Teléfono");
        getContentPane().add(TelefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 130, 25));

        textoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 320, 30));

        textoTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        getContentPane().add(textoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 320, 30));

        NumAsientoLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        NumAsientoLabel.setForeground(new java.awt.Color(0, 102, 153));
        NumAsientoLabel.setText("Nº asiento");
        getContentPane().add(NumAsientoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 130, 25));

        numeroAsiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        numeroAsiento.setRequestFocusEnabled(false);
        numeroAsiento.setValue(1);
        getContentPane().add(numeroAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 90, 30));

        DNILabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        DNILabel.setForeground(new java.awt.Color(0, 102, 153));
        DNILabel.setText("DNI");
        getContentPane().add(DNILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, 25));

        textoDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        getContentPane().add(textoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, 30));

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
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 130, 40));

        ButtonAceptar.setBackground(new java.awt.Color(102, 102, 255));
        ButtonAceptar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        ButtonAceptar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAceptar.setText("Aceptar");
        ButtonAceptar.setBorder(null);
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 130, 40));

        NombrePasajeroLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        NombrePasajeroLabel1.setForeground(new java.awt.Color(0, 102, 153));
        NombrePasajeroLabel1.setText("Apellidos");
        getContentPane().add(NombrePasajeroLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 130, 25));

        textoApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        getContentPane().add(textoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 320, 30));
        getContentPane().add(FondoRegistrarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 553));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        RegistrarReserva reservar = new RegistrarReserva();
        reservar.setVisible(true);
        reservar.setLocationRelativeTo(null);
        
        reservar.setVuelos(vuelos);
        reservar.setPasajeros(pasajeros);
        reservar.setAuxiliar(auxiliar, vuelos, fecha);
        
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        String nombre = textoNombre.getText();
        String apellido = textoApellido.getText();
        int telefono = Integer.parseInt(textoTelefono.getText());
        int dni = Integer.parseInt(textoDNI.getText());
        int asiento = Integer.parseInt(String.valueOf (numeroAsiento.getValue()));

        Pasajero pasajero = null;
        if(!nombre.isEmpty() && !apellido.isEmpty() && telefono!=0 && dni!=0 && asiento!=0){
            pasajero = new Pasajero(nombre, apellido, telefono, dni, asiento);
            pasajeros.insertarAlInicio(pasajero);
        }

        if(pasajero != null){
            JOptionPane.showMessageDialog(null, "Pasajero correctamente registrado");
            
            auxiliar.getAsientos()[asiento-1].setEstado(false);
            RegistrarReserva reservar = new RegistrarReserva();
            reservar.setVisible(true);
            reservar.setLocationRelativeTo(null);
        
            reservar.setPasajeros(pasajeros);
            reservar.setVuelos(vuelos);
            reservar.setAuxiliar(auxiliar, vuelos, fecha);
            reservar.LLenarTabla();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Falta un dato del pasajero");
        }       
    }//GEN-LAST:event_ButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPasajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JLabel DNILabel;
    private javax.swing.JLabel FondoRegistrarPasajero;
    private javax.swing.JLabel NombrePasajeroLabel;
    private javax.swing.JLabel NombrePasajeroLabel1;
    private javax.swing.JLabel NumAsientoLabel;
    private javax.swing.JLabel TelefonoLabel;
    private javax.swing.JLabel TitleReservarVuelo;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JSpinner numeroAsiento;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoDNI;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
