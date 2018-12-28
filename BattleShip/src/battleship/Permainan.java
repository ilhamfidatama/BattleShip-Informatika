/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author ASUS R.O.G
 */
public class Permainan implements Runnable, KeyListener{
    private static final int panjang=1100;
    private static final int lebar=650;
    public static int point=0;
    private Thread thread;
    public static boolean jalan;
    private final Canvas canvas;
    private final JFrame frame;
    private final Image latar;
    private Graphics grafik;
    private final Pemain pemain;
    ArrayList<Musuh> musuh = new ArrayList<Musuh>();
    private BufferStrategy bs; //agar game tidak patah-patah
    
    private int timingEnemy=1000; //kecepatan dibentuknya objek
    private long nowEnemy = System.nanoTime(); //waktu untuk perpindahan posisi objek
    private long timerEnemy = 1000000; //pergerakan objek
    
    public Permainan()throws IOException{
        jalan=true;
        frame = new JFrame("BattleShip");
        frame.setSize(panjang, lebar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);
        frame.setResizable(false);
        frame.setVisible(true);
        canvas = new Canvas();
        canvas.setPreferredSize(
                new Dimension(panjang, lebar)
        );
        canvas.setMinimumSize(
                new Dimension(panjang, lebar)
        );
        canvas.setFocusable(true);
        frame.add(canvas);
        canvas.addKeyListener(this);
        latar = new ImageIcon(this.getClass().getResource("/image/latar.gif")).getImage(); // NOI18N
        pemain = new Pemain();
    }
    
    public synchronized void start(){
        if (point !=0){ //untuk memulai skor dari 0 kembali
            point = 0;
        }
        thread = new Thread(this); //membuat thread
        thread.start(); //menjalankan thread
    }

    @Override
    public void run() {
        double timePerTick = 1000000000/60;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
       
        while(jalan){ //selama boolean jalan true thread akan tetap dijalankan
            now = System.nanoTime();
            delta += (now - lastTime)/timePerTick;
            lastTime = now;
            if(delta >= 1){
                update(); //update posisi objek ikan 
                render(); //menggambar objek ikan
                delta --;
            }
        }
        
        Kalah lose = new Kalah();
        Pemain.posisiX=0;
        Pemain.posisiY=250;
        lose.setVisible(true);
        frame.dispose();
        
    }
    
    private void addMusuh(Musuh m){
        musuh.add(m);
    }
    
    private void update(){ //method untuk pergerakan ikan
        long waktu = (System.nanoTime()-nowEnemy)/timerEnemy;
        
        for(int i=0; i<musuh.size(); i++){ //untuk gerakin ikan musuh
             musuh.get(i).gerak();
        }
        
        if (waktu>timingEnemy){ //kecepatan untuk buat objek
            addMusuh(new Musuh());
            nowEnemy = System.nanoTime();
//            timingEnemy = timingEnemy-2;
        }
        
        for(int i = 0; i < musuh.size();i++){ // remove arraylist dari ikan musuh
            if(musuh.get(i).posisiX <= -50){
                musuh.remove(i);
                point+=8;
            }
        }
    }
    
    private void render(){ //menggambar gameplay yg dibutuhkan
     
        bs = canvas.getBufferStrategy(); //canvas diberikan buffered strategy agar tidak patah-patah
        
        if(bs == null){ //kondisi ketika buffered strategy masih kosong
            canvas.createBufferStrategy(2);
            return;
        }
        
        grafik = bs.getDrawGraphics();
        grafik.drawImage(latar, 0, 0, null);
        
        pemain.draw(grafik); //menggambar ikan pemain dalam frame/canvas
        
        for(int i=0; i<musuh.size(); i++){ //menggambar ikan musuh
            musuh.get(i).draw(grafik);
        }
        
        grafik.setColor(Color.white);
        grafik.setFont(
            new Font("Bebas Neue", Font.PLAIN, 50)
        );
        grafik.drawString(""+point, 550, 50); //menampilkan skor diatas layar
        
        pemain.gerak(); //mengerakan posisi pemain
        bs.show();  //menjalankan buffered strategy   
        
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_A) {
            pemain.setKiri(true);
        }
        else if(e.getKeyCode()==KeyEvent.VK_D){
            pemain.setKanan(true);
        }
        else if(e.getKeyCode()==KeyEvent.VK_W){
            pemain.setAtas(true);
        }
        else if(e.getKeyCode()==KeyEvent.VK_S){
            pemain.setBawah(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_A) {
            pemain.setKiri(false);
        }
        else if(e.getKeyCode()==KeyEvent.VK_D){
            pemain.setKanan(false);
        }
        else if(e.getKeyCode()==KeyEvent.VK_W){
            pemain.setAtas(false);
        }
        else if(e.getKeyCode()==KeyEvent.VK_S){
            pemain.setBawah(false);
        }
    }
}
