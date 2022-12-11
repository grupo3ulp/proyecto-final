package TPF.Gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon=new ImageIcon(getClass().getResource("fondo.jpg"));
        Image img=icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        Paciente = new javax.swing.JMenu();
        cargarPaciente = new javax.swing.JMenuItem();
        ModPaciente = new javax.swing.JMenuItem();
        BuscPaciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMAgregarComida = new javax.swing.JMenuItem();
        jMModificarComida = new javax.swing.JMenuItem();
        jMBuscarComida = new javax.swing.JMenuItem();
        MenuDieta = new javax.swing.JMenu();
        agregarDieta = new javax.swing.JMenuItem();
        modificarDieta = new javax.swing.JMenuItem();
        buscarDieta = new javax.swing.JMenuItem();
        jMPlan = new javax.swing.JMenu();
        agregarPlan = new javax.swing.JMenuItem();
        modPlan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1366, 745));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1364, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        Paciente.setText("Pacientes");

        cargarPaciente.setText("Agregar");
        cargarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPacienteActionPerformed(evt);
            }
        });
        Paciente.add(cargarPaciente);

        ModPaciente.setText("Modificar");
        ModPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModPacienteActionPerformed(evt);
            }
        });
        Paciente.add(ModPaciente);

        BuscPaciente.setText("Buscar");
        BuscPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscPacienteActionPerformed(evt);
            }
        });
        Paciente.add(BuscPaciente);

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

        agregarDieta.setText("Agregar");
        agregarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDietaActionPerformed(evt);
            }
        });
        MenuDieta.add(agregarDieta);

        modificarDieta.setText("Modificar");
        modificarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDietaActionPerformed(evt);
            }
        });
        MenuDieta.add(modificarDieta);

        buscarDieta.setText("Buscar");
        buscarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDietaActionPerformed(evt);
            }
        });
        MenuDieta.add(buscarDieta);

        jMenuBar1.add(MenuDieta);

        jMPlan.setText("Plan alimenticio");

        agregarPlan.setText("Cargar plan");
        agregarPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarPlanMousePressed(evt);
            }
        });
        jMPlan.add(agregarPlan);

        modPlan.setText("Buscar / Modificar");
        modPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modPlanMousePressed(evt);
            }
        });
        jMPlan.add(modPlan);

        jMenuBar1.add(jMPlan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPacienteActionPerformed
        AgregarPaciente guiPaciente = new AgregarPaciente();

        guiPaciente.setVisible(true);

        jDesktopPane1.add(guiPaciente);
        guiPaciente.setLocation(800, -23);
        guiPaciente.setUI(null);
    }//GEN-LAST:event_cargarPacienteActionPerformed

    private void ModPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModPacienteActionPerformed
        ModificarPaciente guiPacienteMod = new ModificarPaciente();
        guiPacienteMod.setVisible(true);
        jDesktopPane1.add(guiPacienteMod);
        guiPacienteMod.setLocation(800, -23);
        guiPacienteMod.setUI(null);
    }//GEN-LAST:event_ModPacienteActionPerformed

    private void BuscPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscPacienteActionPerformed
        BuscarPaciente guiPacienteBus = new BuscarPaciente();
        guiPacienteBus.setVisible(true);
        jDesktopPane1.add(guiPacienteBus);
        guiPacienteBus.setLocation(475, -23);
        guiPacienteBus.setUI(null);
    }//GEN-LAST:event_BuscPacienteActionPerformed

    private void jMAgregarComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMAgregarComidaMousePressed
        AgregarComida aux = new AgregarComida();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
        aux.setLocation(800, -23);
        aux.setUI(null);
    }//GEN-LAST:event_jMAgregarComidaMousePressed

    private void jMModificarComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMModificarComidaMousePressed
        ModificarComida aux = new ModificarComida();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
        aux.setLocation(800, -23);
        aux.setUI(null);
    }//GEN-LAST:event_jMModificarComidaMousePressed

    private void jMBuscarComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMBuscarComidaMousePressed
        BuscarComida aux = new BuscarComida();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
        aux.setLocation(475, -23);
        aux.setUI(null);

    }//GEN-LAST:event_jMBuscarComidaMousePressed

    private void agregarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDietaActionPerformed
        AgregarDieta aux = new AgregarDieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
        aux.setLocation(800, -23);
        aux.setUI(null);
    }//GEN-LAST:event_agregarDietaActionPerformed

    private void modificarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDietaActionPerformed
        ModificarDieta aux = new ModificarDieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
        aux.setLocation(800, -23);
        aux.setUI(null);
    }//GEN-LAST:event_modificarDietaActionPerformed

    private void buscarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDietaActionPerformed
        BuscarDieta aux = new BuscarDieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
        aux.setLocation(475, -23);
        aux.setUI(null);

    }//GEN-LAST:event_buscarDietaActionPerformed

    private void agregarPlanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarPlanMousePressed
        AgregarItemDieta aux = new AgregarItemDieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
        aux.setLocation(800, -23);
        aux.setUI(null);
    }//GEN-LAST:event_agregarPlanMousePressed

    private void modPlanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modPlanMousePressed
        BuscarItemdieta aux = new BuscarItemdieta();
        aux.setVisible(true);
        jDesktopPane1.add(aux);
         aux.setLocation(475, -23);
        aux.setUI(null);
    }//GEN-LAST:event_modPlanMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscPaciente;
    private javax.swing.JMenu MenuDieta;
    private javax.swing.JMenuItem ModPaciente;
    private javax.swing.JMenu Paciente;
    private javax.swing.JMenuItem agregarDieta;
    private javax.swing.JMenuItem agregarPlan;
    private javax.swing.JMenuItem buscarDieta;
    private javax.swing.JMenuItem cargarPaciente;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMAgregarComida;
    private javax.swing.JMenuItem jMBuscarComida;
    private javax.swing.JMenuItem jMModificarComida;
    private javax.swing.JMenu jMPlan;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem modPlan;
    private javax.swing.JMenuItem modificarDieta;
    // End of variables declaration//GEN-END:variables
}
