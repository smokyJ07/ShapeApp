package shapes;

import java.awt.*;

public abstract class Shape{
    protected Color col;
    protected Point pos;

    public Shape(Color col, Point initPos) {
        this.col=col;
        pos=initPos;
    }
    abstract void draw(Graphics g);
}
