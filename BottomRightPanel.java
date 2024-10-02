import javax.swing.*;

import java.awt.*;

public class BottomRightPanel extends JPanel {

    private JLabel activeTasksLabel;
    private JLabel completedTasksLabel;
    public int activeTasks = 0;
    public int completedTasks = 0;

    public BottomRightPanel() {
        setBounds(800, 600, 200, 200);
        setBackground(new Color(0x0C1953));
        setLayout(null); 
        setBorder(BorderFactory.createLineBorder(new Color(0x7993FF), 2));


        // JLabel för aktiva todoCards.
        activeTasksLabel = new JLabel("Active: " + activeTasks);
        activeTasksLabel.setForeground(Color.white);
        activeTasksLabel.setBounds(50, 50, 150, 30);
        add(activeTasksLabel);

        // JLabel för avklarade todoCards.
        completedTasksLabel = new JLabel("Completed: " + completedTasks);
        completedTasksLabel.setForeground(Color.white);
        completedTasksLabel.setBounds(50, 100, 150, 30);
        add(completedTasksLabel);

    }
    public void updateActiveTasks(int activeTasks) {
        this.activeTasks = activeTasks;
        activeTasksLabel.setText("Active: " + activeTasks);
    }

    public void updateCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
        completedTasksLabel.setText("Completed: " + completedTasks);
    }

}