/* Once upon a time, there was a hero and an old saint. And like in any story with a hero and an old saint, 
   the old saint asked the hero — three questions! But here's the twist: each question was a binary 
   question, which means that the answer to each must be either a 'Yes' or a 'No', not none, not both. 
   Our hero, who was not so wise in the ways of science, answered them arbitrarily and just hoped he is 
   correct. The old saint, being so old, does not remember which answers were correct. The only thing that
   he remembers is - how many of them were 'Yes', and how many of them were 'No'. Our hero will pass the 
   test if the old saint cannot distinguish his responses from the set of correct answers i.e. if the 
   number of 'Yes' and 'No' in the responses matches that in the correct answers, regardless of their 
   order.
   You are given the answers to each of the three questions, and the responses of the hero to the same. 
   Find whether the hero will be able to pass the old saint's test. */
   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Old_Saint{
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Input Comparison");
        
        // Creating JLabels
        JLabel label1 = new JLabel("Enter values for the first array:");
        JLabel label2 = new JLabel("Enter values for the second array:");
        
        // Creating JTextFields
        JTextField[] fields1 = new JTextField[3];
        JTextField[] fields2 = new JTextField[3];
        
        // Creating a JButton
        JButton button = new JButton("Compare");
        
        // Adding components to the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(label1);
        for (int i = 0; i < 3; i++) {
            fields1[i] = new JTextField(5);
            frame.add(fields1[i]);
        }
        frame.add(label2);
        for (int i = 0; i < 3; i++) {
            fields2[i] = new JTextField(5);
            frame.add(fields2[i]);
        }
        frame.add(button);
        
        // Adding ActionListener using lambda expression
        button.addActionListener(e -> {
            int count = 0;
            int target = 0;
            for (int i = 0; i < 3; i++) {
                int val1 = Integer.parseInt(fields1[i].getText());
                int val2 = Integer.parseInt(fields2[i].getText());
                if (val1 == 1) {
                    count++;
                }
                if (val2 == 1) {
                    target++;
                }
            }
            if (count == target) {
                JOptionPane.showMessageDialog(frame, "Pass");
            } else {
                JOptionPane.showMessageDialog(frame, "Fail");
            }
        });
        
        // Setting frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
