/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import javax.swing.JOptionPane;
import zoologico.Animales;
import zoologico.Zoologico;

/**
 *
 * @author Alejandro Padilla
 */
public class RegistroAnimales extends javax.swing.JFrame {

    final Tabla tablaFrame;
    
    public RegistroAnimales() {
        initComponents();
        tablaFrame = new Tabla(); 
    }
    

    public Animales registeranimal(){
        Animales animalx = new Animales(NomAnimaltxtField.getText(),TipoAnimalTxtField.getText(),EdadTxtField.getText(),PesoTxtField.getText(),AlimentotxtField.getText(),JaulaTxtField.getText());
        return animalx;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        PanelRegis = new javax.swing.JPanel();
        txt1Res = new javax.swing.JLabel();
        txt2Res = new javax.swing.JLabel();
        txt3Res = new javax.swing.JLabel();
        txt4Res = new javax.swing.JLabel();
        txt5Res = new javax.swing.JLabel();
        txt6Res = new javax.swing.JLabel();
        NomAnimaltxtField = new javax.swing.JTextField();
        EdadTxtField = new javax.swing.JTextField();
        PesoTxtField = new javax.swing.JTextField();
        AlimentotxtField = new javax.swing.JTextField();
        ButCompletarRegis = new javax.swing.JButton();
        TipoAnimalTxtField = new javax.swing.JTextField();
        JaulaTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRegis.setBackground(new java.awt.Color(0, 102, 102));

        txt1Res.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txt1Res.setForeground(new java.awt.Color(255, 255, 255));
        txt1Res.setText("Ingrese el animal");

        txt2Res.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txt2Res.setForeground(new java.awt.Color(255, 255, 255));
        txt2Res.setText("Seleccione el tipo de animal");

        txt3Res.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txt3Res.setForeground(new java.awt.Color(255, 255, 255));
        txt3Res.setText("Edad");

        txt4Res.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txt4Res.setForeground(new java.awt.Color(255, 255, 255));
        txt4Res.setText("Peso");

        txt5Res.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txt5Res.setForeground(new java.awt.Color(255, 255, 255));
        txt5Res.setText("Alimento");

        txt6Res.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txt6Res.setForeground(new java.awt.Color(255, 255, 255));
        txt6Res.setText("Número de jaula");

        EdadTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadTxtFieldActionPerformed(evt);
            }
        });

        ButCompletarRegis.setBackground(new java.awt.Color(0, 153, 153));
        ButCompletarRegis.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ButCompletarRegis.setForeground(new java.awt.Color(255, 255, 255));
        ButCompletarRegis.setText("Completar Registro");
        ButCompletarRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCompletarRegisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegisLayout = new javax.swing.GroupLayout(PanelRegis);
        PanelRegis.setLayout(PanelRegisLayout);
        PanelRegisLayout.setHorizontalGroup(
            PanelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt3Res)
                        .addComponent(txt6Res)
                        .addComponent(txt5Res)
                        .addComponent(txt4Res)
                        .addComponent(txt1Res)
                        .addComponent(txt2Res)
                        .addComponent(AlimentotxtField)
                        .addComponent(EdadTxtField)
                        .addComponent(NomAnimaltxtField)
                        .addComponent(PesoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TipoAnimalTxtField)
                        .addComponent(JaulaTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addComponent(ButCompletarRegis))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        PanelRegisLayout.setVerticalGroup(
            PanelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txt1Res)
                .addGap(9, 9, 9)
                .addComponent(NomAnimaltxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt2Res)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoAnimalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txt3Res)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdadTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt4Res)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt5Res)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlimentotxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt6Res)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JaulaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ButCompletarRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        FondoPanel.add(PanelRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 410, 460));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 70, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogInFondo.jpg"))); // NOI18N
        Fondo.setText("jLabel1");
        FondoPanel.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EdadTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadTxtFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewHabitat main = new ViewHabitat();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButCompletarRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCompletarRegisActionPerformed
        Zoologico.tablaGlobal.agregarElemento(registeranimal()); 
        JOptionPane.showMessageDialog(this, "Se registro el animal correctamente");
    }//GEN-LAST:event_ButCompletarRegisActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlimentotxtField;
    private javax.swing.JButton ButCompletarRegis;
    private javax.swing.JTextField EdadTxtField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JTextField JaulaTxtField;
    private javax.swing.JTextField NomAnimaltxtField;
    private javax.swing.JPanel PanelRegis;
    private javax.swing.JTextField PesoTxtField;
    private javax.swing.JTextField TipoAnimalTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel txt1Res;
    private javax.swing.JLabel txt2Res;
    private javax.swing.JLabel txt3Res;
    private javax.swing.JLabel txt4Res;
    private javax.swing.JLabel txt5Res;
    private javax.swing.JLabel txt6Res;
    // End of variables declaration//GEN-END:variables
}
