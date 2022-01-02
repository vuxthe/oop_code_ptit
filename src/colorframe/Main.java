package colorframe;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ColorFrame f = new ColorFrame("Test");
        f.setSize(500, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
