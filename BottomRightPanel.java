import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;  // För att justera knappens marginer

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
        activeTasksLabel.setBounds(30, 30, 100, 30);
        add(activeTasksLabel);

        // Lägger till en minusknapp för aktiva toDos.
        JButton minusActiveButton = new JButton("-");
        minusActiveButton.setBounds(30, 70, 30, 20);
        minusActiveButton.setFont(new Font("Minus-aktiv", Font.PLAIN, 10));
        minusActiveButton.setMargin(new Insets(0, 0, 0, 0));  // Tar bort onödig padding
        add(minusActiveButton);

        // Lägger till en plusknapp för aktiva toDos.
        JButton plusActiveButton = new JButton("+");
        plusActiveButton.setBounds(70, 70, 30, 20);
        plusActiveButton.setFont(new Font("Minus-aktiv", Font.PLAIN, 10));
        plusActiveButton.setMargin(new Insets(0, 0, 0, 0));
        add(plusActiveButton);

        // JLabel för avklarade todoCards.
        completedTasksLabel = new JLabel("Completed: " + completedTasks);
        completedTasksLabel.setForeground(Color.white);
        completedTasksLabel.setBounds(30, 110, 100, 30);
        add(completedTasksLabel);

        // Lägger till en minusknapp för avklarade toDos.
        JButton minusCompletedButton = new JButton("-");
        minusCompletedButton.setBounds(30, 150, 30, 20);
        minusCompletedButton.setFont(new Font("Minus", Font.PLAIN, 10));
        minusCompletedButton.setMargin(new Insets(0, 0, 0, 0));
        add(minusCompletedButton);

        // Lägger till en plusknapp för avklarade toDos.
        JButton plusCompletedButton = new JButton("+");
        plusCompletedButton.setBounds(70, 150, 30, 20);
        plusCompletedButton.setFont(new Font("Plus", Font.PLAIN, 10));
        plusCompletedButton.setMargin(new Insets(0, 0, 0, 0));
        add(plusCompletedButton);


        //Lägga till aktionlisteners för plus och minus knappar.
    }
}