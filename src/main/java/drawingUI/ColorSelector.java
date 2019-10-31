package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelector extends JPanel {
    private Color currentColour;
    private JButton bt1;

    public ColorSelector(){
        currentColour = Color.BLACK;
        bt1 = new JButton("Select color");
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColour = JColorChooser.showDialog(
                        bt1, "Choose Colour", currentColour);
                currentColour=newColour;
                bt1.setBackground(currentColour);
            }
        });
        this.add(bt1);
    }

    public Color getCurrentColor(){
        return currentColour;
    }
}
