import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class BottomRightPanel extends JPanel {

    private JLabel activeTasksLabel;
    private JLabel completedTasksLabel;
    public int activeTasks = 0;
    public int completedTasks = 0;

    public BottomRightPanel() {
        setBounds(800, 600, 200, 200);
        setBackground(Color.blue);
        setLayout(null); // Ger mig möjlighet att förflytta mina JLabels i olika riktning.
        
        // JLabel för aktiva todoCards.
        activeTasksLabel = new JLabel("Active: " + activeTasks);
        activeTasksLabel.setForeground(Color.white);
        activeTasksLabel.setBounds(50, 50, 100, 30);
        add(activeTasksLabel);

        // JLabel för avklarade todoCards.
        completedTasksLabel = new JLabel("Completed: " + completedTasks);
        completedTasksLabel.setForeground(Color.white);
        completedTasksLabel.setBounds(50, 100, 100, 30);
        add(completedTasksLabel);
        
    }
}
