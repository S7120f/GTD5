import javax.swing.*;

import java.awt.*;

public class BottomRightPanel extends JPanel {

    private JLabel activeTasksLabel;
    private JLabel completedTasksLabel;
    public int activeTasks = 0;
    public int completedTasks = 0;

    // JButton minusActiveButton, plusActiveButton, minusCompletedButton, plusCompletedButton;

    public BottomRightPanel() {
        setBounds(800, 600, 200, 200);
        setBackground(Color.blue);
        setLayout(null); 


        // JLabel för aktiva todoCards.
        activeTasksLabel = new JLabel("Active: " + activeTasks);
        activeTasksLabel.setForeground(Color.white);
        activeTasksLabel.setBounds(30, 30, 100, 30);
        add(activeTasksLabel);

        // Lägger till en minusknapp för aktiva toDos.
        // minusActiveButton = new JButton("-");
        // minusActiveButton.setBounds(30, 70, 30, 20);
        // minusActiveButton.setFont(new Font("Minus-aktiv", Font.PLAIN, 10));
        // minusActiveButton.setMargin(new Insets(0, 0, 0, 0)); 
        // minusActiveButton.addActionListener(e -> {
        //     if (activeTasks > 0) {
        //         activeTasks--;
        //         activeTasksLabel.setText("Active: " + activeTasks);
        //     }
        // });
        // add(minusActiveButton);

        // Lägger till en plusknapp för aktiva toDos.
        // plusActiveButton = new JButton("+");
        // plusActiveButton.setBounds(70, 70, 30, 20);
        // plusActiveButton.setFont(new Font("Plus-aktiv", Font.PLAIN, 10));
        // plusActiveButton.setMargin(new Insets(0, 0, 0, 0));
        // plusActiveButton.addActionListener(e -> {
        //     activeTasks++;
        //     activeTasksLabel.setText("Active: " + activeTasks);
        // });
        // add(plusActiveButton);

        // JLabel för avklarade todoCards.
        completedTasksLabel = new JLabel("Completed: " + completedTasks);
        completedTasksLabel.setForeground(Color.white);
        completedTasksLabel.setBounds(30, 110, 100, 30);
        add(completedTasksLabel);

        // Lägger till en minusknapp för avklarade toDos.
        // minusCompletedButton = new JButton("-");
        // minusCompletedButton.setBounds(30, 150, 30, 20);
        // minusCompletedButton.setFont(new Font("Minus", Font.PLAIN, 10));
        // minusCompletedButton.setMargin(new Insets(0, 0, 0, 0));
        // minusCompletedButton.addActionListener(e -> {
        //     if (completedTasks > 0) {
        //         completedTasks--;
        //         completedTasksLabel.setText("Completed: " + completedTasks);
        //     }
        // });
        // add(minusCompletedButton);

        // Lägger till en plusknapp för avklarade toDos.
        // plusCompletedButton = new JButton("+");
        // plusCompletedButton.setBounds(70, 150, 30, 20);
        // plusCompletedButton.setFont(new Font("Plus", Font.PLAIN, 10));
        // plusCompletedButton.setMargin(new Insets(0, 0, 0, 0));
        // plusCompletedButton.addActionListener(e -> {
        //     completedTasks++;
        //     completedTasksLabel.setText("Completed: " + completedTasks);
        // });
        // add(plusCompletedButton);

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