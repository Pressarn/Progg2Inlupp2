package Marker;



import GraphicalUI.Listener;
import GraphicalUI.GraphicalUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;


public class TrainMarker extends JComponent {
    private GraphicalUI graphicalUI;


    private int [] xes = {0,25,50};
    private int [] yes = {0,50,0};

    public TrainMarker (int x, int y){
        setLayout(null);
        setBounds(x,y,50,50);
        setPreferredSize(new Dimension(50,50));
        setMaximumSize(new Dimension(50,50));
        setMinimumSize(new Dimension(50,50));

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillPolygon(xes, yes, 3);
    }

}
