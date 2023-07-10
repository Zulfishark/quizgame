package project.brainstorm;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;



public class Login extends JFrame{
    //constructor
    Login() {
        ImageIcon F1 = new ImageIcon(ClassLoader.getSystemResource("images/OIP.jpg"));
        JLabel image = new JLabel (F1);
        image.setBounds(0,0,600,500);
        add(image);//placeimageintoframe
        
        JLabel heading = new JLabel("Storm Your Brain");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Mongolian Balti",Font.BOLD,30));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,200,20);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        name.setForeground(Color.red);
        add(name);
        
        JTextField pname = new JTextField();
        pname.setFont(new Font("Times New Roman",Font.BOLD,20));
        pname.setBounds(735,200,300,25);
        add(pname);
        
        JButton rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.blue);
        add(rules);
        
        JButton back = new JButton("Back");
        back.setBounds(315,270,120,25);
        //back.setBackground(new Color(30,144,254));
        back.setForeground(Color.blue);
        add(back);

        
        
        getContentPane().setBackground(Color.cyan);
        setSize(1200,400);
        setLocation(200,200);
        setVisible(true);
    }
    
    public static void main (String[] args){
       new Login();
        
    }
    
    
}
