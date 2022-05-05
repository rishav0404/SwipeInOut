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
public class detalis implements ActionListener  {
  JButton j1,j2;
  JLabel l1,l2;
  JFrame f;

detalis()
{
    f = new JFrame("Swipe");
    f.setBackground(Color.WHITE);
    f.setLayout(null);
    
    l1 = new JLabel();
    l1.setBounds(0,0,700,500);
    l1.setLayout(null);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("swipepage/icons/tcs.jpg"));
    Image i2 = i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    l1.setIcon(i3);
    f.add(l1);
    
     //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("swipepage/icons/tcs.jpg"));
     //Image i2 = i1.getImage().getScaledInstance(260, 240,Image.SCALE_DEFAULT);
     //ImageIcon i3 = new ImageIcon(i2);
     //JLabel l1 = new JLabel(i3);
       
     //l1.setBounds(0,150,1360,530);
     //f.add(l1);
    
    
    
    
    j1 = new JButton("Swipe in");
    j1.setBackground(Color.WHITE);
    j1.setForeground(Color.black);
    j1.setBounds(10,80,150,45);
    j1.setFont(new Font("Serif",Font.BOLD,15));
    j1.addActionListener(this);
    l1.add(j1);
    
    j2 = new JButton("Swipe Out");
    j2.setBackground(Color.WHITE);
    j2.setForeground(Color.BLACK);
    j2.setBounds(480,300,150,45);
    j2.setFont(new Font("Serif",Font.BOLD,13));
    j2.addActionListener(this);
    l1.add(j2);
    
    
    
    
    
    f.setVisible(true);
    f.setLocation(450,180);
    f.setSize(700,500);
}

public void actionPerformed(ActionEvent ae){
   if(ae.getSource() == j1){
       f.setVisible(false);
       new SwipeIn_Emp();  
    }
    if(ae.getSource()  == j2)
    {
       f.setVisible(false);
        new SwipeOut_Emp();
    }
}
public static void main(String args[])
{
    detalis d= new detalis();
}
}
