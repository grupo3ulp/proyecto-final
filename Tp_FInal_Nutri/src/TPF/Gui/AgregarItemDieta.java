/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPF.Gui;

import TPF.Control.ComidaData;
import TPF.Control.DietaData;
import TPF.Control.ItemdietaData;
import TPF.Modelo.Comida;
import TPF.Modelo.Dieta;
import TPF.Modelo.Itemdieta;

/**
 *
 * @author Moon
 */
public class AgregarItemDieta extends javax.swing.JInternalFrame {

    /**
     * Creates new form ItemDieta
     */
    public AgregarItemDieta() {
        initComponents();
        setResizable(true);
        ComidaData CD = new ComidaData();
        DietaData DD = new DietaData();

        for (Comida comida : CD.mostrarComidas()) {
            CBComida.addItem(comida);
        }

        for (Dieta dieta : DD.readAllDieta()) {
            CBDieta.addItem(dieta);
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

        jLabel1 = new javax.swing.JLabel();
        CBDieta = new javax.swing.JComboBox<>();
        CBComida = new javax.swing.JComboBox<>();
        jLDieta = new javax.swing.JLabel();
        jLComida = new javax.swing.JLabel();
        jLPorciones = new javax.swing.JLabel();
        jLDia = new javax.swing.JLabel();
        CBDia = new javax.swing.JComboBox<>();
        CBCantidad = new javax.swing.JComboBox<>();
        jBGuardar = new javax.swing.JButton();
        jBVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel1.setText("Planificar dieta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        CBDieta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        getContentPane().add(CBDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 320, -1));

        CBComida.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        getContentPane().add(CBComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 320, -1));

        jLDieta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDieta.setText("Dieta");
        getContentPane().add(jLDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, -1));

        jLComida.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLComida.setText("Comida");
        getContentPane().add(jLComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLPorciones.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLPorciones.setText("Porciones");
        getContentPane().add(jLPorciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLDia.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDia.setText("Día");
        getContentPane().add(jLDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        CBDia.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CBDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        getContentPane().add(CBDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 320, -1));

        CBCantidad.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(CBCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 320, -1));

        jBGuardar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 90, -1));

        jBVolver.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBVolver.setText("Cerrar");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 90, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TPF/Gui/fondochico.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        ItemdietaData ID = new ItemdietaData();
        Itemdieta item = new Itemdieta((Comida)CBComida.getSelectedItem(), (Dieta)CBDieta.getSelectedItem(), Integer.parseInt(CBCantidad.getSelectedItem().toString()), Integer.parseInt(CBDia.getSelectedItem().toString()));
        ID.createItemDieta(item);
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCantidad;
    private javax.swing.JComboBox<Object> CBComida;
    private javax.swing.JComboBox<String> CBDia;
    private javax.swing.JComboBox<Object> CBDieta;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLComida;
    private javax.swing.JLabel jLDia;
    private javax.swing.JLabel jLDieta;
    private javax.swing.JLabel jLPorciones;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
