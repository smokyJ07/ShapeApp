package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapesDB {
    private ArrayList<Shape> shapes;

    public ShapesDB(){
        shapes  = new ArrayList<Shape>();
    }

    public void addCircle(Point initPos, Color col, int radius){
        Circle new_circle = new Circle(initPos, col, radius);
        shapes.add(new_circle);
        return;
    }

    public void addRect(Point initPos, Color col, int width, int height){
        Rect new_rect = new Rect(initPos, col, width, height);
        shapes.add(new_rect);
        return;
    }

    public void addSquare(Point initPos, Color col, int side){
        Rect new_square = new Square(initPos, col, side);
        shapes.add(new_square);
        return;
    }

    public void drawShapes(Graphics g){
        for (Shape shape : shapes){
            shape.draw(g);
        }
    }


}
