/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package TPF.Gui;

import TPF.Control.PacienteData;
import TPF.Modelo.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Heisen
 */
public class ModificarPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiModificarPaciente
     */
    public ModificarPaciente() {
        initComponents();
        PacienteData pacienteData = new PacienteData();
        ArrayList<Paciente> pacientes = pacienteData.readAllPaciente();
         btnMod.setEnabled(false);
          btnEliminar.setEnabled(false);
        for (Paciente aux : pacientes) {
            JComboModPac.addItem(aux);
        }
        JComboModPac.setSelectedItem(null);

        txtNombre.setText("");
        txtApellido.setText("");
        txtDomicilio.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtPesoActual.setText("");
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
        jLApellido = new javax.swing.JLabel();
        jLDni = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLPesoActual = new javax.swing.JLabel();
        jLDomicilio = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPesoActual = new javax.swing.JTextField();
        JComboModPac = new javax.swing.JComboBox<>();
        jLNombre1 = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Paciente");

        jLApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLApellido.setText("Apellido:");

        jLDni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDni.setText("DNI: ");

        jLNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNombre.setText("Nombre: ");

        jLTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTelefono.setText("Telefono:");

        jLPesoActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLPesoActual.setText("Peso Actual");

        jLDomicilio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDomicilio.setText("Domicilio:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtPesoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoActualKeyTyped(evt);
            }
        });

        JComboModPac.setBackground(new java.awt.Color(255, 255, 255));
        JComboModPac.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboModPacItemStateChanged(evt);
            }
        });

        jLNombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNombre1.setText("Paciente");

        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLDomicilio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLPesoActual, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLNombre1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JComboModPac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtPesoActual)
                    .addComponent(txtTelefono)
                    .addComponent(txtDni)
                    .addComponent(txtDomicilio)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(98, 98, 98)
                .addComponent(btnMod)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboModPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jLDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jLDni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jLPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMod)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancel))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed

    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDomicilio.getText().equals("")
                || txtDni.getText().equals("") || txtTelefono.getText().equals("") || txtPesoActual.getText().equals("")) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }

        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
        if (txtTelefono.getText().length() > 14) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPesoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoActualKeyTyped
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDomicilio.getText().equals("")
                || txtDni.getText().equals("") || txtTelefono.getText().equals("") || txtPesoActual.getText().equals("")) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }

        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n') && !c.equals('.')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_txtPesoActualKeyTyped

    private void JComboModPacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboModPacItemStateChanged
        if (JComboModPac.getSelectedItem() != null) {
            txtNombre.setText(String.valueOf(((Paciente) JComboModPac.getSelectedItem()).getNombre()));
            txtApellido.setText(String.valueOf(((Paciente) JComboModPac.getSelectedItem()).getApellido()));
            txtDomicilio.setText(String.valueOf(((Paciente) JComboModPac.getSelectedItem()).getDomicilio()));
            txtDni.setText(String.valueOf(((Paciente) JComboModPac.getSelectedItem()).getDni()));
            txtTelefono.setText(String.valueOf(((Paciente) JComboModPac.getSelectedItem()).getTelefono()));
            txtPesoActual.setText(String.valueOf(((Paciente) JComboModPac.getSelectedItem()).getPesoActual()));
            btnMod.setEnabled(true);
            btnEliminar.setEnabled(true);
        }else{
         btnMod.setEnabled(false);
         btnEliminar.setEnabled(false);
        }
        System.out.println(JComboModPac.getSelectedIndex());

    }//GEN-LAST:event_JComboModPacItemStateChanged

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDomicilio.getText().equals("")
                || txtDni.getText().equals("") || txtTelefono.getText().equals("") || txtPesoActual.getText().equals("")) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }

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

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDomicilio.getText().equals("")
                || txtDni.getText().equals("") || txtTelefono.getText().equals("") || txtPesoActual.getText().equals("")) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }

        if (txtDomicilio.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDomicilioKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDomicilio.getText().equals("")
                || txtDni.getText().equals("") || txtTelefono.getText().equals("") || txtPesoActual.getText().equals("")) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }
        if (txtApellido.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDomicilio.getText().equals("")
                || txtDni.getText().equals("") || txtTelefono.getText().equals("") || txtPesoActual.getText().equals("")) {
            btnMod.setEnabled(false);
        } else {
            btnMod.setEnabled(true);
        }
        if (txtNombre.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        PacienteData pacienteData = new PacienteData();

        pacienteData.updatePaciente(((Paciente) JComboModPac.getSelectedItem()).getId(),
                txtNombre.getText(), txtApellido.getText(),
                txtDomicilio.getText(), txtDni.getText(),
                txtTelefono.getText(), Float.parseFloat(txtPesoActual.getText()),
                ((Paciente) JComboModPac.getSelectedItem()).isEstado());

    }//GEN-LAST:event_btnModActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        PacienteData pacienteData = new PacienteData();
        pacienteData.deletePaciente(((Paciente) JComboModPac.getSelectedItem()).getId());
        int index = JComboModPac.getSelectedIndex();
        JComboModPac.removeItemAt(index);
                
        System.out.println(index);
        txtNombre.setText("");
        txtApellido.setText("");
        txtDomicilio.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtPesoActual.setText("");
        JComboModPac.setSelectedItem(null);       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> JComboModPac;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMod;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLPesoActual;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPesoActual;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}