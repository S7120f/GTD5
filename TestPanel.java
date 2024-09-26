import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TestPanel extends JPanel {
    public TestPanel() {
        setLayout(null);
        System.out.println("HejHej");
        Hejsan();
        JLabel text = new JLabel();
        text.setForeground(Color.BLUE);
        text.setOpaque(true);
        text.setBackground(Color.GREEN);
        
        text.setText("Hej igen!");
        
        text.setBounds(0, 0, 100, 100);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        add(text);
    }
    public void Hejsan() {
        System.out.println("Hejsan!");

    }
}
