package battleship;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author ASUS R.O.G
 */
public class Kapal {
    private Image iconKapal = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("warfare/battleship.png"));
    
    public Image getImage(){
        return iconKapal;
    }
}
