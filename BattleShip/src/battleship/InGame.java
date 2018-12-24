/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author ASUS R.O.G
 */
public class InGame extends javax.swing.JFrame {
    private JButton[][] papan1 = new JButton[10][10];
    private JButton[][] papan2 = new JButton[10][10];
    
    public InGame() {
        initComponents();
        int posisiX=0;
        int posisiY=0;
        int size=35;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //papan untuk player1
                papan1[i][j] = new JButton();
                papan1[i][j].setBackground(Color.white);
                papan1[i][j].setSize(size, size);
                papan1[i][j].setLocation(posisiX, posisiY);
                player1.add(papan1[i][j]);
                
                papan2[i][j] = new JButton();
                papan2[i][j].setBackground(Color.white);
                papan2[i][j].setSize(size, size);
                papan2[i][j].setLocation(posisiX, posisiY);
                player2.add(papan2[i][j]);
                posisiX+=35;
            }
            posisiX=0;
            posisiY+=35;
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        player1 = new javax.swing.JPanel();
        player2 = new javax.swing.JPanel();
        bgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warfare/battleship.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 40, 210);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 140, 210, 340);

        player1.setLayout(null);
        getContentPane().add(player1);
        player1.setBounds(290, 140, 350, 350);

        player2.setLayout(null);
        getContentPane().add(player2);
        player2.setBounds(720, 140, 350, 350);

        bgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpg"))); // NOI18N
        getContentPane().add(bgMenu);
        bgMenu.setBounds(0, 0, 1100, 650);

        setSize(new java.awt.Dimension(1100, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel player1;
    private javax.swing.JPanel player2;
    // End of variables declaration//GEN-END:variables
}
