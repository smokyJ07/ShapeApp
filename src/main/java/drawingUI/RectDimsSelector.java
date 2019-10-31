package drawingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimsSelector extends JPanel{
    private JSlider height;
    private JSlider width;

    public RectDimsSelector(){
        this.setLayout(new GridLayout(3, 1));
        JLabel label = new JLabel("Select rectangle height and width");
        height = new JSlider(1, 100);
        width = new JSlider(1, 100);
        this.add(label);
        this.add(height);
        this.add(width);
    }

    public int getCurrentHeight(){
        return height.getValue();
    }

    public int getCurrentWidth(){
        return width.getValue();
    }
}
