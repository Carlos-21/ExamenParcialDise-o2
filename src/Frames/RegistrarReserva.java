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
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Seven
 */
public class RegistrarReserva extends javax.swing.JFrame {

    private ListaEnlazada<Pasajero> pasajeros;
    private ListaEnlazada<Reserva> reservas;
    private DefaultTableModel tablaPasajeros;
    private ListaEnlazada<Viaje> vuelos;
    private Viaje auxiliar;

    public RegistrarReserva() {
        initComponents();
        Directorio.ponerImagenLabel(FondoReservarVuelo, Directorio.fondo);
        pasajeros = new ListaEnlazada<>();
        vuelos = new ListaEnlazada<>();
        reservas = new ListaEnlazada<>();
        auxiliar = null;
    }

    public ListaEnlazada<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ListaEnlazada<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public ListaEnlazada<Viaje> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ListaEnlazada<Viaje> vuelos) {
        this.vuelos = vuelos;

        Iterator<Viaje> ITVuelo = this.vuelos.getDescendingIterator();

        String inicial = null;
        boolean band = false;
        int cant = 0;
        
        while (ITVuelo.hasNext()) {
            Viaje v = ITVuelo.next();
            cant++;
            if (band == false) {
                inicial = v.getOrigen();
                band = true;
            }
            if( cant!= vuelos.longitud){
                listaOrigen.addItem(v.getOrigen());
            }           
            if (v.getOrigen().equals(inicial) && cant!= vuelos.longitud) {
                listaDestino.addItem(v.getDestino());
            }
        }
        this.repaint();
    }

    public void setAuxiliar(Viaje auxiliar, ListaEnlazada<Viaje> vuelos, Date fecha) {
        setVuelos(vuelos);
        this.auxiliar = auxiliar;
        fechaVuelo.setDate(fecha);
        listaOrigen.setSelectedItem(this.auxiliar.getOrigen());
        listaDestino.setSelectedItem(this.auxiliar.getDestino());
        textoNumeroVuelo.setText(this.auxiliar.getNumeroVuelo());
        textoAsientos.setText(String.valueOf(this.auxiliar.getAsientos().length - this.auxiliar.asientosReservados()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumeroVueloLabel = new javax.swing.JLabel();
        TitleReservarVuelo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AsientosDisponiblesLabel = new javax.swing.JLabel();
        ButtonReservar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        fechaVuelo = new com.toedter.calendar.JDateChooser();
        listaDestino = new javax.swing.JComboBox<>();
        textoAsientos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        listaOrigen = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaPasajeros = new javax.swing.JTable();
        ButtonRegistrarPasajero = new javax.swing.JButton();
        textoNumeroVuelo = new javax.swing.JTextField();
        FondoReservarVuelo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NumeroVueloLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        NumeroVueloLabel.setForeground(new java.awt.Color(0, 102, 153));
        NumeroVueloLabel.setText("Número de viaje");
        getContentPane().add(NumeroVueloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 95, -1, 30));

        TitleReservarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        TitleReservarVuelo.setForeground(new java.awt.Color(153, 0, 0));
        TitleReservarVuelo.setText("Registrar reserva");
        getContentPane().add(TitleReservarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 340, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 95, 70, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Destino");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, 30));

        AsientosDisponiblesLabel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        AsientosDisponiblesLabel.setForeground(new java.awt.Color(0, 102, 153));
        AsientosDisponiblesLabel.setText("Asientos disponibles");
        getContentPane().add(AsientosDisponiblesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 30));

        ButtonReservar.setBackground(new java.awt.Color(102, 102, 255));
        ButtonReservar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        ButtonReservar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonReservar.setText("Reservar");
        ButtonReservar.setBorder(null);
        ButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReservarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 150, 40));

        ButtonCancelar.setBackground(new java.awt.Color(102, 102, 255));
        ButtonCancelar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.setBorder(null);
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 150, 40));
        getContentPane().add(fechaVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 95, 170, 30));

        listaDestino.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        listaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(listaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 170, 30));

        textoAsientos.setEnabled(false);
        getContentPane().add(textoAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Origen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 30));

        listaOrigen.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        listaOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(listaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 150, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de pasajeros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 18), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaPasajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(ListaPasajeros);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 590, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 660, 250));

        ButtonRegistrarPasajero.setBackground(new java.awt.Color(102, 102, 255));
        ButtonRegistrarPasajero.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        ButtonRegistrarPasajero.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistrarPasajero.setText("Registrar pasajero");
        ButtonRegistrarPasajero.setBorder(null);
        ButtonRegistrarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarPasajeroActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRegistrarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 230, 40));

        textoNumeroVuelo.setEnabled(false);
        getContentPane().add(textoNumeroVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 95, 150, 30));
        getContentPane().add(FondoReservarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 660));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarPasajeroActionPerformed
        AgregarPasajero agregar = new AgregarPasajero();

        agregar.setPasajeros(pasajeros);
        agregar.setAsientosDisponibles(auxiliar.getAsientos().length - pasajeros.longitud);
        agregar.setVuelos(vuelos);
        agregar.setAuxiliar(auxiliar);
        agregar.setFecha(fechaVuelo.getDate());

        agregar.setVisible(true);
        agregar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButtonRegistrarPasajeroActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);

        this.dispose();

        menu.setVuelos(vuelos);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReservarActionPerformed
        int numero = Integer.parseInt(textoNumeroVuelo.getText());
        Date fecha = fechaVuelo.getDate();
        String tramo = String.valueOf(listaOrigen.getSelectedItem()) + "-"
                + String.valueOf(listaDestino.getSelectedItem());

        Reserva reserva = new Reserva(numero, fecha, tramo, pasajeros);
        reserva.setPasajeros(pasajeros);

        if (numero != 0 && fecha != null && !tramo.isEmpty()) {
            reservas.insertarAlInicio(reserva);
            auxiliar.setReservas(reservas);
            JOptionPane.showMessageDialog(null, "Reserva registrada");
        } else {
            JOptionPane.showMessageDialog(null, "No se han escrito en los campos necesarios");
        }
    }//GEN-LAST:event_ButtonReservarActionPerformed

    private void listaOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaOrigenActionPerformed
        String opcion = String.valueOf(listaOrigen.getSelectedItem());

        listaDestino.removeAllItems();
        Iterator<Viaje> ITVuelo = this.vuelos.getDescendingIterator();
        while (ITVuelo.hasNext()) {
            Viaje v = ITVuelo.next();
            if (v.getOrigen().equals(opcion)) {
                listaDestino.addItem(v.getDestino());
            }
        }
    }//GEN-LAST:event_listaOrigenActionPerformed

    private void listaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDestinoActionPerformed
        String origen = String.valueOf(listaOrigen.getSelectedItem());
        String destino = String.valueOf(listaDestino.getSelectedItem());

        boolean bandera = false;

        Iterator<Viaje> ITVuelo = this.vuelos.getDescendingIterator();
        while (ITVuelo.hasNext() && !bandera) {
            Viaje v = ITVuelo.next();
            if (v.getOrigen().equals(origen) && v.getDestino().equals(destino)) {
                textoNumeroVuelo.setText(v.getNumeroVuelo());
                textoAsientos.setText(String.valueOf(v.getAsientos().length - v.asientosReservados()));
                auxiliar = v;
                reservas = v.getReservas();
                bandera = true;
            }
        }

    }//GEN-LAST:event_listaDestinoActionPerformed

    public void LLenarTabla() {
        tablaPasajeros = new DefaultTableModel();

        String[] cabecera = {"DNI", "Nombres", "Apellidos", "Teléfono", "N° Asiento"};
        int longitud = pasajeros.longitud;
        String[][] datos = new String[longitud][5];

        Iterator<Pasajero> ITPasajero = pasajeros.getDescendingIterator();
        int i = 0;

        while (ITPasajero.hasNext() && i < longitud) {
            Pasajero p = ITPasajero.next();
            datos[i][0] = String.valueOf(p.getDni());
            datos[i][1] = String.valueOf(p.getNombres());
            datos[i][2] = String.valueOf(p.getApellidos());
            datos[i][3] = String.valueOf(p.getTelefono());
            datos[i][4] = String.valueOf(p.getAsiento());
            i++;
        }

        tablaPasajeros = new DefaultTableModel(datos, cabecera);
        ListaPasajeros.setModel(tablaPasajeros);
    }

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
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AsientosDisponiblesLabel;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonRegistrarPasajero;
    private javax.swing.JButton ButtonReservar;
    private javax.swing.JLabel FondoReservarVuelo;
    private javax.swing.JTable ListaPasajeros;
    private javax.swing.JLabel NumeroVueloLabel;
    private javax.swing.JLabel TitleReservarVuelo;
    private com.toedter.calendar.JDateChooser fechaVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaDestino;
    private javax.swing.JComboBox<String> listaOrigen;
    private javax.swing.JTextField textoAsientos;
    private javax.swing.JTextField textoNumeroVuelo;
    // End of variables declaration//GEN-END:variables
}
