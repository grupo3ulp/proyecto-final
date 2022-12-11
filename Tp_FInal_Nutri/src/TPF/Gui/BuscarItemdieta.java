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
import javax.swing.JOptionPane;
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
        jRBEliminar.setOpaque(false);
        jRBModificar.setOpaque(false);
        jRBEliminar.setEnabled(false);
        jRBModificar.setEnabled(false);
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
        fondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mostrar plan alimenticio");
        jLabel1.setMaximumSize(new java.awt.Dimension(263, 48));
        jLabel1.setMinimumSize(new java.awt.Dimension(263, 48));
        jLabel1.setPreferredSize(new java.awt.Dimension(263, 48));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 780, -1));

        jTItemdieta.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
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
        jTItemdieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTItemdietaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTItemdieta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 760, 210));

        jBVolver.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBVolver.setText("Cerrar");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 110, 30));

        jCBItemdieta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jCBItemdieta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBItemdietaItemStateChanged(evt);
            }
        });
        getContentPane().add(jCBItemdieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 453, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel2.setText("Elegir la dieta que quiere ver en detalle");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLPorciones.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLPorciones.setText("Porciones");
        getContentPane().add(jLPorciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jLDia.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDia.setText("Día");
        getContentPane().add(jLDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, 20));

        CBDia.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CBDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        getContentPane().add(CBDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 119, -1));

        CBCantidad.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(CBCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 119, -1));

        jRBModificar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jRBModificar.setText("Modificar");
        jRBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jRBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jBGuardar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setMaximumSize(new java.awt.Dimension(72, 27));
        jBGuardar.setMinimumSize(new java.awt.Dimension(72, 27));
        jBGuardar.setPreferredSize(new java.awt.Dimension(72, 27));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 110, 30));

        jRBEliminar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jRBEliminar.setText("Eliminar de la dieta");
        jRBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jRBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, -1));

        fondo.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/fondo_frames_tablas.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 676));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBItemdietaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBItemdietaItemStateChanged
        borrarFilasTabla();
        ItemdietaData idd = new ItemdietaData();
        idd.detallesDieta(((Dieta) jCBItemdieta.getSelectedItem()).getId(), modelo);
        jRBEliminar.setEnabled(false);
        jRBModificar.setEnabled(false);
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

            if ((JOptionPane.showConfirmDialog(null, "Borara el "
                    + "plan de comidas con id " + ((Itemdieta)jCBItemdieta.getSelectedItem()).getId() + " desea continuar?", "Confirmar Borrado",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE)) == 0) {
                idd.deleteItemDieta(id_item);

            }
        } else {
            idd.updateItemDieta(id_item, Integer.valueOf(CBCantidad.getSelectedItem().toString()), Integer.valueOf(CBDia.getSelectedItem().toString()), true);
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

    private void jTItemdietaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTItemdietaMouseReleased
        if (jTItemdieta.getSelectedRow() >= 0) {
            jRBEliminar.setEnabled(true);
            jRBModificar.setEnabled(true);
        } else {
            jRBEliminar.setEnabled(false);
            jRBModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jTItemdietaMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCantidad;
    private javax.swing.JComboBox<String> CBDia;
    private javax.swing.JLabel fondo;
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
