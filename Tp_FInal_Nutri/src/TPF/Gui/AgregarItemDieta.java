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
import javax.swing.JOptionPane;

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
        jTFCalRestantes.setEditable(false);

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
        jLabel2 = new javax.swing.JLabel();
        jTFCalRestantes = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Planificar dieta");
        jLabel1.setMaximumSize(new java.awt.Dimension(221, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(221, 41));
        jLabel1.setPreferredSize(new java.awt.Dimension(248, 48));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 450, -1));

        CBDieta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CBDieta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBDietaItemStateChanged(evt);
            }
        });
        getContentPane().add(CBDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 320, -1));

        CBComida.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        getContentPane().add(CBComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 320, -1));

        jLDieta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDieta.setText("Dieta");
        getContentPane().add(jLDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 40, -1));

        jLComida.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLComida.setText("Comida");
        getContentPane().add(jLComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLPorciones.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLPorciones.setText("Porciones");
        getContentPane().add(jLPorciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLDia.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDia.setText("Día");
        getContentPane().add(jLDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        CBDia.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CBDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        getContentPane().add(CBDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 320, -1));

        CBCantidad.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(CBCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 320, -1));

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
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 110, 30));

        jBVolver.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBVolver.setText("Cerrar");
        jBVolver.setMaximumSize(new java.awt.Dimension(79, 27));
        jBVolver.setMinimumSize(new java.awt.Dimension(79, 27));
        jBVolver.setPreferredSize(new java.awt.Dimension(79, 27));
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 110, 30));

        jLabel2.setText("*Calorías restantes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 20));
        getContentPane().add(jTFCalRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 70, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/fondochico.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, 676));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        ItemdietaData ID = new ItemdietaData();
        
        if (ID.caloriasActuales(((Dieta) CBDieta.getSelectedItem()).getId()) + 
                ((Comida) CBComida.getSelectedItem()).getCalorias() < (((Dieta) CBDieta.getSelectedItem()).getLimite_calorico())) {
            Itemdieta item = new Itemdieta((Comida) CBComida.getSelectedItem(), (Dieta) CBDieta.getSelectedItem(), Integer.parseInt(CBCantidad.getSelectedItem().toString()), Integer.parseInt(CBDia.getSelectedItem().toString()));
            ID.createItemDieta(item);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la comida: Supera el límite calórico");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void CBDietaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBDietaItemStateChanged
        ItemdietaData ID = new ItemdietaData();
        int caloriasRestantes = (((Dieta) CBDieta.getSelectedItem()).getLimite_calorico()) - ID.caloriasActuales(((Dieta) CBDieta.getSelectedItem()).getId());
        jTFCalRestantes.setText(String.valueOf(caloriasRestantes));
    }//GEN-LAST:event_CBDietaItemStateChanged


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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTFCalRestantes;
    // End of variables declaration//GEN-END:variables
}
