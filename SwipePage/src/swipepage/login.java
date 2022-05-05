/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swipepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.lang.Thread;
import java.sql.*;

 public class login implements ActionListener {
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    login()
    {
      f= new JFrame("Login"); // frame is by deafult false you have to open it.
      
      f.setBackground(Color.WHITE);
      f.setLayout(null);
      
      l1 = new JLabel("Username");
      l1.setBounds(40,20,100,30);
      f.add(l1);
      
      t1 = new JTextField();
      t1.setBounds(150,20,150,30);
      f.add(t1);
      
      l2 = new JLabel("Password");
      l2.setBounds(40,70,100,30);
      f.add(l2);
      
      t2 = new JPasswordField();
      t2.setBounds(150,70,150,30);
      f.add(t2);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("swipepage/icons/login.jpg"));
      Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel l3 = new JLabel(i3);
      //l3.setBackground(Color.WHITE);
      l3.setBounds(350,20,150,150);
      f.add(l3);
      
      
      b1 = new JButton("Login");
      b1.setBounds(40,140,120,30);
      b1.setFont(new Font("Serif",Font.BOLD,15));
      b1.addActionListener(this);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      f.add(b1);
      
      b2 = new JButton("Login");
      b2.setBounds(40,140,120,30);
      b2.setFont(new Font("Serif",Font.BOLD,15));
      b2.addActionListener(this);
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      f.add(b2);
      
      
      f.getContentPane().setBackground(Color.WHITE);
      
      f.setVisible(true);
      f.setSize(600,300);
      f.setLocation(300,300);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            Conn c = new Conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String str = "select * from login where username = '"+u+"' and password = '"+v+"'";
            
            ResultSet rs = c.s.executeQuery(str);
            if(rs.next()){
                new detalis().f.setVisible(true);
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Login");
                f.setVisible(false);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        new login();
    }
}
