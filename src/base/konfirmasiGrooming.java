/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

/**
 *
 * @author ASUS
 */
public class konfirmasiGrooming extends javax.swing.JFrame {

    /**
     * Creates new form konfirmasiShop
     */
    public konfirmasiGrooming() {
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

        home = new javax.swing.JButton();
        btn_shop = new javax.swing.JButton();
        btn_konsul = new javax.swing.JButton();
        btn_groom = new javax.swing.JButton();
        btn_hotel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 40));

        btn_shop.setText("Shop");
        btn_shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shopActionPerformed(evt);
            }
        });
        getContentPane().add(btn_shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 40));

        btn_konsul.setText("Konsultasi");
        btn_konsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konsulActionPerformed(evt);
            }
        });
        getContentPane().add(btn_konsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 40));

        btn_groom.setText("Grooming");
        btn_groom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_groomActionPerformed(evt);
            }
        });
        getContentPane().add(btn_groom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 130, 40));

        btn_hotel.setText("Hotel");
        btn_hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hotelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen_asset/Buy_konfirmasi1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void btn_shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_shopActionPerformed
        // TODO add your handling code here:

        dispose();
        new shopping().setVisible(true);
    }//GEN-LAST:event_btn_shopActionPerformed

    private void btn_konsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konsulActionPerformed
        // TODO add your handling code here:
        dispose();
        new konsultasi().setVisible(true);
    }//GEN-LAST:event_btn_konsulActionPerformed

    private void btn_groomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_groomActionPerformed
        // TODO add your handling code here:
        dispose();
        new grooming().setVisible(true);
    }//GEN-LAST:event_btn_groomActionPerformed

    private void btn_hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hotelActionPerformed
        // TODO add your handling code here:
        dispose();
        new hotel().setVisible(true);
    }//GEN-LAST:event_btn_hotelActionPerformed

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
            java.util.logging.Logger.getLogger(konfirmasiGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konfirmasiGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konfirmasiGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konfirmasiGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konfirmasiGrooming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_groom;
    private javax.swing.JButton btn_hotel;
    private javax.swing.JButton btn_konsul;
    private javax.swing.JButton btn_shop;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
