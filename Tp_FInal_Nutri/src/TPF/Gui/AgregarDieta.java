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
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dante
 */
public class AgregarDieta extends javax.swing.JInternalFrame {

    /**
     * Creates new form NutriCrearDieta
     */
    public AgregarDieta() {
        initComponents();
        CDGuardar.setEnabled(false);
        
        PacienteData pacienteData = new PacienteData();
        
        for (Paciente paciente : pacienteData.readAllPaciente()) {
            
           CDListaPaciente.addItem(paciente);
            
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
        jLabel2 = new javax.swing.JLabel();
        PIText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PDText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FIDateChooser = new com.toedter.calendar.JDateChooser();
        LCText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CDGuardar = new javax.swing.JButton();
        CDLimpiar = new javax.swing.JButton();
        CDCerrar = new javax.swing.JButton();
        CDListaPaciente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Crear Dieta");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese su peso inicial:");

        PIText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PITextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PITextKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese el peso deseado:");

        PDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PDTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PDTextKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el limite de calorias:");

        FIDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FIDateChooserPropertyChange(evt);
            }
        });

        LCText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LCTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LCTextKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese la fecha de inicio:");

        CDGuardar.setText("Guardar");
        CDGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDGuardarActionPerformed(evt);
            }
        });

        CDLimpiar.setText("Limpiar");
        CDLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDLimpiarActionPerformed(evt);
            }
        });

        CDCerrar.setText("Cerrar");
        CDCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDCerrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione al paciente");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CDGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(CDLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(CDCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PIText, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FIDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LCText, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel6))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CDListaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDText, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(145, 145, 145))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CDListaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PIText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FIDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CDGuardar)
                    .addComponent(CDLimpiar)
                    .addComponent(CDCerrar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void habilitarBoton(){
        if (PIText.getText().isEmpty() || PDText.getText().isEmpty() || LCText.getText().isEmpty() || ((JTextField) FIDateChooser.getDateEditor().getUiComponent()).getText().isEmpty()) {
            CDGuardar.setEnabled(false);
        }else{
            CDGuardar.setEnabled(true);
        }
            
    }
    
    private void PITextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PITextKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_PITextKeyReleased

    private void PDTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDTextKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_PDTextKeyReleased

    private void LCTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LCTextKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_LCTextKeyReleased

    private void FIDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FIDateChooserPropertyChange
        habilitarBoton();
    }//GEN-LAST:event_FIDateChooserPropertyChange

    private void CDCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_CDCerrarActionPerformed

    private void PITextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PITextKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n') && !c.equals(',')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_PITextKeyTyped

    private void PDTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDTextKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n') && !c.equals(',')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_PDTextKeyTyped

    private void LCTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LCTextKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n') && !c.equals(',')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_LCTextKeyTyped

    private void CDLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDLimpiarActionPerformed
        PIText.setText("");
        PDText.setText("");
       LCText.setText("");
       ((JTextField) FIDateChooser.getDateEditor().getUiComponent()).setText("");
        habilitarBoton();
    }//GEN-LAST:event_CDLimpiarActionPerformed

    private void CDGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDGuardarActionPerformed
        int aux = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea asignar esta dieta?");
         if (aux == 0){
             Dieta dt = new Dieta();
             int d = FIDateChooser.getCalendar().get(Calendar.DAY_OF_MONTH);
            int m = FIDateChooser.getCalendar().getTime().getMonth() + 1;
            int an = FIDateChooser.getCalendar().getTime().getYear() + 1900;
            
            dt.setPeso_inicial(Double.parseDouble(PIText.getText()));
            dt.setPeso_deseado(Double.parseDouble(PDText.getText()));
            dt.setLimite_calorico(Integer.parseInt(LCText.getText()));
            dt.setFecha_incio(LocalDate.of(an, m, d));
            dt.setFecha_fin(LocalDate.of(an, m, d).plusDays(7));
            dt.setId_paciente(((Paciente)CDListaPaciente.getSelectedItem()).getId());
            
            DietaData DD = new DietaData();
            
            DD.createDieta(dt);
            
            PIText.setText("");
            PDText.setText("");
            LCText.setText("");
            ((JTextField) FIDateChooser.getDateEditor().getUiComponent()).setText("");
            CDGuardar.setEnabled(false);
         }else if(aux == 1){
             PIText.setText("");
            PDText.setText("");
            LCText.setText("");
            ((JTextField) FIDateChooser.getDateEditor().getUiComponent()).setText("");
            CDGuardar.setEnabled(false);
         }
    }//GEN-LAST:event_CDGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CDCerrar;
    private javax.swing.JButton CDGuardar;
    private javax.swing.JButton CDLimpiar;
    private javax.swing.JComboBox<Object> CDListaPaciente;
    private com.toedter.calendar.JDateChooser FIDateChooser;
    private javax.swing.JTextField LCText;
    private javax.swing.JTextField PDText;
    private javax.swing.JTextField PIText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}