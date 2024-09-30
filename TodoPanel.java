import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TodoPanel extends JPanel {


    private final int
            CARD_SIZE_W = 220,
            CARD_SIZE_H = 100,
            CARD_OFFSET_W = 35,
            CARD_OFFSET_H = 30;

    public TodoPanel() {
        setBounds(0, 0, 800, 600);
        setBackground(new Color(0xF619CD));
        setLayout(null);

        createNewCard("Detta är något", "Ska göra något");
        createNewCard("Detta är något anant", "Ska göra något annat");
        createNewCard("Också något", "Detta ska också göras");
        createNewCard("Även detta", "Även detta ska göras, ");

    }

    public void createNewCard(String title, String description) {
        int rowIndex = getComponents().length % 3;
        int colIndex = getComponents().length / 3;
        int x = calcTodoPanelXPosition(rowIndex);
        int y = calcTodoPanelYPosition(colIndex);


        // Create panel for holding all parts
        JPanel panelCard = new JPanel();
        panelCard.setBackground(Color.blue);
        panelCard.setBounds(x, y, CARD_SIZE_W, CARD_SIZE_H);

        // Will set layout false if bounds will be used on the panel.
        // panelCard.setLayout(null);

        // Add all components on the card panel.
        // Create and add Card TitleText
        panelCard.add(addLabelWithText(title, 25));

        // Create and add Card Description
        panelCard.add(addLabelWithText(description, 20));

        // Create and add Completed button
        panelCard.add(addCompletedButton(title, panelCard));

        // Create and add Delete button
        panelCard.add(addDeleteButton(title, panelCard));

        // Add card panel to the class panel
        add(panelCard);
    }

    private void removeCard(JPanel panelCard) {
        remove(panelCard);
        restructureCards();
    }


    //TODO: Kinda just need to calc pos of all the cards AFTER the removed/completed one.
    // No need to calc for the ones before since they wont move regardless of index.
    // Or just take the pos of the one in front of each. Since all will be moved back one pos.
    private void restructureCards() {
        if (getComponents().length > 0)
            for (int i = 0; i < getComponents().length; i++) {
                int x = calcTodoPanelXPosition(i % 3);
                int y = calcTodoPanelYPosition(i / 3);
                getComponent(i).setLocation(x, y);
            }

        repaint();
    }

    private int calcTodoPanelXPosition(int rowIndex) {
        return CARD_OFFSET_W + rowIndex * (CARD_SIZE_W + CARD_OFFSET_W);
    }

    private int calcTodoPanelYPosition(int colIndex) {
        return CARD_OFFSET_H + colIndex * (CARD_SIZE_H + CARD_OFFSET_H);
    }

    // TODO add bounds
    private JLabel addLabelWithText(String text, int size) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, size));
        return label;
    }

    // TODO: Merge button methods?
    private JButton addDeleteButton(String title, JPanel panelCard) {
        JButton buttonDelete = new JButton();
        buttonDelete.setBackground(Color.RED);
        buttonDelete.addActionListener(_ -> {
            System.out.println("Deleted: " + title + "!");
            removeCard(panelCard);
            // Replace this line with a call to the bottomright panel to update active cards list. Use size of todoCards
        });
        return buttonDelete;
    }

    private JButton addCompletedButton(String title, JPanel panelCard) {
        JButton buttonCompleted = new JButton();
        buttonCompleted.setBackground(Color.GREEN);
        buttonCompleted.addActionListener(_ -> {
            System.out.println("Completed: " + title + "!");
            // Replace this line with a call to the completed list
            removeCard(panelCard);
            // Replace this line with a call to the bottomright panel to update active cards list. Use size of todoCards
        });
        return buttonCompleted;
    }

}
