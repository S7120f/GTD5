import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


public class RightPanel extends JPanel {

    public RightPanel() {

        setBounds(800,0,200,600);
        setBackground(Color.green);

        JPanel completedTask1 = new JPanel();
            JLabel label1 = new JLabel("Completed Task", JLabel.CENTER);
            JPanel completedTask2 = new JPanel();
            JLabel label2= new JLabel("Completed Task", JLabel.CENTER);
            JPanel completedTask3 = new JPanel();
            JLabel label3 = new JLabel("Completed Task", JLabel.CENTER);
            JPanel completedTask4 = new JPanel();
            JLabel label4 = new JLabel("Completed Task", JLabel.CENTER);
            JPanel completedTask5 = new JPanel();
            JLabel label5 = new JLabel("Completed Task", JLabel.CENTER);
    
            completedTask1.setLayout(new BorderLayout());
            completedTask2.setLayout(new BorderLayout());
            completedTask3.setLayout(new BorderLayout());
            completedTask4.setLayout(new BorderLayout());
            completedTask5.setLayout(new BorderLayout());
        
            completedTask1.setBackground(Color.red);
            completedTask2.setBackground(Color.red);
            completedTask3.setBackground(Color.red);
            completedTask4.setBackground(Color.red);
            completedTask5.setBackground(Color.red);
    
            completedTask1.setPreferredSize(new Dimension(150,20));
            completedTask2.setPreferredSize(new Dimension(150,20));
            completedTask3.setPreferredSize(new Dimension(150,20));
            completedTask4.setPreferredSize(new Dimension(150,20));
            completedTask5.setPreferredSize(new Dimension(150,20));
            
            completedTask1.add(label1);
            completedTask2.add(label2);
            completedTask3.add(label3);
            completedTask4.add(label4);
            completedTask5.add(label5);
    
            add(completedTask1, BorderLayout.CENTER);
            add(completedTask2, BorderLayout.CENTER);
            add(completedTask3, BorderLayout.CENTER);
            add(completedTask4, BorderLayout.CENTER);
            add(completedTask5, BorderLayout.CENTER);

    }   

 }    


