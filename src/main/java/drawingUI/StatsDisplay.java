package drawingUI;

import javax.swing.*;
import java.awt.*;

public class StatsDisplay extends JPanel {
    private CountLabel circles;
    private CountLabel rects;
    private CountLabel squares;

    public StatsDisplay(){
        this.setLayout(new GridLayout(3, 1));
        circles = new CountLabel("Circles");
        rects = new CountLabel("Rectangles");
        squares = new CountLabel("Squares");
        this.add(circles);
        this.add(rects);
        this.add(squares);
    }
    public void incCircles(){
        circles.incCount();
    }
    public void incRects(){
        rects.incCount();
    }
    public void incSquares(){
        squares.incCount();
    }
}
