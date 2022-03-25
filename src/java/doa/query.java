
package doa;

import entity.Music;
import entity.user;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class query {
    Connection con;
    

    public query(Connection con) {
        this.con=con;
    }
    
    
    
    
   public ArrayList<String> carousel(){
ArrayList<String> img=new ArrayList();  
        try {
            PreparedStatement pst= con.prepareStatement("select * from carouselImage");
          ResultSet rst=  pst.executeQuery();
            while(rst.next()){
            img.add(rst.getString("img"));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
       
    }
   
   public ArrayList<Music> music(){
       ArrayList<Music> li = new ArrayList();
   PreparedStatement pst;
        try {
            pst = con.prepareStatement("select * from song where category='mp3'");
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
          String image = rst.getString("musicImage");
          String song = rst.getString("song");
          String mName = rst.getString("musicName");
          String artist =rst.getString("artist");
          
          Music m = new Music(mName, image, song,artist);
          li.add(m);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         return li;   
   }
   
   public ArrayList<Music> Vmusic(){
       ArrayList<Music> lis = new ArrayList();
   PreparedStatement pst;
        try {
            pst = con.prepareStatement("select * from song where category='mp4'");
       
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
          String image = rst.getString("musicImage");
          String song = rst.getString("song");
          String mName = rst.getString("musicName");
          String artist =rst.getString("artist");
          
          Music m = new Music(mName, image, song,artist);
          lis.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lis;   
   }
   
   public boolean getUser(String uname, String pass){
        try {
            PreparedStatement pst = con.prepareStatement("select * from user where username=? and password=?");
            pst.setString(1, uname);
            pst.setString(2, pass);
            ResultSet rst = pst.executeQuery();
            if(rst.next()){
            return true;
            }
           
                    } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
   }
   
   public ArrayList<Music> Smusic(String qu){
       ArrayList<Music> li = new ArrayList();
   PreparedStatement pst;
        try {
            pst = con.prepareStatement("select * from song where musicName=?");
            pst.setString(1, qu);
            ResultSet rst= pst.executeQuery();
            while(rst.next()){
          String image = rst.getString("musicImage");
          String song = rst.getString("song");
          String mName = rst.getString("musicName");
          String artist =rst.getString("artist");
          
          
          Music m = new Music(mName, image, song,artist);
          li.add(m);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         return li;   
   }
   

    
}
