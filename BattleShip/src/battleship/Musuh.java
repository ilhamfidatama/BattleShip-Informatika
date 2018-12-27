/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS R.O.G
 */
public class Musuh implements Game{
    public Image musuh;
    public int posisiX=1100;
    public int posisiY=0;
    public static final double kecepatan=5;
    
    public Musuh(){
        posisiY = (int) (Math.random() * 600);
        musuh = new ImageIcon(this.getClass().getResource("/warfare/battleship.png")).getImage();
    }

    @Override
    public void gerak() {
        posisiX -= kecepatan;
        Rectangle musuh = new Rectangle(posisiX, posisiY, 50, 38);
        Rectangle pemain = new Rectangle(Pemain.getPosisiPemainX(), Pemain.getPosisiPemainY(),41,35);
        
        if (musuh.intersects(pemain)) {
            Permainan.jalan=false;
        }
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(musuh, posisiX, posisiY, 60, 46, null);
    }
}
