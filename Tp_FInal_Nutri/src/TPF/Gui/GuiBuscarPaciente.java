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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heisen
 */
public class GuiBuscarPaciente extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    PacienteData pacienteData = new PacienteData();
    private ArrayList<Paciente> pacientes = pacienteData.readAllPaciente();

    public GuiBuscarPaciente() {
        initComponents();
        PacienteData pacienteData = new PacienteData();
        btnBuscar.setEnabled(false);
        txtDni.setEditable(false);
        txtKilos.setEditable(false);
        modelo = new DefaultTableModel();
        armarCabecera();
        tPacientes.setEnabled(false);
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
        rbtnSinCumplir = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        rbtnsinDieta = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Buscar Paciente");

        rbtnDni.setText("Por DNI");
        rbtnDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnDniMousePressed(evt);
            }
        });

        rbtnTodos.setText("Mostrar Todos");
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

        rbtnSinCumplir.setText("Mostrar Pacientes sin cumplir meta");
        rbtnSinCumplir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnSinCumplirMousePressed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        rbtnsinDieta.setText("Mostrar Pacientes sin dieta");
        rbtnsinDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnsinDietaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(135, 135, 135)))
                        .addGap(294, 294, 294)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(388, 388, 388))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnSinCumplir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(278, 278, 278))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnsinDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(323, 323, 323))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnKilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKilos)
                            .addComponent(txtDni))))
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(339, 339, 339))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(337, 337, 337))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbtnDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtDni))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbtnKilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtKilos))
                .addGap(18, 18, 18)
                .addComponent(rbtnTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rbtnsinDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rbtnSinCumplir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
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
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n') && !c.equals('.') && !c.equals('-')) {
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
            txtDni.setText("");

            rbtnKilos.setSelected(false);
            rbtnTodos.setSelected(false);
            rbtnSinCumplir.setSelected(false);
            rbtnsinDieta.setSelected(false);

        }


    }//GEN-LAST:event_rbtnDniMousePressed

    private void rbtnKilosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnKilosMousePressed
        if (!rbtnKilos.isSelected()) {
            btnBuscar.setEnabled(false);

            txtDni.setEditable(false);
            txtKilos.setEditable(true);

            txtKilos.setText("");
            txtDni.setText("");

            rbtnDni.setSelected(false);
            rbtnTodos.setSelected(false);
            rbtnSinCumplir.setSelected(false);
            rbtnsinDieta.setSelected(false);
        }

    }//GEN-LAST:event_rbtnKilosMousePressed

    private void rbtnTodosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnTodosMousePressed
        if (!rbtnTodos.isSelected()) {
            btnBuscar.setEnabled(true);

            txtDni.setEditable(false);
            txtKilos.setEditable(false);

            txtKilos.setText("");
            txtDni.setText("");

            rbtnDni.setSelected(false);
            rbtnKilos.setSelected(false);
            rbtnSinCumplir.setSelected(false);
            rbtnsinDieta.setSelected(false);
        }

    }//GEN-LAST:event_rbtnTodosMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        PacienteData pacienteData = new PacienteData();
        DietaData dietaData = new DietaData();
        borrarFilasTabla();
        boolean flag = false;
        ArrayList<Dieta> dietas = dietaData.readAllDieta();

        if (rbtnDni.isSelected()) {
            Paciente aux = pacienteData.readPaciente(txtDni.getText());
            modelo.addRow(new Object[]{aux.getNombre(), aux.getApellido(), aux.getDomicilio(),
                aux.getDni(), aux.getTelefono(), aux.getPesoActual(), aux.getNombre(), aux.getNombre()});
        } else if (rbtnKilos.isSelected()) {
            pacienteData.readAllPacientePeso(Float.parseFloat(txtKilos.getText()), modelo);

        } else if (rbtnTodos.isSelected()) {
            pacienteData.readAllPaciente(modelo);

            for (Paciente aux : pacientes) {
                for (Dieta dieta : dietas) {

                    if (((Paciente) aux).getId() == dieta.getId_paciente()) {
                        flag = true;
                    }

                }
                if (!flag) {
                    modelo.addRow(new Object[]{aux.getNombre(), aux.getApellido(), aux.getDomicilio(),
                        aux.getDni(), aux.getTelefono(), aux.getPesoActual(), "-", "-", "-", "-", "-"});
                }
                flag = false;

            }

        } else if (rbtnSinCumplir.isSelected()) {
            pacienteData.readAllPacienteNoCumplieronMeta(modelo);

        } else if (rbtnsinDieta.isSelected()) {
            for (Paciente aux : pacientes) {
                for (Dieta dieta : dietas) {

                    if (((Paciente) aux).getId() == dieta.getId_paciente()) {
                        flag = true;
                    }

                }
                if (!flag) {
                    modelo.addRow(new Object[]{aux.getNombre(), aux.getApellido(), aux.getDomicilio(),
                        aux.getDni(), aux.getTelefono(), aux.getPesoActual(), "-", "-", "-", "-", "-"});
                }
                flag = false;

            }
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

    private void rbtnSinCumplirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnSinCumplirMousePressed
        if (!rbtnSinCumplir.isSelected()) {
            btnBuscar.setEnabled(true);

            txtDni.setEditable(false);
            txtKilos.setEditable(false);

            txtKilos.setText("");
            txtDni.setText("");

            rbtnDni.setSelected(false);
            rbtnKilos.setSelected(false);
            rbtnTodos.setSelected(false);
            rbtnsinDieta.setSelected(false);

        }
    }//GEN-LAST:event_rbtnSinCumplirMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rbtnsinDietaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnsinDietaMousePressed
        if (!rbtnsinDieta.isSelected()) {
            btnBuscar.setEnabled(true);

            txtDni.setEditable(false);
            txtKilos.setEditable(false);

            txtKilos.setText("");
            txtDni.setText("");

            rbtnDni.setSelected(false);
            rbtnKilos.setSelected(false);
            rbtnTodos.setSelected(false);
            rbtnSinCumplir.setSelected(false);

        } 
    }//GEN-LAST:event_rbtnsinDietaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnDni;
    private javax.swing.JRadioButton rbtnKilos;
    private javax.swing.JRadioButton rbtnSinCumplir;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JRadioButton rbtnsinDieta;
    private javax.swing.JTable tPacientes;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtKilos;
    // End of variables declaration//GEN-END:variables
}
