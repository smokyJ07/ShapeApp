package drawingUI;

import javax.swing.*;
import java.awt.*;

public class CircleDimsSelector extends JPanel {
    private JSlider slider;

    public CircleDimsSelector(){
        this.setLayout(new GridLayout(3, 1));
        JLabel label = new JLabel("Select circle radius");
        slider = new JSlider(1, 100);
        this.add(label);
        this.add(slider);
    }

    public int getCurrentRadius(){
        return slider.getValue();
    }
}
