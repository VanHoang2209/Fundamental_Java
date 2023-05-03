package Swing_1.Draw.View;

import javax.swing.*;
import java.awt.*;

public class DrawExampleView extends JFrame {
    public DrawExampleView() throws HeadlessException {
        this.setTitle("Draw Example");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanelDraw jPanelDraw = new JPanelDraw();

        this.setLayout(new BorderLayout());
        this.add(jPanelDraw,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawExampleView();
    }
}
