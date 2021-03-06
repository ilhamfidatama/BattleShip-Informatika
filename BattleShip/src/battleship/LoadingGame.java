package battleship;

/**
 *
 * @author ASUS R.O.G
 */
public class LoadingGame extends javax.swing.JFrame {

    public LoadingGame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proses = new javax.swing.JLabel();
        loading = new javax.swing.JProgressBar();
        bgLoading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        proses.setBackground(new java.awt.Color(255, 255, 255));
        proses.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proses.setForeground(new java.awt.Color(255, 255, 255));
        proses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proses.setLabelFor(loading);
        getContentPane().add(proses);
        proses.setBounds(450, 580, 200, 30);

        loading.setBackground(new java.awt.Color(255, 255, 255));
        loading.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(0, 255, 0));
        loading.setToolTipText("LOADING");
        loading.setBorderPainted(false);
        loading.setString("");
        loading.setStringPainted(true);
        getContentPane().add(loading);
        loading.setBounds(50, 550, 1000, 30);

        bgLoading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loading1.jpg"))); // NOI18N
        getContentPane().add(bgLoading);
        bgLoading.setBounds(0, 0, 1100, 650);

        setSize(new java.awt.Dimension(1100, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLoading;
    public javax.swing.JProgressBar loading;
    public javax.swing.JLabel proses;
    // End of variables declaration//GEN-END:variables
}
