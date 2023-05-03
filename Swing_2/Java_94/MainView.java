package Swing_2.Java_94;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MainView extends JFrame {

    public MainView(){
        this.setTitle("Java_94");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        //Set icon => JFrame
        URL urlIconNotepad = MainView.class.getResource("IconNotePad.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);
        this.setIconImage(img);

        //JMenuBar
        JMenuBar jMenuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu subMenu = new JMenu("Sub menu");

        JMenuItem i1 = new JMenuItem("New");
        i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("IconNew.png"))));
        JMenuItem i2 = new JMenuItem("Save");
        i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("IconSave.png"))));
        JMenuItem i3 = new JMenuItem("Save as");
        i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("IconSaveAs.png"))));
        JMenuItem i4 = new JMenuItem("Exit");
        i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("IconExit.png"))));
        JMenuItem i5 = new JMenuItem("Test");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        subMenu.add(i4);
        subMenu.add(i5);

        menu.add(subMenu);
        jMenuBar.add(menu);

        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("img.png"))));

        Font font = new Font("Arial",Font.BOLD,50);
        JButton jButton = new JButton("Test button");
        jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("IconExit.png"))));
        jButton.setFont(font);


        this.setJMenuBar(jMenuBar);
        this.add(jLabel,BorderLayout.CENTER);
        this.add(jButton,BorderLayout.SOUTH);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainView();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
