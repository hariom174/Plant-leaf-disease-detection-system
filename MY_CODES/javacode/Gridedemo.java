                    /*Java program to illustrate the GrideLayout. */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gridedemo {
        public static void main(String[]args)//Main method
    {
        // Creating object of JFrame class
        // With new name frame
        JFrame frame=new JFrame("GrideLayout Demo");

        // Intililization of object 
        // *btn1* of JButton class.
        JButton btn1=new JButton("Button 1");
        JButton btn2=new JButton("Button 2");
        JButton btn3=new JButton("Buttom 3");
        JButton btn4=new JButton("Button 4");
        JButton btn5=new JButton("Button 5");

        // Creating Object Palne of Jpanel class.
        // Create gride layout with 3 rows.
        // 2 columns with horizontal rows.
        // vertical gap set to 10
        JPanel panel=new JPanel();

        // Addition JButton "btn2" on JPalne
        panel.add(btn1);
 
    }
}
