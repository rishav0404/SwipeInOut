/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swipepage;

import java.sql.*;


public class Conn {
    public Connection c; // setup connection between java and mysql
    public Statement s;  // query in mysql is executed through this
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///swipepage","root","");
            s = c.createStatement();   
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
