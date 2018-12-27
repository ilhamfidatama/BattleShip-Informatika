/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS R.O.G
 */
public class Database {
    private static final String url = "jdbc:mysql://localhost/Battleship";
    private static final String jdbc = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    
    private Connection koneksi;
    private Statement stat;
    private ResultSet rs;
    private boolean statusTambah;
    
    public Database(String nama, int point){ //untuk update data
        String sql="INSERT INTO pemain (nama, point) VALUES ('%s', %d)";
        sql=String.format(sql, nama, point);
        try {
            Class.forName("update BattleShip");
            koneksi = DriverManager.getConnection(url, user, password);
            stat = koneksi.createStatement();
            
            statusTambah = stat.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Database(String sql){ //untuk mengambil data
        try {
            Class.forName(jdbc);
            koneksi = DriverManager.getConnection(url, user, password);
            stat = koneksi.createStatement();
            
            rs = stat.executeQuery(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean getStatusTambah(){
        return statusTambah;
    }
    
    public ResultSet getRS(){
        return rs;
    }
    
    public void tutupDatabase(){
        try {
            stat.close();
            koneksi.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
