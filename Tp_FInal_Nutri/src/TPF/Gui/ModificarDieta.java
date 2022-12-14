/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package TPF.Gui;

import TPF.Control.DietaData;
import TPF.Control.PacienteData;
import TPF.Modelo.Dieta;
import TPF.Modelo.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dante
 */
public class ModificarDieta extends javax.swing.JInternalFrame {

    /**
     * Creates new form NutriModDieta
     */
    public ModificarDieta() {
        initComponents();
        btnGuardar.setEnabled(false);

        PacienteData pacienteData = new PacienteData();
        DietaData dietaData = new DietaData();
        ArrayList<Dieta> dietas = dietaData.readAllDieta();
        ArrayList<Paciente> pacientes = pacienteData.readAllPaciente();
        System.out.println("");
        for (Dieta dieta : dietas) {
            for (Paciente paciente : pacientes) {
                if (dieta.getId_paciente().getId() == paciente.getId()) {
                    cbPaciente.addItem(paciente);
                }
            }
        }

//        for (Paciente paciente : pacienteData.readAllPaciente()) {
//            
//            cbPaciente.addItem(paciente);
//        }
        cbDieta.setSelectedItem(null);
        cbPaciente.setSelectedItem(null);

        txtLimiteCal.setText("");
        txtPesoDeseado.setText("");
        txtPesoInicial.setText("");
        FIDateChooserMod.setDate(null);

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
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbDieta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPesoInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPesoDeseado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FIDateChooserMod = new com.toedter.calendar.JDateChooser();
        txtLimiteCal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Dieta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 450, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Datos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 450, 40));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel2.setText("Paciente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 60, 40));

        cbPaciente.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        cbPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPacienteItemStateChanged(evt);
            }
        });
        getContentPane().add(cbPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 300, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel3.setText("Dieta ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        cbDieta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        getContentPane().add(cbDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 300, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel4.setText("Peso inicial:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 80, 30));

        txtPesoInicial.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtPesoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesoInicialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoInicialKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 300, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel5.setText("Peso deseado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 167, 30));

        txtPesoDeseado.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtPesoDeseado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesoDeseadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoDeseadoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPesoDeseado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 300, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel6.setText("Limite de cal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 177, 30));

        FIDateChooserMod.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FIDateChooserModPropertyChange(evt);
            }
        });
        getContentPane().add(FIDateChooserMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 300, 30));

        txtLimiteCal.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtLimiteCal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLimiteCalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLimiteCalKeyTyped(evt);
            }
        });
        getContentPane().add(txtLimiteCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 300, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de inicio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 110, 30));

        btnGuardar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(79, 27));
        btnGuardar.setMinimumSize(new java.awt.Dimension(79, 27));
        btnGuardar.setPreferredSize(new java.awt.Dimension(79, 27));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 110, 30));

        btnLimpiar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setMaximumSize(new java.awt.Dimension(79, 27));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(79, 27));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(79, 27));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 110, 30));

        btnCerrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setMaximumSize(new java.awt.Dimension(79, 27));
        btnCerrar.setMinimumSize(new java.awt.Dimension(79, 27));
        btnCerrar.setPreferredSize(new java.awt.Dimension(79, 27));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 110, 30));

        btnBorrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setMaximumSize(new java.awt.Dimension(79, 27));
        btnBorrar.setMinimumSize(new java.awt.Dimension(79, 27));
        btnBorrar.setPreferredSize(new java.awt.Dimension(79, 27));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/im??genes/fondochico.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, 676));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void habilitarBoton() {
        if (txtPesoInicial.getText().isEmpty() || txtPesoDeseado.getText().isEmpty() || txtLimiteCal.getText().isEmpty() && ((JTextField) FIDateChooserMod.getDateEditor().getUiComponent()).getText().isEmpty()) {
            btnGuardar.setEnabled(false);
        } else {
            btnGuardar.setEnabled(true);
        }

    }

    private void txtPesoInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoInicialKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtPesoInicialKeyReleased

    private void txtPesoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoInicialKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_txtPesoInicialKeyTyped

    private void txtPesoDeseadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoDeseadoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtPesoDeseadoKeyReleased

    private void txtPesoDeseadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoDeseadoKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_txtPesoDeseadoKeyTyped

    private void FIDateChooserModPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FIDateChooserModPropertyChange
        habilitarBoton();
    }//GEN-LAST:event_FIDateChooserModPropertyChange

    private void txtLimiteCalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteCalKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtLimiteCalKeyReleased

    private void txtLimiteCalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteCalKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_txtLimiteCalKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int aux = JOptionPane.showConfirmDialog(rootPane, "??Est?? seguro que desea asignar esta dieta?");
        if (aux == 0) {
            Dieta dt = new Dieta();
            int d = FIDateChooserMod.getCalendar().get(Calendar.DAY_OF_MONTH);
            int m = FIDateChooserMod.getCalendar().getTime().getMonth() + 1;
            int an = FIDateChooserMod.getCalendar().getTime().getYear() + 1900;

            DietaData DD = new DietaData();

            DD.updateDieta(((Dieta) cbDieta.getSelectedItem()).getId(), LocalDate.of(an, m, d), LocalDate.of(an, m, d).plusDays(7), Double.parseDouble(txtPesoInicial.getText()), Double.parseDouble(txtPesoDeseado.getText()), Integer.parseInt(txtLimiteCal.getText()), true);
        }

        cbDieta.setSelectedItem(null);
        cbPaciente.setSelectedItem(null);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtPesoInicial.setText("");
        txtPesoDeseado.setText("");
        txtLimiteCal.setText("");
        ((JTextField) FIDateChooserMod.getDateEditor().getUiComponent()).setText("");
        habilitarBoton();
        cbDieta.setSelectedItem(null);
        cbPaciente.setSelectedItem(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        DietaData dietaData = new DietaData();
        DietaData dietaData2 = new DietaData();
        PacienteData pacienteData = new PacienteData();
        dietaData.deleteDieta(((Dieta) cbDieta.getSelectedItem()).getId());

        cbDieta.removeAllItems();
        cbPaciente.removeAllItems();
        ArrayList<Dieta> dietas = dietaData2.readAllDieta();
        ArrayList<Paciente> pacientes = pacienteData.readAllPaciente();

        for (Dieta dieta : dietas) {
            for (Paciente paciente : pacientes) {
                if (dieta.getId_paciente().getId() == paciente.getId()) {
                    cbPaciente.addItem(paciente);
                }
            }
        }
        cbDieta.setSelectedItem(null);
        cbPaciente.setSelectedItem(null);


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cbPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPacienteItemStateChanged
        cbDieta.removeAllItems();
        DietaData dietaData = new DietaData();
        if (cbPaciente.getSelectedItem() != null) {
            for (Dieta dieta : dietaData.readAllDieta()) {
                if (((Paciente) cbPaciente.getSelectedItem()).getId() == dieta.getId_paciente().getId()) {
                    cbDieta.addItem(dieta);
                    txtPesoInicial.setText(String.valueOf(dieta.getPeso_inicial()));
                    txtPesoDeseado.setText(String.valueOf(dieta.getPeso_deseado()));
                    txtLimiteCal.setText(String.valueOf(dieta.getLimite_calorico()));
                    FIDateChooserMod.setDate(java.sql.Date.valueOf(dieta.getFecha_incio()));
                }
            }
        }

    }//GEN-LAST:event_cbPacienteItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FIDateChooserMod;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Object> cbDieta;
    private javax.swing.JComboBox<Object> cbPaciente;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtLimiteCal;
    private javax.swing.JTextField txtPesoDeseado;
    private javax.swing.JTextField txtPesoInicial;
    // End of variables declaration//GEN-END:variables
}
