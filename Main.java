import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    //Declares a global todopanel object.
    private static TodoPanel todoPanel;
    private static BottomRightPanel bottomRightPanel;


    public static void main(String[] args) {
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1000, 800));
        mainPanel.setBackground(Color.black);
        mainPanel.setLayout(null);

        //Initializes all panel objects.
        todoPanel = new TodoPanel();
        bottomRightPanel = new BottomRightPanel();

        mainPanel.add(new BottomPanel());
        mainPanel.add(todoPanel);
        mainPanel.add(bottomRightPanel);
        mainPanel.add(new RightPanel());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    // A getter for the todopanel object.
    // Call this by Main.getTodoPanel()
    public static TodoPanel getTodoPanel() {
        return todoPanel;
    }

    // A getter for the bottomRightPanel object.
    // Call this by Main.getBottomRightPanel()
    public static BottomRightPanel getBottomRightPanel() {
        return bottomRightPanel;
    }

}

