package GraphicalUI;

import javafx.scene.input.MouseButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by SimonSchwieler on 2016-04-21.
 */
public class LocationInfo extends JPanel {
    private JPanel balk = new JPanel();
    private JTextArea text = new JTextArea();
    String name;
    String description;
    boolean marked = false;
    private int [] xes = {0,25,50};
    private int [] yes = {0,50,0};

    public LocationInfo(int x, int y, String name, String description) {
        this.name = name;
        this.description = description;

        setBounds(x, y, 75, 40);
        JLabel jlabel = new JLabel(name + " " + description);
        balk.add(jlabel);
        balk.setPreferredSize(new Dimension(75, 40));
        setLayout(new BorderLayout());
        add(balk, BorderLayout.NORTH);
        add(new JScrollPane(text), BorderLayout.CENTER);
        balk.setBackground(Color.WHITE);
        text.setBackground(Color.YELLOW);
        setVisible(true); // <-- hanterar om den syns inför utvikningen.


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (SwingUtilities.isRightMouseButton(e) || e.isControlDown()){

                    System.out.print("ja");
                    setMarked(!marked);
                    setVisible(true);
                }

            }
        });
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
        repaint();
    }







}