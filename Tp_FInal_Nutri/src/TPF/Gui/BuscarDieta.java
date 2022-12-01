/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package TPF.Gui;

import TPF.Control.DietaData;
import TPF.Control.PacienteData;
import TPF.Modelo.Dieta;
import TPF.Modelo.Paciente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dante
 */
public class BuscarDieta extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    
    public BuscarDieta() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabecera();
        TDieta.setEnabled(false);
  
        PacienteData pacienteData = new PacienteData();
        
        
        for (Paciente paciente : pacienteData.readAllPaciente()) {
            
           ListaDB.addItem(paciente);
            
        }
    }
    
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Fecha de inicio");
        columnas.add("Fecha final");
        columnas.add("Peso inicial");
        columnas.add("Peso deseado");
        columnas.add("Limite calorico");
        
        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        
        TDieta.setModel(modelo);
    }
    
    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TDieta = new javax.swing.JTable();
        BDBuscar = new javax.swing.JButton();
        ListaDB = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Dieta");

        TDieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TDieta);

        BDBuscar.setText("Buscar");
        BDBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 243, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(BDBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(355, 355, 355))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ListaDB, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ListaDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(BDBuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BDBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDBuscarActionPerformed
        DietaData dietaData = new DietaData();
        borrarFilasTabla();
        for (Dieta dieta : dietaData.readAllDieta()) {
            if (((Paciente)ListaDB.getSelectedItem()).getId() == dieta.getId_paciente()) {
                modelo.addRow(new Object[]{dieta.getFecha_incio(), dieta.getFecha_fin(), dieta.getPeso_inicial(), dieta.getPeso_deseado(), dieta.getLimite_calorico()});
            }
        }
    }//GEN-LAST:event_BDBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDBuscar;
    private javax.swing.JComboBox<Object> ListaDB;
    private javax.swing.JTable TDieta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}