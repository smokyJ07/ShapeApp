package drawingUI;

import javax.swing.*;
import java.awt.*;

public class SquareDimsSelector extends JPanel {
    private JSlider side;

    public SquareDimsSelector(){
        this.setLayout(new GridLayout(3, 1));
        JLabel label = new JLabel("Select square side length");
        side = new JSlider(1, 100);
        this.add(label);
        this.add(side);
    }

    public int getCurrentSide(){
        return side.getValue();
    }
}
