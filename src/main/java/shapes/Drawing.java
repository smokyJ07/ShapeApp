package shapes;

import shapes.Circle;
import shapes.Rect;
import shapes.Shape;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private Frame f;
    private Circle circ;
    private Rect rect;
    private ShapesDB db;

    public Drawing(){
        db = new ShapesDB();

        //paint some shapes right away
        //addCircle(new Point(100, 50), new Color(0x000FF), 90);
        //addRect(new Point(200, 200), new Color(0x992266), 100, 50);
        //addSquare(new Point(300, 50), new Color(0x00FF00), 50);

        //setupFrame();
        setupCanvas();

    }

    public void addCircle(Point pos, Color col, int radius){
        db.addCircle(pos, col, radius);
    }

    public void addRect(Point pos, Color col, int width, int height){
        db.addRect(pos, col, width, height);
    }

    public void addSquare(Point pos, Color col, int side){
        db.addSquare(pos, col, side);
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        db.drawShapes(g);
    }
}
