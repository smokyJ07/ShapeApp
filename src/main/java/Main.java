import drawingUI.DrawingUIController;
import shapes.Drawing;

import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc; // Class field containing config info

    public static void main(String[] args) {
        JFrame frame= new JFrame(gc); // Create a new JFrame
        frame.setSize(500,600);
        //add main panel and controls panel
        DrawingUIController controller = new DrawingUIController();
        frame.getContentPane().add(controller.getMainPanel());

        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
