package GraphicalUI;

import javax.swing.*;
import java.awt.*;

public class GraphicalUI extends JFrame {

    String [] category = {"Bus", "Train               ", "Subway"};
    JList <String> categories = new JList<> (category);
    private ImagePanel ip;
    private Listener listener = new Listener(this);


    public GraphicalUI() {
        super("Register");


        JMenuBar mb = new JMenuBar();
        JMenu iMen = new JMenu ("Archive");
        setJMenuBar(mb);
        mb.add(iMen);
        JMenuItem newMap = new JMenuItem ("New Map");
        iMen.add(newMap);
        newMap.addActionListener(listener.getOpenListener());
        JMenuItem loadPlaces = new JMenuItem ("Load Places");
        iMen.add(loadPlaces);
        JMenuItem save = new JMenuItem ("Save");
        iMen.add(save);
        JMenuItem exit = new JMenuItem ("Exit");
        iMen.add(exit);
        exit.addActionListener(listener.getExitListener());

        setLayout(new BorderLayout());
        JLabel labelTop = new JLabel("Top", SwingConstants.CENTER);
        add(labelTop, BorderLayout.NORTH);



        JPanel east = new JPanel();
        east.setLayout(new BorderLayout());
        JLabel labelSort = new JLabel();

        JPanel eastside = new JPanel();
        eastside.setLayout(new BoxLayout(eastside, BoxLayout.Y_AXIS));
        east.add(eastside, BorderLayout.EAST);

        JLabel kategorier = new JLabel("Categories        ");
        eastside.add(kategorier);
        kategorier.setAlignmentX(RIGHT_ALIGNMENT);


        categories.setMinimumSize(new Dimension(150,450));
        categories.setAlignmentX(RIGHT_ALIGNMENT);
        eastside.add(categories);
        categories.addListSelectionListener(listener.getCategoryListener());



        JButton hideCategoryButton = new JButton("Hide category");
        hideCategoryButton.setAlignmentX(RIGHT_ALIGNMENT);
        eastside.add(hideCategoryButton);


        eastside.setMinimumSize(new Dimension (150, 450));

        add(eastside, BorderLayout.EAST);

        JPanel north = new JPanel();
        String[] choice = {"", "Named", "Described"};
        JComboBox<String> comboChoice = new JComboBox<String>(choice);
        north.add(new JLabel("New:"));
        north.add(comboChoice);
        comboChoice.addActionListener(listener.getButtonPressed());


        JTextField write = new JTextField("Search", 10);
        north.add(write);

        JButton searchButton = new JButton ("Search");
        north.add(searchButton);

        JButton hideButton = new JButton("Hide");
        north.add(hideButton);
        hideButton.addActionListener(listener.getHideListener());


        JButton removeButton = new JButton ("Remove");
        north.add(removeButton);

        JButton whatButton = new JButton("What is here?");
        north.add(whatButton);




        add(north, BorderLayout.NORTH);


        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public String getJList(){
        return categories.getSelectedValue();
    }

    public class Visa extends JFrame {

    }
    public boolean getIsSelected(){
        return categories.isSelectionEmpty();

    }




    public static void main(String[] args) {
        GraphicalUI window = new GraphicalUI();
    }
}

