/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import javax.swing.JPanel;
/**
 *
 * @author ASUS R.O.G
 */
public class InGame extends javax.swing.JFrame {
    private JPanel temp;
    JPanel self;
    /**
     * Creates new form LoadingGame
     */
    public InGame() {
        PapanGame pg = new PapanGame();
        pg.setVisible(true);
        pg.setSize(400, 400);
        add(pg);
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

        bgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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
    // End of variables declaration//GEN-END:variables
}
