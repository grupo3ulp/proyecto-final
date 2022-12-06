/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPF.Gui;

import TPF.Control.ComidaData;
import TPF.Modelo.Comida;

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
        ComidaData CD = new ComidaData();
        for (Comida comida : CD.mostrarComidas()) {
            jCBComida.addItem(comida);
        }
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

        jLTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLTitulo.setText("Modificar Comida");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel2.setText("Datos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 40));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel1.setText("Elija la comida que quiere modificar/eliminar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jCBComida.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        getContentPane().add(jCBComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 410, -1));

        jTFDetalles.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        getContentPane().add(jTFDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 310, 127));

        jBGuardar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        jBCerrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, 110, -1));

        jBLimpiar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, -1));

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
        getContentPane().add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 310, -1));

        jTFCalorias.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        getContentPane().add(jTFCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 310, -1));

        jBBorrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        fondo.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TPF/Gui/fondo_frames_chico.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        ComidaData CD = new ComidaData();
        CD.modificarComida((Comida)jCBComida.getSelectedItem(), jTFNombre.getText(), jTFDetalles.getText(), Integer.parseInt(jTFCalorias.getText()));
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTFNombre.setText("");
        jTFCalorias.setText("");
        jTFDetalles.setText("");
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        ComidaData CD = new ComidaData();
        CD.eliminarComida(((Comida)jCBComida.getSelectedItem()).getId());
    }//GEN-LAST:event_jBBorrarActionPerformed


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
