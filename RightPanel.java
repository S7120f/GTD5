import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class RightPanel extends JPanel {

    public RightPanel() {
        setBounds(800, 0, 200, 600);
        setBackground(new Color (0x202D67));
        Border blackline = BorderFactory.createLineBorder(Color.black);
        setBorder(blackline);

    }

    // Create a method addCompletedTask that adds new "Completed Task" panel.
    public void addCompletedTask(String completedTask) {
        JPanel completedTaskPanel = new JPanel(); // Create a new JPanel called completedTask
        completedTaskPanel.setBackground(Color.GREEN); // Set the background color of the panel to red
        completedTaskPanel.setPreferredSize(new Dimension(180, 30)); // Set the preferred size of the panel to 150x20
        completedTaskPanel.setBorder(new BevelBorder(BevelBorder.RAISED)); // Set the border of the panel to a raised bevel border
        completedTaskPanel.setBorder(new BevelBorder(BevelBorder.LOWERED)); // Set the border of the panel to a lowered bevel border
        

        JLabel completedLabel = new JLabel(completedTask); // Create a new JLabel called completedLabel
        completedTaskPanel.add(completedLabel); // Add the completedLabel to the completedTask panel
        add(completedTaskPanel, BorderLayout.CENTER); // Add the completedTask panel to the RightPanel at the top center
        completedLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
    }
}
