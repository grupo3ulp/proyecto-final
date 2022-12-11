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
public class BuscarPaciente extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    PacienteData pacienteData = new PacienteData();
    private ArrayList<Paciente> pacientes = pacienteData.readAllPaciente();

    public BuscarPaciente() {
        initComponents();
        PacienteData pacienteData = new PacienteData();
        btnBuscar.setEnabled(false);
        txtDni.setEditable(false);
        txtKilos.setEditable(false);
        modelo = new DefaultTableModel();
        armarCabecera();
        tPacientes.setEnabled(false);
        tPacientes.getColumnModel().getColumn(9).setPreferredWidth(50);
        tPacientes.getColumnModel().getColumn(8).setPreferredWidth(50);
        tPacientes.getColumnModel().getColumn(7).setPreferredWidth(40);
        tPacientes.getColumnModel().getColumn(6).setPreferredWidth(40);
        tPacientes.getColumnModel().getColumn(5).setPreferredWidth(40);       
        tPacientes.getColumnModel().getColumn(2).setPreferredWidth(110);
        
        rbtnDni.setOpaque(false);
        rbtnKilos.setOpaque(false);
        rbtnSinCumplir.setOpaque(false);
        rbtnTodos.setOpaque(false);
        rbtnsinDieta.setOpaque(false);
        
                

    }

    private void armarCabecera() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("Domicilio");
        columnas.add("DNI");
        columnas.add("Telefono");
        columnas.add("P Act");
        columnas.add("P Ini");
        columnas.add("P Bus");
        columnas.add("Kg a Baj*");
        columnas.add("Kg Baj*");

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
        jBLimpiar = new javax.swing.JButton();
        rbtnsinDieta = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Paciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 780, -1));

        rbtnDni.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        rbtnDni.setText("Por DNI");
        rbtnDni.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnDniItemStateChanged(evt);
            }
        });
        rbtnDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnDniMousePressed(evt);
            }
        });
        getContentPane().add(rbtnDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 150, -1));

        rbtnTodos.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        rbtnTodos.setText("Mostrar Todos");
        rbtnTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnTodosMousePressed(evt);
            }
        });
        getContentPane().add(rbtnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 140, -1));

        rbtnKilos.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        rbtnKilos.setText("Por kilos buscados");
        rbtnKilos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnKilosItemStateChanged(evt);
            }
        });
        rbtnKilos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnKilosMousePressed(evt);
            }
        });
        getContentPane().add(rbtnKilos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 207, -1));

        txtKilos.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtKilos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKilosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilosKeyTyped(evt);
            }
        });
        getContentPane().add(txtKilos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 151, -1));

        txtDni.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 151, -1));

        btnBuscar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 110, 30));

        tPacientes.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 750, 170));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jLabel2.setText("* Simbolo negativo significa que subio de peso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 679, -1));

        rbtnSinCumplir.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        rbtnSinCumplir.setText("Mostrar Pacientes sin cumplir meta");
        rbtnSinCumplir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnSinCumplirMousePressed(evt);
            }
        });
        getContentPane().add(rbtnSinCumplir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 250, -1));

        btnCancelar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cerrar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 110, 30));

        jBLimpiar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setMaximumSize(new java.awt.Dimension(72, 27));
        jBLimpiar.setMinimumSize(new java.awt.Dimension(72, 27));
        jBLimpiar.setPreferredSize(new java.awt.Dimension(72, 27));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 110, 30));

        rbtnsinDieta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        rbtnsinDieta.setText("Mostrar Pacientes sin dieta");
        rbtnsinDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnsinDietaMousePressed(evt);
            }
        });
        getContentPane().add(rbtnsinDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 200, -1));

        fondo.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/fondo_frames_tablas.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 676));

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
        PacienteData pacienteData2 = new PacienteData();
        DietaData dietaData = new DietaData();
        borrarFilasTabla();
        boolean flag = false;

        if (rbtnDni.isSelected()) {
            Paciente pacienteAux = null;
            pacienteData2.readPaciente(modelo, txtDni.getText());

            if (modelo.getRowCount() < 1) {
                ArrayList<Dieta> dietas = dietaData.readAllDieta();
                pacienteAux = pacienteData.readPaciente(txtDni.getText());
                for (Dieta dieta : dietas) {

                    if (((Paciente) pacienteAux).getId() == dieta.getId_paciente().getId()) {
                        flag = true;
                    }

                }
                if (!flag) {
                    modelo.addRow(new Object[]{pacienteAux.getNombre(), pacienteAux.getApellido(), pacienteAux.getDomicilio(),
                        pacienteAux.getDni(), pacienteAux.getTelefono(), pacienteAux.getPesoActual(), "-", "-", "-", "-", "-"});
                }
            }

            if (modelo.getRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "No se encuentra un paciente con ese DNI");
            }

        } else if (rbtnKilos.isSelected()) {
            ArrayList<Dieta> dietasAux = dietaData.readAllDietaxKilo(Integer.parseInt(txtKilos.getText()));

            for (Dieta aux : dietasAux) {
                modelo.addRow(new Object[]{aux.getId_paciente().getNombre(),
                    aux.getId_paciente().getApellido(), aux.getId_paciente().getDomicilio(),
                    aux.getId_paciente().getDni(), aux.getId_paciente().getTelefono(),
                    aux.getId_paciente().getPesoActual(), aux.getPeso_inicial(),
                    aux.getPeso_deseado(), (aux.getPeso_inicial() - aux.getPeso_deseado()),
                    (aux.getPeso_inicial() - aux.getId_paciente().getPesoActual())});
            }

        } else if (rbtnTodos.isSelected()) {
            ArrayList<Dieta> dietas = dietaData.readAllDieta();
            pacienteData.readAllPaciente(modelo);

            for (Paciente aux : pacientes) {
                for (Dieta dieta : dietas) {

                    if (((Paciente) aux).getId() == dieta.getId_paciente().getId()) {
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
            ArrayList<Dieta> dietasAux = dietaData.readAllDietaNoCumplena();

            for (Dieta aux : dietasAux) {
                modelo.addRow(new Object[]{aux.getId_paciente().getNombre(),
                    aux.getId_paciente().getApellido(), aux.getId_paciente().getDomicilio(),
                    aux.getId_paciente().getDni(), aux.getId_paciente().getTelefono(),
                    aux.getId_paciente().getPesoActual(), aux.getPeso_inicial(),
                    aux.getPeso_deseado(), (aux.getPeso_inicial() - aux.getPeso_deseado()),
                    (aux.getPeso_inicial() - aux.getId_paciente().getPesoActual())});
            }

        } else if (rbtnsinDieta.isSelected()) {
            ArrayList<Dieta> dietas = dietaData.readAllDieta();
            for (Paciente aux : pacientes) {
                for (Dieta dieta : dietas) {

                    if (((Paciente) aux).getId() == dieta.getId_paciente().getId()) {
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

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        borrarFilasTabla();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void rbtnDniItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnDniItemStateChanged
        if (!rbtnDni.isSelected()){
           txtDni.setEditable(false);
        }
    }//GEN-LAST:event_rbtnDniItemStateChanged

    private void rbtnKilosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnKilosItemStateChanged
        if (!rbtnKilos.isSelected()){
           txtKilos.setEditable(false);
        }
    }//GEN-LAST:event_rbtnKilosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBLimpiar;
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
