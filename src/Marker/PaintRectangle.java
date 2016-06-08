package Marker;

import GraphicalUI.GraphicalUI;

import javax.swing.*;
import java.awt.*;
import GraphicalUI.Listener;
import GraphicalUI.GraphicalUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import GraphicalUI.ImagePanel;


public class PaintRectangle extends JComponent {
    private GraphicalUI graphicalUI;


    public PaintRectangle (int x, int y){
        setLayout(null);
        setBounds(x,y,50,50);
        setPreferredSize(new Dimension(50,50));
        setMaximumSize(new Dimension(50,50));
        setMinimumSize(new Dimension(50,50));

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawRect(0, 0, 50, 50);
    }

}