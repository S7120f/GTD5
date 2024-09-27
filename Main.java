import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public static void main(String[] args) {
    JPanel mainPanel = new JPanel();
    mainPanel.setPreferredSize(new Dimension(1000, 800));
    mainPanel.setBackground(Color.black);
    mainPanel.setLayout(null);
    mainPanel.add(new TodoPanel());
    mainPanel.add(new BottomRightPanel());
   
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.add(mainPanel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);  

}
