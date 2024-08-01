/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import zoologico.Zoologico;

/**
 *
 * @author Alejandro Padilla
 */
public class ViewHabitat extends javax.swing.JFrame {

    private RegistroAnimales registroAnimales;

    public void mostrarTabla(Tabla tabla) {
        tabla.setVisible(true);
    }
    
    public ViewHabitat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTXT = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        ButSalir = new javax.swing.JButton();
        PanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuTrabajo = new javax.swing.JMenu();
        SaludOption = new javax.swing.JMenuItem();
        AlimentoOption = new javax.swing.JMenuItem();
        MenuAnimales = new javax.swing.JMenu();
        RegistroOption = new javax.swing.JMenuItem();
        TablaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTXT.setBackground(new java.awt.Color(0, 102, 102));

        txt1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Bienvenido al aplicativo del ");

        txt2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("Zoologico. Utilice el menu");

        txt3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("Para relizar sus tareas");

        ButSalir.setBackground(new java.awt.Color(255, 102, 102));
        ButSalir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ButSalir.setText("Salir");
        ButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTXTLayout = new javax.swing.GroupLayout(PanelTXT);
        PanelTXT.setLayout(PanelTXTLayout);
        PanelTXTLayout.setHorizontalGroup(
            PanelTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTXTLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(PanelTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButSalir)
                    .addGroup(PanelTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        PanelTXTLayout.setVerticalGroup(
            PanelTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTXTLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));

        MenuTrabajo.setText("Trabajador");

        SaludOption.setText("Operario Salud");
        SaludOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaludOptionActionPerformed(evt);
            }
        });
        MenuTrabajo.add(SaludOption);

        AlimentoOption.setText("Gestion Alimento");
        AlimentoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlimentoOptionActionPerformed(evt);
            }
        });
        MenuTrabajo.add(AlimentoOption);

        jMenuBar1.add(MenuTrabajo);

        MenuAnimales.setBackground(new java.awt.Color(0, 255, 255));
        MenuAnimales.setText("Animales");

        RegistroOption.setText("Registrar Animal");
        RegistroOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroOptionActionPerformed(evt);
            }
        });
        MenuAnimales.add(RegistroOption);

        TablaMenuItem.setText("Tabla");
        TablaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaMenuItemActionPerformed(evt);
            }
        });
        MenuAnimales.add(TablaMenuItem);

        jMenuBar1.add(MenuAnimales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaludOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaludOptionActionPerformed
        Salud1 salud = new Salud1();
        salud.setVisible(true);
        salud.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_SaludOptionActionPerformed

    private void RegistroOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroOptionActionPerformed
        RegistroAnimales registro = new RegistroAnimales();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_RegistroOptionActionPerformed

    private void TablaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaMenuItemActionPerformed
        Zoologico.tablaGlobal.setVisible(true);
        Zoologico.tablaGlobal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_TablaMenuItemActionPerformed

    private void AlimentoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlimentoOptionActionPerformed
        Alimentar alimento = new Alimentar();
        alimento.setVisible(true);
        alimento.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_AlimentoOptionActionPerformed

    private void ButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalirActionPerformed
        LogIn log = new LogIn();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_ButSalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlimentoOption;
    private javax.swing.JButton ButSalir;
    private javax.swing.JMenu MenuAnimales;
    private javax.swing.JMenu MenuTrabajo;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelTXT;
    private javax.swing.JMenuItem RegistroOption;
    private javax.swing.JMenuItem SaludOption;
    private javax.swing.JMenuItem TablaMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
