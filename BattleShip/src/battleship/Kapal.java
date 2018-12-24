package battleship;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ASUS R.O.G
 */
public class Kapal{
    public JLabel[] kapal = new JLabel[5];
    public final ImageIcon[] gambarKapal = new ImageIcon[5];
    
    public Kapal(){
        setKapal();
        for (int i = 0; i < 5; i++) {
            kapal[i] = new JLabel(gambarKapal[i]);
        }
        kapal[0].setSize(35, 210);
        kapal[1].setSize(70, 210);
        kapal[2].setSize(35, 140);
        kapal[3].setSize(35, 105);
        kapal[4].setSize(35, 140);
    }
    
    private void setKapal(){
        gambarKapal[0] = createImageIcon("warfare/battleship.png"); //kapal perang kelas besar
        gambarKapal[1] = createImageIcon("warfare/carier.png"); //kapal induk
        gambarKapal[2] = createImageIcon("warfare/cruiser.png"); //kapal perang kelas kecil
        gambarKapal[3] = createImageIcon("warfare/destroyer.png"); //kapal penghancur
        gambarKapal[4] = createImageIcon("warfare/submarine.png"); //kapal selam
    }
    
    protected ImageIcon createImageIcon(String path){
        java.net.URL gambarURL=getClass().getResource(path);
        if (gambarURL!=null) {
            return new ImageIcon(gambarURL);
        }else{
            System.err.print("file tidak dapat di temukan "+path);
            return null;
        }
    }
}