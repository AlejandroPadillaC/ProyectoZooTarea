/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import ModelView.FirebaseSaveObject;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import zoologico.Animales;
import zoologico.*;
import static zoologico.Zoologico.tablaGlobal;

public class Tabla extends javax.swing.JFrame {
    
    private ListSelectionListener tableSelectionListener;
    
    public Tabla() {
        initComponents();
    }
    
    public Animales regisAnimalTab(){
        Animales anim1 = new Animales(TxtName1.getText(),TxtTipAnimal.getText(),TxtEdad.getText(), TxtPeso.getText(), TxtAlimento.getText(), TxtJaula.getText());
        return anim1;
    }
    
    public void initTableSelectionModel() {
        ListSelectionModel selectionModel = Zoologico.tablaGlobal.getjTable1().getSelectionModel();
        tableSelectionListener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = Zoologico.tablaGlobal.getjTable1().getSelectedRow();
                    if (selectedIndex != -1) {
                        SetVisible(getSelectedRowData(Zoologico.tablaGlobal.getjTable1()));
                    }
                }
            }
        };    
        selectionModel.addListSelectionListener(tableSelectionListener);
    }
    
    public void removeTableSelectionListener() {
        ListSelectionModel selectionModel = Zoologico.tablaGlobal.getjTable1().getSelectionModel();
        selectionModel.removeListSelectionListener(tableSelectionListener);
    }
    
    public String[] getSelectedRowData(JTable tabla) {
        int selectedIndex = tabla.getSelectedRow();
        if (selectedIndex != -1) {
            int columnCount = tabla.getColumnCount();
            String[] Fila = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                Fila[i] = (String) tabla.getValueAt(selectedIndex, i);
            }
            return Fila;
        } else {
            return null;
        }
    }
    
    public void SetVisible(String[] Fila){
        TxtName1.setText(Fila[0]);
        TxtTipAnimal.setText(Fila[1]);
        TxtEdad.setText(Fila[2]);
        TxtPeso.setText(Fila[3]);
        TxtAlimento.setText(Fila[4]);
        TxtJaula.setText(Fila[5]);
    }
    
    public JTable getjTable1() {
        return jTable1;
    }

    public ListSelectionListener getTableSelectionListener() {
        return tableSelectionListener;
    }

    public void setTxtAlimento(JTextField TxtAlimento) {
        this.TxtAlimento = TxtAlimento;
    }

    public void setTxtEdad(JTextField TxtEdad) {
        this.TxtEdad = TxtEdad;
    }

    public void setTxtJaula(JTextField TxtJaula) {
        this.TxtJaula = TxtJaula;
    }

    public void setTxtName1(JTextField TxtName1) {
        this.TxtName1 = TxtName1;
    }

    public void setTxtPeso(JTextField TxtPeso) {
        this.TxtPeso = TxtPeso;
    }

    public void setTxtTipAnimal(JTextField TxtTipAnimal) {
        this.TxtTipAnimal = TxtTipAnimal;
    }

    public JTextField getTxtAlimento() {
        return TxtAlimento;
    }

    public JTextField getTxtEdad() {
        return TxtEdad;
    }

    public JTextField getTxtJaula() {
        return TxtJaula;
    }

    public JTextField getTxtName1() {
        return TxtName1;
    }

    public JTextField getTxtPeso() {
        return TxtPeso;
    }

    public JTextField getTxtTipAnimal() {
        return TxtTipAnimal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tabla = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButSalir = new javax.swing.JButton();
        TxtName1 = new javax.swing.JTextField();
        TxtTipAnimal = new javax.swing.JTextField();
        TxtEdad = new javax.swing.JTextField();
        TxtPeso = new javax.swing.JTextField();
        TxtAlimento = new javax.swing.JTextField();
        TxtJaula = new javax.swing.JTextField();
        ButModi = new javax.swing.JButton();
        ButElimi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo de Animal", "Edad", "Peso", "Alimento", "# Jaula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setViewportView(jTable1);

        ButSalir.setBackground(new java.awt.Color(255, 102, 102));
        ButSalir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ButSalir.setText("Salir");
        ButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalirActionPerformed(evt);
            }
        });

        ButModi.setText("Modificar");
        ButModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButModiActionPerformed(evt);
            }
        });

        ButElimi.setText("Eliminar");
        ButElimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButElimiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButSalir)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtName1)
                                    .addComponent(TxtTipAnimal)
                                    .addComponent(TxtEdad)
                                    .addComponent(TxtPeso)
                                    .addComponent(TxtAlimento)
                                    .addComponent(TxtJaula, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButModi, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(ButElimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(TxtTipAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(TxtAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(TxtJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ButModi)
                        .addGap(18, 18, 18)
                        .addComponent(ButElimi)))
                .addGap(18, 18, 18)
                .addComponent(ButSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void ButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalirActionPerformed
        tablaGlobal.removeTableSelectionListener();
        ViewHabitat main = new ViewHabitat();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_ButSalirActionPerformed

    private void ButModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButModiActionPerformed
        try {
            if (regisAnimalTab().getNombre().equals(getSelectedRowData(Zoologico.tablaGlobal.getjTable1())[0])){
                FirebaseSaveObject.conexionglobal.saveFree(regisAnimalTab(),regisAnimalTab().getNombre());
                JOptionPane.showMessageDialog(this, "Se registro el animal correctamente");
            }
            else {
                JOptionPane.showMessageDialog(this, "Usted debe registrar a este nuevo animal");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistroAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButModiActionPerformed

    private void ButElimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButElimiActionPerformed
        try {
                FirebaseSaveObject.conexionglobal.deleteFree(regisAnimalTab(),regisAnimalTab().getNombre());
                JOptionPane.showMessageDialog(this, "Se elimino el animal correctamente");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistroAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButElimiActionPerformed

    /**
     * @param args the command line arguments
     */

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButElimi;
    private javax.swing.JButton ButModi;
    private javax.swing.JButton ButSalir;
    private javax.swing.JScrollPane Tabla;
    private javax.swing.JTextField TxtAlimento;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtJaula;
    private javax.swing.JTextField TxtName1;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JTextField TxtTipAnimal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
