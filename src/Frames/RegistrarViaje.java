/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Asiento;
import Clases.Viaje;
import Estructuras.ListaEnlazada;
import Frames.propiedad.Directorio;
import javax.swing.JOptionPane;

/**
 *
 * @author Seven
 */
public class RegistrarViaje extends javax.swing.JFrame {
    private ListaEnlazada<Viaje> vuelos;
    
    public RegistrarViaje() {
        initComponents();
        Directorio.ponerImagenLabel(FondoReservarVuelo, Directorio.fondo);
        vuelos = new ListaEnlazada<Viaje>();
    }

    public void setVuelos(ListaEnlazada<Viaje> vuelos) {
        this.vuelos = vuelos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        TitleReservarVuelo = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        listaOrigen = new javax.swing.JComboBox<>();
        label3 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        ButtonRegistrar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        listaDestino = new javax.swing.JComboBox<>();
        label6 = new javax.swing.JLabel();
        textoNumeroVuelo = new javax.swing.JTextField();
        textoCopiloto = new javax.swing.JTextField();
        textoPiloto = new javax.swing.JTextField();
        textoAsiento = new javax.swing.JTextField();
        FondoReservarVuelo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 102, 153));
        label1.setText("Número de viaje");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 26));

        TitleReservarVuelo.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        TitleReservarVuelo.setForeground(new java.awt.Color(153, 0, 0));
        TitleReservarVuelo.setText("Registrar viaje");
        getContentPane().add(TitleReservarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 300, 40));

        label4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 102, 153));
        label4.setText("Cantidad de asientos");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, 26));

        label2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 102, 153));
        label2.setText("Ciudad de origen");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 26));

        listaOrigen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lima", "Trujillo", "Arequipa", "Chiclayo", "Loreto" }));
        getContentPane().add(listaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 200, 30));

        label3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 102, 153));
        label3.setText("Ciudad de destino");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 180, 26));

        label5.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 102, 153));
        label5.setText("Nombre de conductor");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 372, 220, 26));

        ButtonRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        ButtonRegistrar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        ButtonRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistrar.setText("Registrar");
        ButtonRegistrar.setBorder(null);
        ButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 150, 40));

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
        getContentPane().add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 160, 40));

        listaDestino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lima", "Trujillo", "Arequipa", "Chiclayo", "Loreto" }));
        listaDestino.setSelectedIndex(1);
        getContentPane().add(listaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 200, 30));

        label6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 102, 153));
        label6.setText("Nombre de terramoza");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 422, 230, 26));
        getContentPane().add(textoNumeroVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 200, 30));
        getContentPane().add(textoCopiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 200, 30));
        getContentPane().add(textoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 200, 30));
        getContentPane().add(textoAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 200, 30));
        getContentPane().add(FondoReservarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 580));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        this.dispose();
        
        menu.setVuelos(vuelos);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarActionPerformed
        String numero = textoNumeroVuelo.getText();
        int cantidadAsientos = Integer.parseInt(textoAsiento.getText());
        String origen = String.valueOf(listaOrigen.getSelectedItem());
        String destino = String.valueOf(listaDestino.getSelectedItem());
        String piloto = textoPiloto.getText();
        String copiloto = textoCopiloto.getText();
        
        Asiento[] asientos = new Asiento[cantidadAsientos];
        for (int i = 0; i < cantidadAsientos; i++) {
            Asiento asiento = new Asiento(i+1, true);
            asientos[i] = asiento;
        }
        
        Viaje vueloNuevo = null;
        if(!numero.isEmpty() && cantidadAsientos != 0 && !origen.isEmpty() && 
                !destino.isEmpty() && !piloto.isEmpty() &&!copiloto.isEmpty()){
            vueloNuevo = new Viaje(numero, origen, destino, asientos, piloto, copiloto);
        }
        if(vueloNuevo != null){
            vuelos.insertarAlInicio(vueloNuevo);
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
            Menu menu = new Menu();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
        
            this.dispose();
        
            menu.setVuelos(vuelos);
        }
        else{
            JOptionPane.showMessageDialog(null, "Falta un campo por escribir.");
        }      
    }//GEN-LAST:event_ButtonRegistrarActionPerformed
    
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
            java.util.logging.Logger.getLogger(RegistrarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonRegistrar;
    private javax.swing.JLabel FondoReservarVuelo;
    private javax.swing.JLabel TitleReservarVuelo;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JComboBox<String> listaDestino;
    private javax.swing.JComboBox<String> listaOrigen;
    private javax.swing.JTextField textoAsiento;
    private javax.swing.JTextField textoCopiloto;
    private javax.swing.JTextField textoNumeroVuelo;
    private javax.swing.JTextField textoPiloto;
    // End of variables declaration//GEN-END:variables
}
