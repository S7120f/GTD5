import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class RightPanel extends JPanel {

    public RightPanel() {

        setBounds(800, 0, 200, 600);
        setBackground(Color.green);

    }

    // Create a method addCompletedTask that adds new "Completed Task" panel.
    public void addCompletedTask(String completedTask) {

        JPanel completedTaskPanel = new JPanel(); // Create a new JPanel called completedTask
        completedTaskPanel.setBackground(Color.red); // Set the background color of the panel to red
        completedTaskPanel.setPreferredSize(new Dimension(150, 20)); // Set the preferred size of the panel to 150x20

        JLabel completedLabel = new JLabel(completedTask); // Create a new JLabel called completedLabel
        completedTaskPanel.add(completedLabel); // Add the completedLabel to the completedTask panel
        add(completedTaskPanel, BorderLayout.CENTER); // Add the completedTask panel to the RightPanel at the top center

    }

}
