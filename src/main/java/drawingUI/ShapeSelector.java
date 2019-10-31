package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    private JRadioButton bCirc;
    private JRadioButton bRect;
    private JRadioButton bSquare;

    public ShapeSelector(){
        bCirc = new JRadioButton("Circle");
        bRect = new JRadioButton("Rectangle");
        bSquare = new JRadioButton("Square");
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(bCirc);
        bGroup.add(bRect);
        bGroup.add(bSquare);
        this.add(bCirc);
        this.add(bRect);
        this.add(bSquare);
        bCirc.setSelected(true);
    }

    public int getCurrentShape(){
        if(bCirc.isSelected()){
            return 1;
        }
        else if (bRect.isSelected()){
            return 2;
        }
        else if (bSquare.isSelected()){
            return 3;
        }
        else
            return 0;

    }
}
