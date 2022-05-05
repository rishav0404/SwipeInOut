/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swipepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;
import java.sql.*;

/**
 *
 * @author risha
 */
public class FrontPage implements ActionListener {
     JFrame f;
    JLabel id,l1;
    JButton b;
    
    
    FrontPage()
    {
       f =  new JFrame("Swipe Page");
       f.setBackground(Color.RED);
       f.setLayout(null);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("swipepage/icons/front.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1200, 700,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       
       l1.setBounds(0,150,1360,530);
       f.add(l1);
       
       b = new JButton("Click Here to Continue");
       b.setBackground(Color.BLACK);
       b.setForeground(Color.WHITE);
       
       b.setBounds(500,600,300,70);
       //b.setLayout(null);
       b.addActionListener(this);
       
       id = new JLabel();
       id.setBounds(0,0,1360,750);
       id.setLayout(null);
       
       JLabel lid = new JLabel("TATA CONSULTANCY SERVICES");
       lid.setBounds(80,30,1500,100);
       lid.setFont(new Font("serif",Font.PLAIN,70));
       lid.setForeground(Color.BLUE);
       id.add(lid);
       
       id.add(b);
       f.add(id);
       
       f.getContentPane().setBackground(Color.WHITE);
       
       f.setVisible(true); // to show the frame it's true
       f.setSize(1360,750);
       f.setLocation(100,100);
       
       
       
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b){
            f.setVisible(false); // to hide the current page add goto button
            new login().f.setVisible(true);
        }
    }
    public static void main(String args[])
    {
        FrontPage f = new FrontPage();
    }
}
