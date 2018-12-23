/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ASUS R.O.G
 */
public class PapanGame extends JFrame{
    private Container konten;
    
    //membuat JButton seperti matriks yang memiliki ukuran 10x10
    private JButton[][] papan = new JButton[10][10];
    
    public PapanGame(){
        konten = getContentPane();
        konten.setLayout(new GridLayout(10,10));
//        ButtonHandler kontrol = new ButtonHandler();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                papan[i][j] = new JButton();
                konten.add(papan[i][j]);
                papan[i][j].setBackground(Color.white);
            }
        }
    }
    
}
