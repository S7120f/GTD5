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
        setBackground(new Color(0x202D67));
        Border blackline = BorderFactory.createLineBorder(Color.black);
        setBorder(blackline);
    }

    // Add a new "Completed Task" panel
    public void addCompletedTask(String completedTask) {
        JPanel completedTaskPanel = createCompletedTaskPanel(completedTask);
        add(completedTaskPanel, BorderLayout.CENTER);
        updateCompletedTasks();
    }

    // Create a panel for each completed task
    private JPanel createCompletedTaskPanel(String completedTask) {
        JPanel taskPanel = new JPanel();
        taskPanel.setPreferredSize(new Dimension(180, 30));
        taskPanel.setBackground(Color.green);
        taskPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));

        JLabel taskLabel = new JLabel(completedTask);
        taskLabel.setFont(new Font("Helvetica neue", Font.PLAIN, 16));
        taskPanel.add(taskLabel);

        return taskPanel;
    }

    private void updateCompletedTasks() {
        int completedAmount = getComponentCount();
        Main.getBottomRightPanel().updateCompletedTasks(completedAmount);
    }
}
