package Dialogues;

/**
 * Created by SimonSchwieler on 2016-04-15.
 */

import javax.swing.*;

public class NamedPlaceDialogue extends JPanel {

    private JTextField nameInput;

    public NamedPlaceDialogue() {

        JLabel name = new JLabel("Name:");
        add(name);

        nameInput = new JTextField(10);
        add(nameInput);

    }

    public String getNameInput() {

        return nameInput.getText();

    }

}
