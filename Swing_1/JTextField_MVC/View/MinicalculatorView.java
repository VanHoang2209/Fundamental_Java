package Swing_1.JTextField_MVC.View;

import Swing_1.JTextField_MVC.Controller.MinicalculatorListener;
import Swing_1.JTextField_MVC.Model.MiniCalculatorModel;

import javax.swing.*;
import java.awt.*;

public class MinicalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextFieldFirstValue;
    private JTextField jTextFieldSecondValue;
    private JTextField jTextFieldAnswer;


    public MinicalculatorView() throws HeadlessException{
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }

    public void init(){
        this.setTitle("Mini Calcutor");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD, 40);

        JLabel jLabelFirstValue = new JLabel("Fist Value: ");
        jLabelFirstValue.setFont(font);

        JLabel jLabelSecondValue = new JLabel("Second Value: ");
        jLabelSecondValue.setFont(font);

        JLabel jLabelAnswer = new JLabel("Answer Value: ");
        jLabelAnswer.setFont(font);

        jTextFieldFirstValue = new JTextField(50);
        jTextFieldFirstValue.setFont(font);
        jTextFieldSecondValue = new JTextField(50);
        jTextFieldSecondValue.setFont(font);
        jTextFieldAnswer = new JTextField(50);
        jTextFieldAnswer.setFont(font);

        JPanel jPanelInputOutput = new JPanel();
        jPanelInputOutput.setLayout(new GridLayout(3,2,10,10));
        jPanelInputOutput.add(jLabelFirstValue);
        jPanelInputOutput.add(jTextFieldFirstValue);
        jPanelInputOutput.add(jLabelSecondValue);
        jPanelInputOutput.add(jTextFieldSecondValue);
        jPanelInputOutput.add(jLabelAnswer);
        jPanelInputOutput.add(jTextFieldAnswer);

        MinicalculatorListener minicalculatorListener = new MinicalculatorListener(this);

        JButton jButtonPlus = new JButton("+");
        jButtonPlus.setFont(font);
        jButtonPlus.addActionListener(minicalculatorListener);

        JButton jButtonMinus = new JButton("-");
        jButtonMinus.setFont(font);
        jButtonMinus.addActionListener(minicalculatorListener);

        JButton jButtonMultiply = new JButton("*");
        jButtonMultiply.setFont(font);
        jButtonMultiply.addActionListener(minicalculatorListener);

        JButton jButtonDevide = new JButton("/");
        jButtonDevide.setFont(font);
        jButtonDevide.addActionListener(minicalculatorListener);

        JButton jButtonPow = new JButton("^");
        jButtonPow.setFont(font);
        jButtonPow.addActionListener(minicalculatorListener);

        JButton jButtonMod = new JButton("%");
        jButtonMod.setFont(font);
        jButtonMod.addActionListener(minicalculatorListener);

        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new GridLayout(2,3));

        jPanelButton.add(jButtonPlus);
        jPanelButton.add(jButtonMinus);
        jPanelButton.add(jButtonMultiply);
        jPanelButton.add(jButtonDevide);
        jPanelButton.add(jButtonPow);
        jPanelButton.add(jButtonMod);

        this.setLayout(new BorderLayout(10,10));
        this.add(jPanelInputOutput,BorderLayout.CENTER);
        this.add(jPanelButton,BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void plus(){
        double firstValue = Double.valueOf(jTextFieldFirstValue.getText()); // ép kiểu
        double secondValue = Double.valueOf(jTextFieldSecondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.plus();
        this.jTextFieldAnswer.setText(this.miniCalculatorModel.getAnswer() + ""); // vì Answer là giá trị double nên phải cộng thêm " "
    }
    public  void minus(){
        double firstValue = Double.valueOf(jTextFieldFirstValue.getText()); // ép kiểu
        double secondValue = Double.valueOf(jTextFieldSecondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        this.jTextFieldAnswer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    public void multiply(){
        double firstValue = Double.valueOf(jTextFieldFirstValue.getText()); // ép kiểu
        double secondValue = Double.valueOf(jTextFieldSecondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.multiply();
        this.jTextFieldAnswer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    public void devide(){
        double firstValue = Double.valueOf(jTextFieldFirstValue.getText()); // ép kiểu
        double secondValue = Double.valueOf(jTextFieldSecondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.devide();
        this.jTextFieldAnswer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    public void pow(){ // mũ
        double firstValue = Double.valueOf(jTextFieldFirstValue.getText()); // ép kiểu
        double secondValue = Double.valueOf(jTextFieldSecondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.pow();
        this.jTextFieldAnswer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    public void mod() {
        double firstValue = Double.valueOf(jTextFieldFirstValue.getText()); // ép kiểu
        double secondValue = Double.valueOf(jTextFieldSecondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        this.jTextFieldAnswer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
}
