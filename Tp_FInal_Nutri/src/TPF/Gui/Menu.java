/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPF.Gui;

/**
 *
 * @author Moon
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Paciente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        miBuscar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMAgregarComida = new javax.swing.JMenuItem();
        jMModificarComida = new javax.swing.JMenuItem();
        jMBuscarComida = new javax.swing.JMenuItem();
        MenuDieta = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        Paciente.setText("Pacientes");

        jMenuItem1.setText("Cargar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Paciente.add(jMenuItem1);

        jMenuItem2.setText("Mod");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Paciente.add(jMenuItem2);

        miBuscar.setText("Buscar");
        miBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarActionPerformed(evt);
            }
        });
        Paciente.add(miBuscar);

        jMenuBar1.add(Paciente);

        jMenu2.setText("Comidas");

        jMAgregarComida.setText("Agregar");
        jMAgregarComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMAgregarComidaMousePressed(evt);
            }
        });
        jMenu2.add(jMAgregarComida);

        jMModificarComida.setText("Modificar");
        jMModificarComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMModificarComidaMousePressed(evt);
            }
        });
        jMenu2.add(jMModificarComida);

        jMBuscarComida.setText("Buscar");
        jMBuscarComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMBuscarComidaMousePressed(evt);
            }
        });
        jMenu2.add(jMBuscarComida);

        jMenuBar1.add(jMenu2);

        MenuDieta.setText("Dieta");

        jMenuItem3.setText("Agregar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuDieta.add(jMenuItem3);

        jMenuItem4.setText("Modificar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuDieta.add(jMenuItem4);

        jMenuItem5.setText("Buscar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuDieta.add(jMenuItem5);

        jMenuBar1.add(MenuDieta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        GuiCargarPaciente guiPaciente = new GuiCargarPaciente();
        guiPaciente.setVisible(true);
        jDesktopPane1.add(guiPaciente);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GuiModificarPaciente guiPacienteMod = new GuiModificarPaciente();
        guiPacienteMod.setVisible(true);
        jDesktopPane1.add(guiPacienteMod);  
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void miBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarActionPerformed
        GuiBuscarPaciente guiPacienteBus = new GuiBuscarPaciente();
        guiPacienteBus.setVisible(true);
        jDesktopPane1.add(guiPacienteBus); 
    }//GEN-LAST:event_miBuscarActionPerformed

    private void jMAgregarComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMAgregarComidaMousePressed
        AgregarComida aux = new AgregarComida();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
    }//GEN-LAST:event_jMAgregarComidaMousePressed

    private void jMModificarComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMModificarComidaMousePressed
        ModificarComida aux = new ModificarComida();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
    }//GEN-LAST:event_jMModificarComidaMousePressed

    private void jMBuscarComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMBuscarComidaMousePressed
        MostrarComida aux = new MostrarComida();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
    }//GEN-LAST:event_jMBuscarComidaMousePressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        NutriCrearDieta aux = new NutriCrearDieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        NutriModDieta aux = new NutriModDieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        NutriBuscarDieta aux = new NutriBuscarDieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GuiCargarPaciente guiPaciente = new GuiCargarPaciente();
        guiPaciente.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuDieta;
    private javax.swing.JMenu Paciente;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMAgregarComida;
    private javax.swing.JMenuItem jMBuscarComida;
    private javax.swing.JMenuItem jMModificarComida;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem miBuscar;
    // End of variables declaration//GEN-END:variables
}
