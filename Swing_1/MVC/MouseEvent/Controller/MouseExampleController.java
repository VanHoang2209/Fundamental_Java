package Swing_1.MVC.MouseEvent.Controller;

import Swing_1.MVC.MouseEvent.View.MouseExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseExampleController implements MouseListener, MouseMotionListener {
    private MouseExampleView mouseExampleView;
    public MouseExampleController(MouseExampleView mouseExampleView){
        this.mouseExampleView = mouseExampleView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseExampleView.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseExampleView.enter();
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.update(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseExampleView.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.update(x,y);
    }
}
