
package Views;

import zoologico.TrabajaAlimento;
/**
 * @author Alejandro Padilla
 */
public class Alimentar extends javax.swing.JFrame {


    public Alimentar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButTrabajar = new javax.swing.JButton();
        ButReabastecer = new javax.swing.JButton();
        ButMonito = new javax.swing.JButton();
        TXTitulo = new javax.swing.JLabel();
        SalirBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        ButTrabajar.setBackground(new java.awt.Color(0, 153, 153));
        ButTrabajar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ButTrabajar.setForeground(new java.awt.Color(255, 255, 255));
        ButTrabajar.setText("Alimentar");
        ButTrabajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButTrabajarActionPerformed(evt);
            }
        });

        ButReabastecer.setBackground(new java.awt.Color(0, 153, 153));
        ButReabastecer.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ButReabastecer.setForeground(new java.awt.Color(255, 255, 255));
        ButReabastecer.setText("Reabastecer");
        ButReabastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButReabastecerActionPerformed(evt);
            }
        });

        ButMonito.setBackground(new java.awt.Color(0, 153, 153));
        ButMonito.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ButMonito.setForeground(new java.awt.Color(255, 255, 255));
        ButMonito.setText("Monitorear");
        ButMonito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButMonitoActionPerformed(evt);
            }
        });

        TXTitulo.setBackground(new java.awt.Color(0, 153, 153));
        TXTitulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        TXTitulo.setForeground(new java.awt.Color(255, 255, 255));
        TXTitulo.setText("Apartado Alimentacion y Cuidado");

        SalirBut.setBackground(new java.awt.Color(255, 102, 102));
        SalirBut.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        SalirBut.setText("Salir");
        SalirBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButMonito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButReabastecer, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(ButTrabajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalirBut))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(TXTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(ButTrabajar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ButReabastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ButMonito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(SalirBut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogInFondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButTrabajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButTrabajarActionPerformed
        TrabajaAlimento.Trabaja1.Trabajar();
    }//GEN-LAST:event_ButTrabajarActionPerformed

    private void ButReabastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButReabastecerActionPerformed
        TrabajaAlimento.Trabaja1.Reabastecer();
    }//GEN-LAST:event_ButReabastecerActionPerformed

    private void ButMonitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButMonitoActionPerformed
        TrabajaAlimento.Trabaja1.Monitorear();
    }//GEN-LAST:event_ButMonitoActionPerformed

    private void SalirButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButActionPerformed
        ViewHabitat main = new ViewHabitat();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_SalirButActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButMonito;
    private javax.swing.JButton ButReabastecer;
    private javax.swing.JButton ButTrabajar;
    private javax.swing.JButton SalirBut;
    private javax.swing.JLabel TXTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
