import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BottomPanel extends JPanel implements FocusListener {
public BottomPanel() {
setBounds(0, 600, 800, 200);
setBackground(Color.YELLOW);
setLayout(new FlowLayout(FlowLayout.LEFT));

JTextField toDoTitle = new JTextField("Lägg till titel...", 15);  
toDoTitle.setPreferredSize(new Dimension(100, 30)); // adjust the size of the textfield
toDoTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));    // textfield border
toDoTitle.setFont(new Font("Arial", Font.BOLD, 15));    // The font settings

toDoTitle.addFocusListener(this);



JTextArea descriptionArea = new JTextArea("Lägg till text...", 5, 20);
descriptionArea.setPreferredSize(new Dimension(400, 150));  // adjust the size of the textarea
descriptionArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));  // textfield border
descriptionArea.setFont(new Font("Arial", Font.BOLD, 15));  // The font settings
descriptionArea.setLineWrap(true);      // makes the line of text stay within the textarea, so it is visible all the time
descriptionArea.setWrapStyleWord(true);     // makes the words "non-breakable" when the line of text is changing line

JButton addButton = new JButton("add ToDo");
addButton.setPreferredSize(new Dimension(150, 150));    // size of the button
addButton.setFont(new Font("Arial", Font.BOLD, 15));    // The font settings

add(toDoTitle);
add(descriptionArea);
add(addButton);


}

@Override
public void focusGained(FocusEvent e) {
    // TODO Auto-generated method stub
    
}

@Override
public void focusLost(FocusEvent e) {
    // TODO Auto-generated method stub
    
}



}
