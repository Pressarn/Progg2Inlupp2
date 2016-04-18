package Dialogues;

/**
 * Created by SimonSchwieler on 2016-04-15.
 */

import javax.swing.*;



public class DescribedPlaceDialogue extends NamedPlaceDialogue {

    JTextField descriptionInput;

    public DescribedPlaceDialogue() {

        JLabel description = new JLabel("Description:");
        add(description);

        descriptionInput = new JTextField(10);
        add(descriptionInput);

    }

    public String getDescriptionInput() {

        return descriptionInput.getText();

    }

}
