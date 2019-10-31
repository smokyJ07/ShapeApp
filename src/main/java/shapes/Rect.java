package shapes;

import java.awt.*;

public class Rect extends Shape{
    private int w;
    private int h;

    public Rect(Point initPos, Color col, int width, int height){
        super(col, initPos);
        w = width; // Initialize fields
        h = height;
    }
    @Override
    protected void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, w, h);
    }
}
