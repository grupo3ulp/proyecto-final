/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPF.Gui;

import TPF.Control.DietaData;
import TPF.Control.ItemdietaData;
import TPF.Modelo.Dieta;
import TPF.Modelo.Itemdieta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moon
 */
public class BuscarItemdieta extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    /**
     * Creates new form BuscarItemdieta
     */
    public BuscarItemdieta() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabecera();

        DietaData DD = new DietaData();

        for (Dieta dieta : DD.readAllDieta()) {
            jCBItemdieta.addItem(dieta);
        }

        CBCantidad.setEnabled(false);
        CBDia.setEnabled(false);
        jBGuardar.setEnabled(false);
    }

    private void armarCabecera() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Comida");
        columnas.add("Detalles");
        columnas.add("Porciones");
        columnas.add("Día");

        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        jTItemdieta.setModel(modelo);
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTItemdieta = new javax.swing.JTable();
        jBVolver = new javax.swing.JButton();
        jCBItemdieta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLPorciones = new javax.swing.JLabel();
        jLDia = new javax.swing.JLabel();
        CBDia = new javax.swing.JComboBox<>();
        CBCantidad = new javax.swing.JComboBox<>();
        jRBModificar = new javax.swing.JRadioButton();
        jBGuardar = new javax.swing.JButton();
        jRBEliminar = new javax.swing.JRadioButton();

        jLabel1.setText("Mostrar plan alimenticio");

        jTItemdieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTItemdieta);

        jBVolver.setText("Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        jCBItemdieta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBItemdietaItemStateChanged(evt);
            }
        });

        jLabel2.setText("Elegir la dieta que quiere ver en detalle");

        jLPorciones.setText("Porciones");

        jLDia.setText("Día");

        CBDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jRBModificar.setText("Modificar");
        jRBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBModificarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jRBEliminar.setText("Eliminar de la dieta");
        jRBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBEliminar)
                    .addComponent(jLabel2)
                    .addComponent(jCBItemdieta, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(245, 245, 245)
                            .addComponent(jBVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBGuardar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPorciones)
                            .addComponent(jLDia)
                            .addComponent(jRBModificar))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CBCantidad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBDia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jCBItemdieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jRBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPorciones)
                    .addComponent(CBCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDia)
                    .addComponent(CBDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jRBEliminar)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVolver)
                    .addComponent(jBGuardar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBItemdietaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBItemdietaItemStateChanged
        borrarFilasTabla();
        ItemdietaData idd = new ItemdietaData();
        idd.detallesDieta(((Dieta) jCBItemdieta.getSelectedItem()).getId(), modelo);
    }//GEN-LAST:event_jCBItemdietaItemStateChanged

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void jRBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBModificarActionPerformed
        if (jRBModificar.isSelected()) {
            CBCantidad.setEnabled(true);
            CBDia.setEnabled(true);
            jBGuardar.setEnabled(true);
            jRBEliminar.setSelected(false);
        } else {
            CBCantidad.setEnabled(false);
            CBDia.setEnabled(false);
            jBGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jRBModificarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        ItemdietaData idd = new ItemdietaData();
        int fila = jTItemdieta.getSelectedRow();
        String comida = (String) modelo.getValueAt(fila, 0);
        int cantidad = (int) modelo.getValueAt(fila, 2);
        int dia = (int) modelo.getValueAt(fila, 3);

        int id_dieta = ((Dieta) jCBItemdieta.getSelectedItem()).getId();
        int id_item = idd.encontrarID(id_dieta, comida, dia, cantidad);

        if (jRBEliminar.isSelected()) {
            idd.deleteItemDieta(id_item);
        } else {
            idd.updateItemDieta(id_item,Integer.valueOf(CBCantidad.getSelectedItem().toString()), Integer.valueOf(CBDia.getSelectedItem().toString()), true);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jRBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEliminarActionPerformed
        if (jRBEliminar.isSelected()) {
            jRBModificar.setSelected(false);
            CBCantidad.setEnabled(false);
            CBDia.setEnabled(false);
            jBGuardar.setEnabled(true);
        } else {
            jBGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jRBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCantidad;
    private javax.swing.JComboBox<String> CBDia;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JComboBox<Object> jCBItemdieta;
    private javax.swing.JLabel jLDia;
    private javax.swing.JLabel jLPorciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBEliminar;
    private javax.swing.JRadioButton jRBModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTItemdieta;
    // End of variables declaration//GEN-END:variables
}
