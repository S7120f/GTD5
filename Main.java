import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    //Declares the panel classes
    private static TodoPanel todoPanel;
    private static BottomRightPanel bottomRightPanel;
    private static RightPanel rightPanel;

    public static void main(String[] args) {
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1000, 800));
        mainPanel.setBackground(Color.black);
        mainPanel.setLayout(null);

        //Initializes all panel classes.
        bottomRightPanel = new BottomRightPanel();
        todoPanel = new TodoPanel();
        rightPanel = new RightPanel();

        mainPanel.add(new BottomPanel());
        mainPanel.add(todoPanel);
        mainPanel.add(bottomRightPanel);
        mainPanel.add(rightPanel);

        //Setting frame behaviors and values
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("DuckDuck ToDo");
        frame.add(mainPanel);
        frame.pack();
        frame.getContentPane().requestFocusInWindow(); //this thing right here gets the focus away from the JTextField in BottomPanel
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

    // A getter for the RightPanel object.
    // Call this by Main.getRightPanel()
    public static RightPanel getRightPanel() {
        return rightPanel;
    }

}

