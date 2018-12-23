package battleship;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS R.O.G
 */
public class BattleShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoadingGame lg = new LoadingGame();
        lg.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10); //jangan lupa diganti kalau seluruhnya sudah selesai
                lg.proses.setText("LOADING DATA "+Integer.toString(i)+"%");
                lg.loading.setValue(i);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MenuGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        MenuGame bs = new MenuGame();
        bs.setVisible(true);
        lg.dispose();
    }
    
}
