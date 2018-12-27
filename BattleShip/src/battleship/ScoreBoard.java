/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author ASUS R.O.G
 */
public class ScoreBoard extends javax.swing.JFrame {
    private static final String url = "jdbc:mysql://localhost/Battleship";
    private static final String jdbc = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private final String sql = "SELECT * FROM pemain ORDER BY point DESC LIMIT 1";
    
    private static Connection koneksi;
    private static Statement stat;
    private static ResultSet rs;
    
    private int posisiX = 100;
    private int posisiY = 30;
    public ScoreBoard() {
        int i=0;
        initComponents();
        try {
            Class.forName(jdbc);
            koneksi = DriverManager.getConnection(url, user, password);
            stat = koneksi.createStatement();
            
            rs = stat.executeQuery(sql);
            
            while(rs.next()){
                nama.setText(rs.getString("nama"));
                nama.setLocation(posisiX, posisiY);
                nama.setSize(150, 30);
                posisiX+=160;
                point.setText(rs.getString("point"));
                point.setLocation(posisiX, posisiY);
                point.setSize(150, 30);
                posisiY+=40;
                posisiX=100;
                i++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ScoreBoard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ScoreBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void diskonek(){
        try {
            stat.close();
            koneksi.close();
        } catch (SQLException ex) {
            Logger.getLogger(ScoreBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        point = new javax.swing.JLabel();
        bgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panel1.setLayout(null);

        nama.setBackground(new java.awt.Color(255, 255, 255));
        nama.setFont(new java.awt.Font("Bebas Neue", 0, 40)); // NOI18N
        nama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nama.setLabelFor(panel1);
        panel1.add(nama);
        nama.setBounds(20, 30, 230, 70);

        point.setBackground(new java.awt.Color(255, 255, 255));
        point.setFont(new java.awt.Font("Bebas Neue", 0, 40)); // NOI18N
        panel1.add(point);
        point.setBounds(310, 30, 230, 70);

        getContentPane().add(panel1);
        panel1.setBounds(220, 120, 570, 370);

        bgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/scoreboard.jpg"))); // NOI18N
        getContentPane().add(bgMenu);
        bgMenu.setBounds(0, 0, 1100, 650);

        setSize(new java.awt.Dimension(1100, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgMenu;
    private javax.swing.JLabel nama;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel point;
    // End of variables declaration//GEN-END:variables
}
