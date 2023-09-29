/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Administrator
 */
public class login  extends JFrame
{
    login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
         
         JLabel heading=new JLabel("Simple Minds");
         heading.setBounds(750,60,300,45);
         heading.setFont(new Font("Viner Hand ITC",Font.BOLD,45));
         heading.setForeground(new Color(30,144,254));
         add(heading);
         
         JLabel name=new JLabel("Enter Your Name ");
         name.setBounds(810,150,300,20);
         name.setFont(new Font("Mangolian Baiti",Font.BOLD,20));
         name.setForeground(new Color(30,144,254));
         add(name);
         
         JTextField tfname=new JTextField();
         tfname.setBounds(735,200,300,25);
         tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
         add(tfname);
         
         JButton rules= new JButton("Rules");
         rules.setBounds(735,270,120,25);
         rules.setBackground(new Color(30,144,254));
          rules.setForeground(Color.white);
         add(rules);
         
          JButton back= new JButton("Next");
         back.setBounds(745,270,120,25);
         back.setBackground(new Color(30,144,254));
          back.setForeground(Color.white);
         add(back);
         
                 
        
        setSize(1200,500);
        setVisible(true);
        setLocation(200,150);
        
        
        
    }
    public static void main(String[] args)
    {
        new login();
    }
    
}
