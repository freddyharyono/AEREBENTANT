/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerebenant;

/**
 *
 * @author edy
 */
public final class Aereben extends javax.swing.JFrame {

    /**
     * Creates new form Aereben
     */
    public Aereben() {
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

        jLabel1 = new javax.swing.JLabel();
        AE = new javax.swing.JButton();
        BER = new javax.swing.JButton();
        ENTROPY = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        hitungkata = new javax.swing.JButton();
        Hillcipher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AEREBEN");

        AE.setText("AE");
        AE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AEMouseClicked(evt);
            }
        });
        AE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AEActionPerformed(evt);
            }
        });

        BER.setText("BER");
        BER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BERActionPerformed(evt);
            }
        });

        ENTROPY.setText("ENTROPY");
        ENTROPY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTROPYActionPerformed(evt);
            }
        });

        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        hitungkata.setText("Hitung Kata");
        hitungkata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungkataActionPerformed(evt);
            }
        });

        Hillcipher.setText("Hill Chipper");
        Hillcipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HillcipherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hillcipher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BER)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ENTROPY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hitungkata))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exit)
                        .addGap(188, 188, 188)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AE)
                    .addComponent(ENTROPY)
                    .addComponent(BER)
                    .addComponent(hitungkata)
                    .addComponent(Hillcipher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AEActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AE ae = new AE();
        ae.setVisible(true);
    }//GEN-LAST:event_AEActionPerformed

    private void BERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BERActionPerformed
        // TODO add your handling code here:
        this.dispose();
        BER ber = new BER();
        ber.setVisible(true);
    }//GEN-LAST:event_BERActionPerformed

    private void ENTROPYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTROPYActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ENTROPY entropy = new ENTROPY();
        entropy.setVisible(true);
    }//GEN-LAST:event_ENTROPYActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void hitungkataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungkataActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HitungKata a = new HitungKata();
        a.setVisible(true);
    }//GEN-LAST:event_hitungkataActionPerformed

    private void AEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AEMouseClicked

    private void HillcipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HillcipherActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HillChipper a = new HillChipper();
        a.setVisible(true);
    }//GEN-LAST:event_HillcipherActionPerformed

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
            java.util.logging.Logger.getLogger(Aereben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aereben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aereben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aereben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Aereben().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AE;
    private javax.swing.JButton BER;
    private javax.swing.JButton ENTROPY;
    private javax.swing.JButton Hillcipher;
    private javax.swing.JButton exit;
    private javax.swing.JButton hitungkata;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
