/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS R.O.G
 */
public class Pemain extends Game{
    public Image pemain;
    public boolean kiri, kanan, atas, bawah; //untuk menentukan arah
    public static int posisiX=0, posisiY=250;
    public boolean posisiAwal=true, setKiri, setKanan;
    private final int speed=3;
    
    public Pemain(){
        pemain = new ImageIcon(this.getClass().getResource("/warfare/battleship.png")).getImage();
    }
    
    public void setKiri(boolean l){
        kiri = l;
    }
    public void setKanan(boolean r){
        kanan = r;
    }
    public void setAtas(boolean u){
        atas = u;
    }
    public void setBawah(boolean b){
        bawah = b;
    }
    
    public static int getPosisiPemainX(){
        return posisiX;
    }
    
    public static int getPosisiPemainY(){
        return posisiY;
    }

    @Override
    public void gerak() {
        if (kiri){
            posisiX-=speed;
            setKiri=true;
            setKanan=false;
            posisiAwal=false;
        }
        if (kanan){
            posisiX+=speed;
            setKiri=false;
            setKanan=true;
            posisiAwal=false;
        }
        if (atas){
            posisiY-=speed;
        }
        if (bawah){
            posisiY+=speed;
        }
        //kondisi-kondisi di bawah ini digunakan agar objek nya tidak keluar dari frame
        if (posisiX<=0){
            kiri=false;
            posisiX=0;
        }
       
        if (posisiX>=1100){
            kanan=false;
            posisiX=1100;
        }
       
        if (posisiY<=0){
            atas=false;
            posisiY=0;
        }
       
        if (posisiY>=650){
            bawah=false;
            posisiY=650;
        }
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(pemain, posisiX, posisiY, null);
//        if (posisiAwal){
//            g.drawImage(pemain, posisiX, posisiY, null);
//        }
//        if (setKiri){
//            g.drawImage(pemain, posisiX+51, posisiY, -51, 43, null);
//        }
//        if (setKanan){
//            g.drawImage(pemain, posisiX, posisiY, null);
//        }
    }
    
}
