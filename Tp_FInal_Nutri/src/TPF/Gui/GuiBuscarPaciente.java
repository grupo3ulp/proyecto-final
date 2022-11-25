/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package TPF.Gui;

import TPF.Control.DietaData;
import TPF.Control.PacienteData;
import TPF.Modelo.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heisen
 */
public class GuiBuscarPaciente extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    public GuiBuscarPaciente() {
        initComponents();
        btnBuscar.setEnabled(false);
        txtDni.setEditable(false);
        txtKilos.setEditable(false);

        modelo = new DefaultTableModel();
        armarCabecera();
    }

    private void armarCabecera() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("Domicilio");
        columnas.add("DNI");
        columnas.add("Telefono");
        columnas.add("Peso Actual");
        columnas.add("Peso Inicial");
        columnas.add("Peso Buscado");
        columnas.add("Kg a bajar *");
        columnas.add("Kg Bajados *");

        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }

        tPacientes.setModel(modelo);
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
        rbtnDni = new javax.swing.JRadioButton();
        rbtnTodos = new javax.swing.JRadioButton();
        rbtnKilos = new javax.swing.JRadioButton();
        txtKilos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPacientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Buscar Paciente");

        rbtnDni.setText("Por DNI");
        rbtnDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnDniMousePressed(evt);
            }
        });

        rbtnTodos.setText("Todos");
        rbtnTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnTodosMousePressed(evt);
            }
        });

        rbtnKilos.setText("Por kilos buscados");
        rbtnKilos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnKilosMousePressed(evt);
            }
        });

        txtKilos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKilosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilosKeyTyped(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tPacientes);

        jLabel2.setText("* Simbolo negativo significa que subio de peso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnKilos)
                    .addComponent(rbtnTodos)
                    .addComponent(rbtnDni))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKilos)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnKilos)
                    .addComponent(txtKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbtnTodos)
                .addGap(15, 15, 15)
                .addComponent(btnBuscar)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
     
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }

        if (txtDni.getText().length() > 14) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtKilosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilosKeyTyped
       
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n') && !c.equals('.')&&!c.equals('-')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_txtKilosKeyTyped

    private void rbtnDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnDniMousePressed
        if (!rbtnDni.isSelected()) {
            btnBuscar.setEnabled(false);
            txtDni.setEditable(true);
            txtKilos.setEditable(false);
            txtKilos.setText("");
            rbtnKilos.setSelected(false);
            rbtnTodos.setSelected(false);
        }


    }//GEN-LAST:event_rbtnDniMousePressed

    private void rbtnKilosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnKilosMousePressed
        if (!rbtnKilos.isSelected()) {
            btnBuscar.setEnabled(false);
            txtDni.setEditable(false);
            txtKilos.setEditable(true);
            txtDni.setText("");
            rbtnDni.setSelected(false);
            rbtnTodos.setSelected(false);
        }

    }//GEN-LAST:event_rbtnKilosMousePressed

    private void rbtnTodosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnTodosMousePressed
        if (!rbtnTodos.isSelected()) {
            txtDni.setEditable(false);
            txtKilos.setEditable(false);
            rbtnDni.setSelected(false);
            txtKilos.setText("");
            txtDni.setText("");
            rbtnKilos.setSelected(false);
            btnBuscar.setEnabled(true);
        }

    }//GEN-LAST:event_rbtnTodosMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        PacienteData pacienteData = new PacienteData();
        DietaData dietaData = new DietaData();
        borrarFilasTabla();

        if (rbtnDni.isSelected()) {
            Paciente aux = pacienteData.readPacienteDni(txtDni.getText());
            modelo.addRow(new Object[]{aux.getNombre(), aux.getApellido(), aux.getDomicilio(),
                aux.getDni(), aux.getTelefono(), aux.getPesoActual(), aux.getNombre(), aux.getNombre()});
        } else if (rbtnKilos.isSelected()) {
            pacienteData.readAllPacientePeso(Float.parseFloat(txtKilos.getText()), modelo);

        } else if (rbtnTodos.isSelected()) {
            pacienteData.readAllPaciente(modelo);
//            for (Paciente aux : pacienteData.readAllPaciente()) {
//                modelo.addRow(new Object[]{aux.getNombre(), aux.getApellido(), aux.getDomicilio(),
//                    aux.getDni(), aux.getTelefono(), aux.getPesoActual(), aux.getNombre(), aux.getNombre()});
//            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtKilosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilosKeyReleased
        if (txtDni.getText().isEmpty() && txtKilos.getText().isEmpty()) {
            btnBuscar.setEnabled(false);
        } else {
            btnBuscar.setEnabled(true);
        }

    }//GEN-LAST:event_txtKilosKeyReleased

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
         if (txtDni.getText().isEmpty() && txtKilos.getText().isEmpty()) {
            btnBuscar.setEnabled(false);
        } else {
            btnBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_txtDniKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnDni;
    private javax.swing.JRadioButton rbtnKilos;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JTable tPacientes;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtKilos;
    // End of variables declaration//GEN-END:variables
}
