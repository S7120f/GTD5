import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TodoPanel extends JPanel {


    private final int
            CARD_SIZE_W = 370,
            CARD_SIZE_H = 100,
            CARD_OFFSET_W = 20,
            CARD_OFFSET_H = 30;

    private Border lightBlueBorder, raisedbevel;
    private Font titleFont;

    public TodoPanel() {
        setBounds(0, 0, 800, 600);
        setBackground(new Color(0x202D67));
        setLayout(null);

        // Setting color to a border
        lightBlueBorder = BorderFactory.createLineBorder(new Color(0x7993FF));
        raisedbevel = BorderFactory.createRaisedBevelBorder();

        //Create the font of the title here, since it will be used in two methods.
        titleFont = new Font("Helvetica Neue", Font.PLAIN, 20);

        //These are just temporary
        createNewCard("Detta är något", "Ska göra någasd asd asd asd asd as adsasda adasdasd asda a dads d ao asd asd asd asd asd asd ast");
        createNewCard("Detta är något anant", "Ska göra något annat");
        createNewCard("Också något", "Detta ska också göras");
        createNewCard("Även detta", "Även detta ska göras, ");


    }


    private int getAmountOfPanels() {
        int amountOfPanels = 0;
        for (Component c : getComponents())
            if (c instanceof JPanel)
                amountOfPanels++;
        return amountOfPanels;
    }

    //Call this method to add a new todocard in this panel.
    public void createNewCard(String title, String description) {


        // Creates a panel to hold all components in the card.
        JPanel panelCard = getjPanel();

        // Add all components on the card panel.
        // Create and add Card TitleText
        panelCard.add(addTitleText(title));

        // Creates and adds a small line under the title that matches the width of the title string.
        panelCard.add(getTitleSeparator(title));

        // Create and add Card Description
        panelCard.add(addTextArea(description));

        // Create and add Completed button
        panelCard.add(addCompletedButton(title, panelCard));

        // Create and add Delete button
        panelCard.add(addDeleteButton(title, panelCard));

        // Add card panel to the class panel
        add(panelCard);

        // Adds active amount when added card.
        // int activeAmount = getComponentCount();
        // Main.getBottomRightPanel().updateActiveTasks(activeAmount);
    }


    private JPanel getjPanel() {
        int rowIndex = getAmountOfPanels() % 2;
        int colIndex = getAmountOfPanels() / 2;
        int x = calcTodoPanelXPosition(rowIndex);
        int y = calcTodoPanelYPosition(colIndex);

        // Create panel for holding all parts
        JPanel panelCard = new JPanel();
        panelCard.setBackground(new Color(0x0B1130));
        panelCard.setBorder(lightBlueBorder);
        panelCard.setBounds(x, y, CARD_SIZE_W, CARD_SIZE_H);

        // Will set layout false if bounds will be used on the panel.
        panelCard.setLayout(null);
        return panelCard;
    }

    private JTextArea addTextArea(String description) {
        JTextArea textArea = new JTextArea(1, 1);
        textArea.setBounds(5, 38, 300, 55);
        textArea.setOpaque(false);
        textArea.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        textArea.setForeground(Color.WHITE);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(description);

        // Setting focusable to false, so we don't get
        // the weird box over the text in the components.
        textArea.setFocusable(false);

        return textArea;
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
                int x = calcTodoPanelXPosition(i % 2);
                int y = calcTodoPanelYPosition(i / 2);
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

    private JSeparator getTitleSeparator(String title) {
        JSeparator separator = new JSeparator();

        //Creates information about the font, so we can get the size of the font in width.
        FontMetrics metrics = new FontMetrics(titleFont) {
        };
        Rectangle2D bounds = metrics.getStringBounds(title, null);

        int widthInPixels = (int) bounds.getWidth();
        separator.setBounds(3, 33, widthInPixels + 5, 3);
        separator.setBackground(Color.BLACK);
        separator.setOpaque(true);
        return separator;
    }

    private JLabel addTitleText(String title) {
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(titleFont);
        titleLabel.setBounds(5, 5, 300, 25);
        titleLabel.setForeground(Color.WHITE);
        return titleLabel;
    }

    // TODO: Merge button methods?
    private JButton addDeleteButton(String title, JPanel panelCard) {
        JButton buttonDelete = new JButton();
        buttonDelete.setBounds(345, 5, 20, 20);
        buttonDelete.setBackground(Color.GREEN);
        buttonDelete.setMargin(new Insets(0, 0, 0, 0));
        buttonDelete.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        buttonDelete.setText("X");
        buttonDelete.setBorder(raisedbevel);
        buttonDelete.setBackground(Color.RED);
        buttonDelete.setFocusable(false);
        buttonDelete.addActionListener(_ -> {
            System.out.println("Deleted: " + title + "!");
            removeCard(panelCard);
            updateActiveTasks();
        });
        return buttonDelete;
    }

    private JButton addCompletedButton(String title, JPanel panelCard) {
        JButton buttonCompleted = new JButton();

        buttonCompleted.setBounds(310, 65, 55, 30);
        buttonCompleted.setBackground(Color.GREEN);
        buttonCompleted.setMargin(new Insets(0, 0, 0, 0));
        buttonCompleted.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        buttonCompleted.setText("Klar");
        buttonCompleted.setBorder(raisedbevel);
        buttonCompleted.setFocusable(false);
        buttonCompleted.addActionListener(_ -> {
            System.out.println("Completed: " + title + "!");
            Main.getRightPanel().addCompletedTask(title);
            removeCard(panelCard);
            updateActiveTasks();
            // Main.getBottomRightPanel().updateCompletedTasks(0);
        });
        return buttonCompleted;
    }

    private void updateActiveTasks() {
        int activeAmount = getComponentCount();
        Main.getBottomRightPanel().updateActiveTasks(activeAmount);
    }

}
