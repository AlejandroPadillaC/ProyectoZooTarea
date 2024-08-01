
package Views;


import zoologico.TrabajaSalud;
/**
 * @author Alejandro Padilla
 */
public class Salud1 extends javax.swing.JFrame {


    public Salud1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TrabajarBut = new javax.swing.JButton();
        ReabasBut = new javax.swing.JButton();
        MonitoBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ButSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        TrabajarBut.setBackground(new java.awt.Color(0, 153, 153));
        TrabajarBut.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        TrabajarBut.setForeground(new java.awt.Color(255, 255, 255));
        TrabajarBut.setText("Revisar Aninmales");
        TrabajarBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajarButActionPerformed(evt);
            }
        });

        ReabasBut.setBackground(new java.awt.Color(0, 153, 153));
        ReabasBut.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ReabasBut.setForeground(new java.awt.Color(255, 255, 255));
        ReabasBut.setText("Reabastecer");
        ReabasBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReabasButActionPerformed(evt);
            }
        });

        MonitoBut.setBackground(new java.awt.Color(0, 153, 153));
        MonitoBut.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        MonitoBut.setForeground(new java.awt.Color(255, 255, 255));
        MonitoBut.setText("Monitorear Salud");
        MonitoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonitoButActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apartado Salud y Veterinaria");

        ButSalir.setBackground(new java.awt.Color(255, 102, 102));
        ButSalir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ButSalir.setText("Salir");
        ButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MonitoBut, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(ReabasBut, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(TrabajarBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(82, 82, 82))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(TrabajarBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ReabasBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(MonitoBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(ButSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogInFondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrabajarButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrabajarButActionPerformed
        TrabajaSalud.Trabaja2.Trabajar();
    }//GEN-LAST:event_TrabajarButActionPerformed

    private void ReabasButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReabasButActionPerformed
        TrabajaSalud.Trabaja2.Reabastecer();
    }//GEN-LAST:event_ReabasButActionPerformed

    private void MonitoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonitoButActionPerformed
        TrabajaSalud.Trabaja2.Monitorear();
    }//GEN-LAST:event_MonitoButActionPerformed

    private void ButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalirActionPerformed
        ViewHabitat main = new ViewHabitat();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_ButSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButSalir;
    private javax.swing.JButton MonitoBut;
    private javax.swing.JButton ReabasBut;
    private javax.swing.JButton TrabajarBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
