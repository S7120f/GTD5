import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BottomPanel extends JPanel {

JTextField toDoTitle;
JTextArea descriptionArea;     
JButton addButton;

public BottomPanel() {

    setBounds(0, 600, 800, 200);
    setBackground(new Color(0x7993FF));
    //setLayout(new FlowLayout(FlowLayout.LEFT));
    setLayout(null);

    add(initTitle());
    add(initDesc());
    add(button());

    }

private JTextField initTitle() {
    toDoTitle = new JTextField("Lägg till titel...", 15);  
    toDoTitle.setBounds(10,10,170,30);
    // toDoTitle.setPreferredSize(new Dimension(100, 30)); // adjust the size of the textfield
    toDoTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));    // textfield border
    toDoTitle.setFont(new Font("Arial", Font.BOLD, 15));    // The font settings
    toDoTitle.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent event) {
            if (toDoTitle.getText().equals("Lägg till titel...")) {
                toDoTitle.setText("");
            }
        }
        @Override
        public void focusLost(FocusEvent event) {
            if (toDoTitle.getText().equals("")) {
                toDoTitle.setText("Lägg till titel...");
            }   
        }
    });
    return toDoTitle;
}

private JTextArea initDesc() {
    descriptionArea = new JTextArea("Lägg till text...");
    descriptionArea.setBounds(200, 10, 400, 150);
    //descriptionArea.setPreferredSize(new Dimension(400, 150));  // adjust the size of the textarea
    descriptionArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));  // textfield border
    descriptionArea.setFont(new Font("Arial", Font.BOLD, 15));  // The font settings
    descriptionArea.setLineWrap(true);      // makes the line of text stay within the textarea, so it is visible all the time
    descriptionArea.setWrapStyleWord(true);     // makes the words "non-breakable" when the line of text is changing line
    descriptionArea.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent event) {
            if (descriptionArea.getText().equals("Lägg till text...")) {
                descriptionArea.setText("");
            }
        }
        @Override
        public void focusLost(FocusEvent event) {
            if (descriptionArea.getText().equals("")) {
                descriptionArea.setText("Lägg till text...");
            }   
        }
    });
    return descriptionArea;
}

private void resetText() {
    toDoTitle.setText("Lägg till titel...");
    descriptionArea.setText("Lägg till text...");
}

private JButton button() {
    addButton = new JButton("add ToDo");
    addButton.setMargin(new Insets(0, 0, 0, 0));
    addButton.setBounds(610,10,150,150);
    
    // addButton.setPreferredSize(new Dimension(150, 150));    // size of the button
    addButton.setFont(new Font("Arial", Font.BOLD, 15));    // The font settings
    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e ) {
            
            String title = toDoTitle.getText();
            String description = descriptionArea.getText();
            
            Main.getTodoPanel().createNewCard(title,description);
            resetText();
        }

        
    });
    return addButton;
}

}
