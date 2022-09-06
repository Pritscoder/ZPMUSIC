/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionProvider {
    
    private static Connection con;
    public static Connection getConnection(){
        if(con==null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("node99270-music.cloudjiffy.net","root","OMIepr12926");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
        
                
        }
    return con;
    }
    
}
