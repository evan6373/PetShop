/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class shopping extends javax.swing.JFrame {

    /**
     * Creates new form shopping
     */
    public shopping() {
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

        btn_beli = new javax.swing.JButton();
        btn_shop = new javax.swing.JButton();
        btn_konsul = new javax.swing.JButton();
        btn_groom = new javax.swing.JButton();
        btn_hotel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_beli.setBackground(new java.awt.Color(109, 100, 100));
        btn_beli.setForeground(new java.awt.Color(255, 255, 255));
        btn_beli.setText("Beli");
        btn_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 260, 70));

        btn_shop.setText("Home");
        btn_shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shopActionPerformed(evt);
            }
        });
        getContentPane().add(btn_shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 40));

        btn_konsul.setText("Konsultasi");
        btn_konsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konsulActionPerformed(evt);
            }
        });
        getContentPane().add(btn_konsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 40));

        btn_groom.setText("Grooming");
        btn_groom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_groomActionPerformed(evt);
            }
        });
        getContentPane().add(btn_groom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 40));

        btn_hotel.setText("Hotel");
        btn_hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hotelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen_asset/whiskas.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 222, 210, 180));

        jRadioButton1.setText("Whiskas - Rp. 150.000");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen_asset/shopping1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beliActionPerformed
        // TODO add your handling code here:
         String product = "Whiskas";
        int price = 150000;

        // Memanggil method untuk menyimpan data ke database
        insertDataToShopping(product, price);
        
        dispose();
        new konfirmasiShop().setVisible(true);
    }//GEN-LAST:event_btn_beliActionPerformed

     private void insertDataToShopping(String product, int price) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_user_database", "root", "");
            String insertQuery = "INSERT INTO shopping (nama_barang, price) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, product);
                preparedStatement.setInt(2, price);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        
     }
    
    private void btn_shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_shopActionPerformed
        // TODO add your handling code here:
        dispose();
        new home().setVisible(true);
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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shopping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_beli;
    private javax.swing.JButton btn_groom;
    private javax.swing.JButton btn_hotel;
    private javax.swing.JButton btn_konsul;
    private javax.swing.JButton btn_shop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
