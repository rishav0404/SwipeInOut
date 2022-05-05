/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swipepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwipeOut_Emp implements ActionListener{
    
    JLabel l1,l2,l3,l4;
    JFrame f;
    JTextField t1,t2;
    JButton b1;
    SwipeOut_Emp(){
        
        f = new JFrame("Swipe In");
        f.setLayout(null);
        f.setBackground(Color.WHITE);
        
        
        
        l1 = new JLabel("Employee Details");
        l1.setBounds(200, 10, 350, 60);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        f.add(l1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("swipepage/icons/office.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,600,400);
        f.add(l3);
        
        l2 = new JLabel("Employee_ID");
        l2.setBounds(50, 100, 200, 80);
        l2.setFont(new Font("Serif",Font.BOLD,20));
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.BLACK);
        l3.add(l2);
        
        l4 = new JLabel("TimeOut");
        l4.setBounds(50, 150, 200, 80);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setBackground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        l3.add(l4);
        
        t1 = new JTextField();
        t1.setBounds(250, 120, 120, 30);
        t1.setBackground(Color.WHITE);
        l3.add(t1);
        
        t2 = new JTextField();
        t2.setBounds(250, 160, 150, 30);
        t2.setBackground(Color.WHITE);
        l3.add(t2);
        
        b1 = new JButton("Swipe Out");
        b1.setBounds(120, 220, 180, 30);
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);
        
        
        
        f.setVisible(true);
        f.setSize(600,400);
        f.setLocation(400,150);
    }
    
    public void actionPerformed(ActionEvent ae){
        String a = t1.getText();
        String b = t2.getText();
        
        if(ae.getSource() == b1)
        {
            try{
                Conn c = new Conn();
                String str = "insert into swipeout values('"+a+"','"+b+"')";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Added Successfully");
                f.setVisible(false);
                new detalis();
            }catch(Exception e){
                System.out.println("The error is: "+e);
            }
        }
    }
    
    public static void main(String args[])
    {
        SwipeOut_Emp ss = new SwipeOut_Emp();
    }
}
