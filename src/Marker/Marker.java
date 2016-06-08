package Marker;


import GraphicalUI.GraphicalUI;
import Location.Category;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Marker extends JComponent {
    private GraphicalUI graphicalUI;

    public boolean isMarked() {
        return marked;
    }

    boolean marked = false;
    boolean marked2 = false;
    private Category category;

    private int [] xes = {0,25,50};
    private int [] yes = {0,50,0};

    public Marker (int x, int y, Category category){
        this.category = category;
        setLayout(null);
        setBounds(x,y,50,50);
        setPreferredSize(new Dimension(50,50));
        setMaximumSize(new Dimension(50,50));
        setMinimumSize(new Dimension(50,50));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                setMarked(!marked);
                setMarked2(!marked2);
            }
        });
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
        repaint();
    }

    public void setMarked2(boolean marked2) {
        this.marked2 = marked2;
        repaint();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Color color = Color.BLACK;
        switch (this.category) {
            case BUSS:
                color = Color.BLUE;
                break;
            case TÅG:
                color = Color.RED;
                break;
            case TUNNELBANA:
                color = Color.GREEN;
                break;
            case NONE:
                color = Color.BLACK;
                break;
        }
        g.setColor(color);
        g.fillPolygon(xes, yes, 3);
        if (marked) {
            g.setColor(Color.RED);
            g.drawRect(0, 0, 49, 49);

        }else if (marked2){
//            JPanel namedDescried = new JPanel();
//            JTextField namedDescribed = new JTextField(10);
            System.out.print("test");
//            namedDescribed =
        }
    }
}