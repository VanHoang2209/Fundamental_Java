package Swing_1.MVC.MyColor_Use_MVC.Model;

import java.awt.*;

public class MyColorModel {
    private Color foreground;
    private Color background;
    private boolean opaque;

    public MyColorModel() {
        this.foreground = Color.BLACK;
        this.background = Color.WHITE;
        this.opaque = true;
    }


    public Color getForeground() {
        return foreground;
    }


    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }


    public Color getBackground() {
        return background;
    }


    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }
}
