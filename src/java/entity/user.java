/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author abc
 */
public class user {
    private String name;
    private String email;
    private String uname;
    private String pass;
   public user(String name , String email, String uname, String password) {
   this.name=name;
   this.email=email;
   this.uname=uname;
   this.pass=password;
   }
   
   public String getName(){
   return this.name;
   }
   
   public void setName(String name){
   this.name=name;
   }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
