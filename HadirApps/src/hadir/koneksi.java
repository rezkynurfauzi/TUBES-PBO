/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rezky
 */
public class koneksi {
    public static Connection myconnection() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/hadirapp","root","");
            return koneksi;
        }
        catch(Exception e){
        return null;
        }
    }
}
