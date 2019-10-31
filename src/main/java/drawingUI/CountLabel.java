package drawingUI;

import javax.swing.*;

public class CountLabel extends JLabel {
    private int count;
    private String text;

    public CountLabel(String inText){
        count = 0;
        this.text = inText;
        this.setText(String.format("%s: %d", this.text, count));
    }

    public int getCount(){
        return count;
    }

    public void incCount(){
        count++;
        this.setText(String.format("%s: %d", text, count));
    }
}
