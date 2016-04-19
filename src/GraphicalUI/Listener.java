package GraphicalUI;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.event.*;
import Location.Subway;
import Marker.Marker;
import Marker.BusMarker;
import Marker.SubwayMarker;
import Marker.TrainMarker;
import Marker.PaintRectangle;

public class Listener {
    private GraphicalUI graphicalUI;
    private JFileChooser jfc = new JFileChooser(".");
    private ImagePanel imagePanel;
    Map<String, String> locationInfo = new HashMap<>();
    private PaintRectangle rectangle;


    public Listener(GraphicalUI graphicalUI) {
        this.graphicalUI = graphicalUI;
    }

    public OpenListener getOpenListener() {
        return new OpenListener();
    }

    public ExitListener getExitListener() {
        return new ExitListener();
    }

    public MarkerListener getMarkerListener() {
        return new MarkerListener();
    }

    public ButtonPressed getButtonPressed() {
        return new ButtonPressed();
    }

    public CategoryListener getCategoryListener() {
        return new CategoryListener();
    }

    public HideListener getHideListener(){ return new HideListener();}

    public PaintRectangle getRectangle() {
        return rectangle;
    }
    //  public FocusList getFocusListener(){ return new FocusList();}


    class ValueListener implements ActionListener {
        public void actionPerformed(ActionEvent ave) {

            System.out.print("Hej");
        }
    }

    class NameListener implements ActionListener {
        public void actionPerformed(ActionEvent ave) {

            System.out.print("Hej");
        }
    }

    public class OpenListener implements ActionListener {
        public void actionPerformed(ActionEvent ave) {
            int svar = jfc.showOpenDialog(graphicalUI);
            if (svar != JFileChooser.APPROVE_OPTION)
                return;

            File fil = jfc.getSelectedFile();
            String filnamn = fil.getAbsolutePath();
            System.out.println(filnamn);
            imagePanel = new ImagePanel(filnamn);
            graphicalUI.add(imagePanel);
            JScrollPane scroll = new JScrollPane(imagePanel);
            graphicalUI.add(scroll);
            graphicalUI.pack();
            graphicalUI.validate();
            graphicalUI.repaint();

        }


    }

    public String getFilNamn() {
        return jfc.getSelectedFile().getAbsolutePath();
    }

    class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent ave) {
            System.exit(0);
        }
    }


    public class MarkerListener extends MouseAdapter {


        public int getX() {
            return 3;
        }

        @Override
        public void mouseClicked(MouseEvent mev) {


            int x = mev.getX() - 25;
            int y = mev.getY() - 50;
            imagePanel.requestFocusInWindow();


            if (!graphicalUI.getIsSelected() && graphicalUI.getJList().equalsIgnoreCase("Bus")) {
                BusMarker marker = new BusMarker(x, y);
                PaintRectangle rectangle = new PaintRectangle(x, y);

                rectangle.setVisible(false);
                imagePanel.add(rectangle);
                imagePanel.add(marker);
                imagePanel.validate();
                imagePanel.repaint();
                imagePanel.removeMouseListener(MarkerListener.this);


            } else if (!graphicalUI.getIsSelected() && graphicalUI.getJList().equalsIgnoreCase("Train               ")) {
                TrainMarker marker2 = new TrainMarker(x, y);

                imagePanel.add(marker2);
                imagePanel.validate();
                imagePanel.repaint();
                imagePanel.removeMouseListener(MarkerListener.this);
            } else if (!graphicalUI.getIsSelected() && graphicalUI.getJList().equalsIgnoreCase("Subway")) {
                SubwayMarker marker3 = new SubwayMarker(x, y);


                PaintRectangle rectangle = new PaintRectangle(x, y);

                rectangle.setVisible(false);
                imagePanel.add(rectangle);
                imagePanel.add(marker3);
                imagePanel.validate();
                imagePanel.repaint();
                imagePanel.removeMouseListener(MarkerListener.this);

            } else if (graphicalUI.getIsSelected()) {
                Marker marker4 = new Marker(x, y);
                imagePanel.add(marker4);
                imagePanel.validate();
                imagePanel.repaint();
                imagePanel.removeMouseListener(MarkerListener.this);
            }

            System.out.println(mev.getPoint());
            imagePanel.setCursor(Cursor.getDefaultCursor());


        }
    }

    public class CategoryListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent lse) {
            if (!lse.getValueIsAdjusting()) {
                System.out.println(graphicalUI.getJList());


            }
        }
    }


    public class ButtonPressed implements ActionListener {
        public void actionPerformed(ActionEvent ave) {
            try {
                imagePanel.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
                imagePanel.addMouseListener(getMarkerListener());


            } catch (NullPointerException e){
                JOptionPane.showMessageDialog(graphicalUI,"Ingen karta laddad!");
            }
        }
    }
    public class HideListener implements ActionListener {
        public void actionPerformed(ActionEvent ave) {
            System.out.println("Komplettera");
        }
    }
}

