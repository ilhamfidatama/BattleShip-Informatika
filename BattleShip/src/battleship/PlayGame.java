package battleship;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS R.O.G
 */
public class PlayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoadingGame lg = new LoadingGame();
        lg.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100); //jangan lupa diganti kalau seluruhnya sudah selesai
                lg.proses.setText("LOADING DATA "+Integer.toString(i)+"%");
                lg.loading.setValue(i);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(BattleShip.class.getName()).log(Level.SEVERE, null, ex);
        }
        BattleShip bs = new BattleShip();
        bs.setVisible(true);
        lg.dispose();
    }
    
}
