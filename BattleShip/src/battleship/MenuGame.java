package battleship;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS R.O.G
 */
public class MenuGame extends javax.swing.JFrame {

    public MenuGame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        papanSkor = new javax.swing.JButton();
        mulai = new javax.swing.JButton();
        bgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 360, 34, 14);

        judul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TOMBOL/judul.png"))); // NOI18N
        getContentPane().add(judul);
        judul.setBounds(345, 30, 410, 53);

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TOMBOL/keluar.png"))); // NOI18N
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(462, 280, 176, 60);

        papanSkor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TOMBOL/papanSkor.png"))); // NOI18N
        papanSkor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papanSkorActionPerformed(evt);
            }
        });
        getContentPane().add(papanSkor);
        papanSkor.setBounds(580, 180, 250, 60);

        mulai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TOMBOL/mulai.png"))); // NOI18N
        mulai.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mulai.setMaximumSize(new java.awt.Dimension(300, 110));
        mulai.setMinimumSize(new java.awt.Dimension(250, 60));
        mulai.setPreferredSize(new java.awt.Dimension(250, 60));
        mulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiActionPerformed(evt);
            }
        });
        getContentPane().add(mulai);
        mulai.setBounds(270, 180, 250, 60);

        bgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpg"))); // NOI18N
        getContentPane().add(bgMenu);
        bgMenu.setBounds(0, 0, 1100, 650);

        setSize(new java.awt.Dimension(1100, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void mulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiActionPerformed
        try {
            Permainan play = new Permainan();
            play.start();
        } catch (IOException ex) {
            Logger.getLogger(MenuGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        
    }//GEN-LAST:event_mulaiActionPerformed

    private void papanSkorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papanSkorActionPerformed
        ScoreBoard sc = new ScoreBoard();
        sc.setVisible(true);
        dispose();
    }//GEN-LAST:event_papanSkorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel judul;
    private javax.swing.JButton keluar;
    private javax.swing.JButton mulai;
    private javax.swing.JButton papanSkor;
    // End of variables declaration//GEN-END:variables
}
