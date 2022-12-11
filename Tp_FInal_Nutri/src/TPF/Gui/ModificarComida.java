/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPF.Gui;

import TPF.Control.ComidaData;
import TPF.Modelo.Comida;
import TPF.Modelo.Paciente;

/**
 *
 * @author Moon
 */
public class ModificarComida extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarComida
     */
    public ModificarComida() {
        initComponents();
        jBGuardar.setEnabled(false);
        ComidaData CD = new ComidaData();
        for (Comida comida : CD.mostrarComidas()) {
            jCBComida.addItem(comida);
        }
        jCBComida.setSelectedItem(null);
        jBBorrar.setEnabled(false);
        
        jTFNombre.setText("");
        jTFCalorias.setText("");
        jTFDetalles.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBComida = new javax.swing.JComboBox<>();
        jTFDetalles = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jLCalorias = new javax.swing.JLabel();
        jLDetalles = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFCalorias = new javax.swing.JTextField();
        jBBorrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Modificar Comida");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 450, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 450, 40));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel1.setText("Elija la comida que quiere modificar/eliminar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jCBComida.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jCBComida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBComidaItemStateChanged(evt);
            }
        });
        getContentPane().add(jCBComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 410, -1));

        jTFDetalles.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jTFDetalles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFDetallesKeyReleased(evt);
            }
        });
        getContentPane().add(jTFDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 310, 127));

        jBGuardar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setMaximumSize(new java.awt.Dimension(79, 27));
        jBGuardar.setMinimumSize(new java.awt.Dimension(79, 27));
        jBGuardar.setPreferredSize(new java.awt.Dimension(79, 27));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 110, 30));

        jBCerrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBCerrar.setText("Cerrar");
        jBCerrar.setMaximumSize(new java.awt.Dimension(79, 27));
        jBCerrar.setMinimumSize(new java.awt.Dimension(79, 27));
        jBCerrar.setPreferredSize(new java.awt.Dimension(79, 27));
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 110, 30));

        jBLimpiar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setMaximumSize(new java.awt.Dimension(79, 27));
        jBLimpiar.setMinimumSize(new java.awt.Dimension(79, 27));
        jBLimpiar.setPreferredSize(new java.awt.Dimension(79, 27));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 110, 30));

        jLNombre.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLNombre.setText("Nombre");
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLCalorias.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLCalorias.setText("Calorías");
        getContentPane().add(jLCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLDetalles.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDetalles.setText("Detalles");
        getContentPane().add(jLDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jTFNombre.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });
        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNombreKeyReleased(evt);
            }
        });
        getContentPane().add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 310, -1));

        jTFCalorias.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jTFCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCaloriasKeyReleased(evt);
            }
        });
        getContentPane().add(jTFCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 310, -1));

        jBBorrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.setMaximumSize(new java.awt.Dimension(79, 27));
        jBBorrar.setMinimumSize(new java.awt.Dimension(79, 27));
        jBBorrar.setPreferredSize(new java.awt.Dimension(79, 27));
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/fondochico.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, 676));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        ComidaData CD = new ComidaData();
        ComidaData CD1 = new ComidaData();
        
        CD.modificarComida((Comida) jCBComida.getSelectedItem(), jTFNombre.getText(), jTFDetalles.getText(), Integer.parseInt(jTFCalorias.getText()));
        
        jCBComida.removeAllItems();
        
        for (Comida comida : CD1.mostrarComidas()) {
            jCBComida.addItem(comida);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTFNombre.setText("");
        jTFCalorias.setText("");
        jTFDetalles.setText("");
        jBGuardar.setEnabled(false);
        jCBComida.setSelectedItem(null);
        jBBorrar.setEnabled(false);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        ComidaData CD = new ComidaData();
        ComidaData CD1 = new ComidaData();
//        CD.eliminarComida(((Comida)jCBComida.getSelectedItem()).getId());
        CD.deleteComida(((Comida)jCBComida.getSelectedItem()).getId());
        System.out.println(((Comida)jCBComida.getSelectedItem()).getId());
        
        jCBComida.removeAllItems();
        
        for (Comida comida : CD1.mostrarComidas()) {
            jCBComida.addItem(comida);
        }
        
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTFNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTFNombreKeyReleased

    private void jTFCaloriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCaloriasKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTFCaloriasKeyReleased

    private void jTFDetallesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDetallesKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTFDetallesKeyReleased

    private void jCBComidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBComidaItemStateChanged
        if (jCBComida.getSelectedItem() != null) {
            jTFNombre.setText(String.valueOf(((Comida) jCBComida.getSelectedItem()).getNombre()));
            jTFCalorias.setText(String.valueOf(((Comida) jCBComida.getSelectedItem()).getCalorias()));
            jTFDetalles.setText(String.valueOf(((Comida) jCBComida.getSelectedItem()).getDetalles()));
            jBBorrar.setEnabled(true);
            jBGuardar.setEnabled(true);
        } else {
            jBGuardar.setEnabled(false);
            
        }
    }//GEN-LAST:event_jCBComidaItemStateChanged
    
    public void habilitarBoton() {
        if (jTFNombre.getText().equals("") || jTFCalorias.getText().equals("")) {
            jBGuardar.setEnabled(false);
        } else {
            jBGuardar.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<Comida> jCBComida;
    private javax.swing.JLabel jLCalorias;
    private javax.swing.JLabel jLDetalles;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTFCalorias;
    private javax.swing.JTextField jTFDetalles;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
