import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setBackground(Color.lightGray);
    frame.setLayout(null);


    TestPanel testPanel = new TestPanel();
    testPanel.setBounds(50, 10, 100, 100);
    

    JButton button = new JButton();
    // button.setLocation(0, 0);
    // button.setPreferredSize(new Dimension(50, 50));
    button.setBounds(new Rectangle(0, 10, 50, 50));

    JPanel panel = new JPanel();
    panel.setBackground(Color.MAGENTA);
    panel.setLayout(null);
    /* panel.setSize(100, 100); */
    // panel.setPreferredSize(new Dimension(100, 100));
    panel.setBounds(new Rectangle(0, 600, 800, 200));
    // panel.setLocation(400, 400);
    /* panel.add(new JButton("Hejhej")); */
    panel.add(button);
    panel.add(testPanel);
    frame.add(panel);

    // frame.pack();

    frame.setVisible(true);
}
