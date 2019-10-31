package drawingUI;

import shapes.Circle;
import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    private JPanel controlsPanel;
    private JPanel mainPanel;
    private Drawing drawing;
    private ShapeSelector sSel;
    private ColorSelector cSel;
    private CircleDimsSelector circDims;
    private RectDimsSelector rectDims;
    private SquareDimsSelector squareDims;
    private StatsDisplay stats;

    public DrawingUIController(){
        controlsPanel = new JPanel();
        controlsPanel.setLayout(new GridLayout(3, 2));
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));
        sSel = new ShapeSelector();
        controlsPanel.add(sSel);
        cSel = new ColorSelector();
        controlsPanel.add(cSel);
        circDims = new CircleDimsSelector();
        controlsPanel.add(circDims);
        rectDims = new RectDimsSelector();
        controlsPanel.add(rectDims);
        squareDims = new SquareDimsSelector();
        controlsPanel.add(squareDims);
        stats = new StatsDisplay();
        controlsPanel.add(stats);
        drawing = new Drawing();
        //adding mouse listener to draw circles
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                int control = sSel.getCurrentShape();
                Color currentColor = cSel.getCurrentColor();
                int currentCircRadius = circDims.getCurrentRadius();
                int currentRectWidth = rectDims.getCurrentWidth();
                int currentRectHeight = rectDims.getCurrentHeight();
                int currentSquareSide = squareDims.getCurrentSide();
                if (control == 1) {
                    stats.incCircles();
                    drawing.addCircle(mouseEvent.getPoint(), currentColor, currentCircRadius);
                    drawing.repaint();
                }
                else if (control ==2){
                    stats.incRects();
                    drawing.addRect(mouseEvent.getPoint(), currentColor, currentRectWidth, currentRectHeight);
                    drawing.repaint();
                }
                else if (control == 3){
                    stats.incSquares();
                    drawing.addSquare(mouseEvent.getPoint(), currentColor, currentSquareSide);
                    drawing.repaint();
                }
                else if (control == 4){
                    System.out.println("Error selecting the shape");
                }
                else{
                    System.out.println("Error in DrawingUIController");
                }
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        //fill mainPanel
        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
