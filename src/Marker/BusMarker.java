package Marker;



import GraphicalUI.Listener;
import GraphicalUI.GraphicalUI;
import GraphicalUI.Listener.MarkerListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.util.Locale;
import GraphicalUI.ImagePanel;
import GraphicalUI.Listener.MarkerListener;



public class BusMarker extends JComponent {
    private GraphicalUI graphicalUI;
    private Listener listener;
    private PaintRectangle paintRectangle;
    ImagePanel imagePanel = new ImagePanel("/Users/SimonSchwieler/IdeaProjects/Progg2Inlupp2/./800px-Yngwie_Malmsteen_1.jpg");



        private int[] xes = {0, 25, 50};
        private int[] yes = {0, 50, 0};

        public BusMarker(int x, int y) {
            setLayout(null);
            setBounds(x, y, 50, 50);
            setPreferredSize(new Dimension(50, 50));
            setMaximumSize(new Dimension(50, 50));
            setMinimumSize(new Dimension(50, 50));
            addMouseListener(new MoveListener());
            addFocusListener(new FocusList());

        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.CYAN);
            g.fillPolygon(xes, yes, 3);
            g.drawRect(50, 50, 50, 50);
            g.setColor(Color.RED);
        }

    public class FocusList implements FocusListener {
        public void focusGained(FocusEvent fev) {
            System.out.print("Fått kontroll");



        }
        public void focusLost(FocusEvent fev){
            imagePanel.setBackground(Color.ORANGE);
            System.out.print("Tappat kontroll");
        }
    }
    class MoveListener extends MouseAdapter{
        private int startX, startY;
        @Override
        public void mousePressed(MouseEvent mev){
            startX = mev.getX();
            startY = mev.getY();

            requestFocusInWindow();
        }
        public void mouseDragged(MouseEvent mev){
            int x = mev.getX();
            int y = mev.getY();
            setLocation(getX()+x-startX, getY()+y-startY);
        }
    }

}
