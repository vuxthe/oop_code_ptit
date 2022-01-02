package testGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyFrame("Test");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
    }
}
