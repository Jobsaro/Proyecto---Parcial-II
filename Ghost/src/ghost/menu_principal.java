
package ghost;

import javax.swing.JOptionPane;

public class menu_principal extends javax.swing.JFrame {

   
    public menu_principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugar = new javax.swing.JButton();
        report = new javax.swing.JButton();
        sign_out = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        perfil = new javax.swing.JButton();
        config = new javax.swing.JButton();
        crear_player = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(560, 240));

        jugar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jugar.setText("Jugar Ghosts");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        report.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        report.setText("Reportes");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        sign_out.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sign_out.setText("Cerrar Sesión");
        sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_outActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ghosts");

        perfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        perfil.setText("Mi Perfil");
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        config.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        config.setText("Configuración");
        config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configActionPerformed(evt);
            }
        });

        crear_player.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        crear_player.setText("Crear Cuenta");
        crear_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_playerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sign_out))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(config, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(crear_player))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jugar)
                        .addGap(18, 18, 18)
                        .addComponent(report))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(config)
                        .addGap(18, 18, 18)
                        .addComponent(perfil)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sign_out)
                    .addComponent(crear_player))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        // TODO add your handling code here:
        String jugador2;
        
        do {
            jugador2 = JOptionPane.showInputDialog("Ingrese el nombre del jugador rival.");
        } while (jugador2.equals(String.valueOf(GhostGame.juego.jugador1)));
        
        Player jugador = GhostGame.juego.jugador2(jugador2);
        
        if (jugador != null){
            JOptionPane.showMessageDialog(this, "Se ha encontrado al jugador " + jugador.getUsername());
            dispose();
            GhostGame.juego.iniciar_juego();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado al jugador. Intentelo de nuevo.");
        }
    }//GEN-LAST:event_jugarActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        reportes ventanaReportes = new reportes();
        ventanaReportes.setVisible(true);
        dispose();
    }//GEN-LAST:event_reportActionPerformed

    private void sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_outActionPerformed
        // TODO add your handling code here:
        menu_inicio menu = new menu_inicio();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_sign_outActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        // TODO add your handling code here:
        miperfil perfilVentana = new miperfil();
        perfilVentana.setVisible(true);
        dispose();
    }//GEN-LAST:event_perfilActionPerformed

    private void configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configActionPerformed
        // TODO add your handling code here:
        configuracion config = new configuracion();
        config.setVisible(true);
        dispose();
    }//GEN-LAST:event_configActionPerformed

    private void crear_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_playerActionPerformed
        // TODO add your handling code here:
        crear_player registro = new crear_player();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_crear_playerActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton config;
    private javax.swing.JButton crear_player;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jugar;
    private javax.swing.JButton perfil;
    private javax.swing.JButton report;
    private javax.swing.JButton sign_out;
    // End of variables declaration//GEN-END:variables
}
