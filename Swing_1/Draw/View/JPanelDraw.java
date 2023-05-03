package Swing_1.Draw.View;

import javax.swing.*;
import java.awt.*;

public class JPanelDraw extends JPanel {
    public JPanelDraw(){
        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawLine(15,15,50,150);   // vẽ đường thẳng

        g.setColor(Color.blue);
        g.drawOval(255,255,50,50);   // vẽ hình tròn

        g.setColor(Color.green);
        g.drawRect(45,150,30,90);   // vẽ hình chữ nhật

        g.setColor(Color.pink);
        g.fillOval(400,300,50,50);

        g.setColor(Color.YELLOW);
        g.fillRect(100,100,150,100);

        g.setColor(Color.black);
        g.drawString("Nguyễn Văn Hoàng",250,250);
    }
}
