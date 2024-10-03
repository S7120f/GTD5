import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.KeyboardFocusManager;
public class Main {

    //Declares a global todopanel object.
    private static TodoPanel todoPanel;
    private static BottomRightPanel bottomRightPanel;
    private static RightPanel rightPanel; 


    public static void main(String[] args) {
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1000, 800));
        mainPanel.setBackground(Color.black);
        mainPanel.setLayout(null);

        //Initializes all panel objects.
        bottomRightPanel = new BottomRightPanel();
        todoPanel = new TodoPanel();
        rightPanel = new RightPanel(); // Initialize the right panel.

        mainPanel.add(new BottomPanel());
        mainPanel.add(todoPanel);
        mainPanel.add(bottomRightPanel);
        mainPanel.add(rightPanel); // Add the right panel to the main panel.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //frame.getContentPane().requestFocusInWindow();
        //KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
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

