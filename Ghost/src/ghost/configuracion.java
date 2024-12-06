
package ghost;

import javax.swing.JOptionPane;


public class configuracion extends javax.swing.JFrame {

   
    public configuracion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modo_juego = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dificultad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(560, 240));

        modo_juego.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modo_juego.setText("Modo de Juego");
        modo_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modo_juegoActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salir.setText("Volver al Inicio");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ghosts");

        dificultad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dificultad.setText("Dificultad");
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modo_juego, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(dificultad)
                .addGap(18, 18, 18)
                .addComponent(modo_juego)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modo_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modo_juegoActionPerformed
        // TODO add your handling code here:
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(this, "Elige el modo de juego que quieres jugar: \n 1. Aleatorio.\n 2. Manual."));

        switch (opcion) {
            case 1:
                GhostGame.juego.modo_juego = "ALEATORIO";
                JOptionPane.showMessageDialog(this, "Se ha cambiado el modo de juego a ALEATORIO.");
                break;

            case 2:
                GhostGame.juego.modo_juego = "MANUAL";
                JOptionPane.showMessageDialog(this, "Se ha cambiado el modo de juego a MANUAL.");
                break;

            default:
                JOptionPane.showMessageDialog(this, "Seleccione una de las opciones que se presentan.");
        }
    }//GEN-LAST:event_modo_juegoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        menu_principal menu = new menu_principal();
        menu.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void dificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificultadActionPerformed
        // TODO add your handling code here:
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(this, "Elige la dificultad en la que quieres jugar: \n 1. Normal.\n 2. Expert.\n 3. Genius."));
        
        switch (opcion) {
            case 1:
                GhostGame.juego.dificultad = "NORMAL";
                JOptionPane.showMessageDialog(this, "Se ha cambiado la dificultad a NORMAL.");
                break;
                
            case 2:
                GhostGame.juego.dificultad = "EXPERT";
                JOptionPane.showMessageDialog(this, "Se ha cambiado la dificultad a EXPERT.");
                break;
                
            case 3:
                GhostGame.juego.dificultad = "GENIUS";
                JOptionPane.showMessageDialog(this, "Se ha cambiado la dificultad a GENIUS.");
                break;
                
            default:
                JOptionPane.showMessageDialog(this, "Seleccione una de las opciones que se presentan.");
        }
    }//GEN-LAST:event_dificultadActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dificultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modo_juego;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
