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
            cbPaciente.addItem(aux);
        }
        cbPaciente.setSelectedItem(null);

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
        jLabel2 = new javax.swing.JLabel();
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
        cbPaciente = new javax.swing.JComboBox<>();
        jLNombre1 = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Paciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 450, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 450, 40));

        jLApellido.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLApellido.setText("Apellido:");
        jLApellido.setPreferredSize(new java.awt.Dimension(64, 26));
        getContentPane().add(jLApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 40));

        jLDni.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDni.setText("DNI: ");
        jLDni.setPreferredSize(new java.awt.Dimension(64, 26));
        getContentPane().add(jLDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, 40));

        jLNombre.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLNombre.setText("Nombre: ");
        jLNombre.setPreferredSize(new java.awt.Dimension(64, 26));
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, 40));

        jLTelefono.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLTelefono.setText("Telefono:");
        jLTelefono.setPreferredSize(new java.awt.Dimension(64, 26));
        getContentPane().add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 90, 40));

        jLPesoActual.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLPesoActual.setText("Peso Actual");
        jLPesoActual.setPreferredSize(new java.awt.Dimension(64, 26));
        getContentPane().add(jLPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 90, 40));

        jLDomicilio.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLDomicilio.setText("Domicilio:");
        jLDomicilio.setPreferredSize(new java.awt.Dimension(64, 26));
        getContentPane().add(jLDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 90, 40));

        txtNombre.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 320, 27));

        txtApellido.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 320, 27));

        txtDomicilio.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });
        getContentPane().add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 320, 27));

        txtDni.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 320, 27));

        txtTelefono.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 320, 27));

        txtPesoActual.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtPesoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoActualKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 320, 27));

        cbPaciente.setBackground(new java.awt.Color(255, 255, 255));
        cbPaciente.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        cbPaciente.setMinimumSize(new java.awt.Dimension(64, 26));
        cbPaciente.setPreferredSize(new java.awt.Dimension(64, 26));
        cbPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPacienteItemStateChanged(evt);
            }
        });
        getContentPane().add(cbPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 320, 30));

        jLNombre1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLNombre1.setText("Paciente");
        getContentPane().add(jLNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 50));

        btnMod.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnMod.setText("Guardar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        getContentPane().add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 110, 30));

        btnEliminar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnEliminar.setText("Borrar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 110, 30));

        btnCancel.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnCancel.setText("Cerrar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 110, 30));

        jBLimpiar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setMaximumSize(new java.awt.Dimension(79, 27));
        jBLimpiar.setMinimumSize(new java.awt.Dimension(79, 27));
        jBLimpiar.setPreferredSize(new java.awt.Dimension(79, 27));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/fondochico.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, 676));

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

    private void cbPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPacienteItemStateChanged
        if (cbPaciente.getSelectedItem() != null) {
            txtNombre.setText(String.valueOf(((Paciente) cbPaciente.getSelectedItem()).getNombre()));
            txtApellido.setText(String.valueOf(((Paciente) cbPaciente.getSelectedItem()).getApellido()));
            txtDomicilio.setText(String.valueOf(((Paciente) cbPaciente.getSelectedItem()).getDomicilio()));
            txtDni.setText(String.valueOf(((Paciente) cbPaciente.getSelectedItem()).getDni()));
            txtTelefono.setText(String.valueOf(((Paciente) cbPaciente.getSelectedItem()).getTelefono()));
            txtPesoActual.setText(String.valueOf(((Paciente) cbPaciente.getSelectedItem()).getPesoActual()));
            btnMod.setEnabled(true);
            btnEliminar.setEnabled(true);
        }else{
         btnMod.setEnabled(false);
         btnEliminar.setEnabled(false);
        }


    }//GEN-LAST:event_cbPacienteItemStateChanged

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

        pacienteData.updatePaciente(((Paciente) cbPaciente.getSelectedItem()).getId(),
                txtNombre.getText(), txtApellido.getText(),
                txtDomicilio.getText(), txtDni.getText(),
                txtTelefono.getText(), Float.parseFloat(txtPesoActual.getText()),
                ((Paciente) cbPaciente.getSelectedItem()).isEstado());

    }//GEN-LAST:event_btnModActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        PacienteData pacienteData = new PacienteData();
        pacienteData.deletePaciente(((Paciente) cbPaciente.getSelectedItem()).getId());
        int index = cbPaciente.getSelectedIndex();
        cbPaciente.removeItemAt(index);
                
        System.out.println(index);
        txtNombre.setText("");
        txtApellido.setText("");
        txtDomicilio.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtPesoActual.setText("");
        cbPaciente.setSelectedItem(null);       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        txtApellido.setText("");
        txtDni.setText("");
        txtDomicilio.setText("");
        txtNombre.setText("");
        txtPesoActual.setText("");
        txtTelefono.setText("");
        btnEliminar.setEnabled(false);
        btnMod.setEnabled(false);
        cbPaciente.setSelectedItem(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMod;
    private javax.swing.JComboBox<Paciente> cbPaciente;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLPesoActual;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPesoActual;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
