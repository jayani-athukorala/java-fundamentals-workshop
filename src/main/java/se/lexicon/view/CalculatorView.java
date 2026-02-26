package se.lexicon.view;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {

    public JFrame frame = new JFrame("Calculator");
    public JTextField textField = new JTextField();

    public JButton[] numberButtons = new JButton[10];
    public JButton addButton = new JButton("+");
    public JButton subButton = new JButton("-");
    public JButton mulButton = new JButton("*");
    public JButton divButton = new JButton("/");
    public JButton decButton = new JButton(".");
    public JButton equButton = new JButton("=");
    public JButton delButton = new JButton("DEL");
    public JButton clrButton = new JButton("CLR");
    public JButton negButton = new JButton("(-)");

    public CalculatorView() {

        frame.setSize(420, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);
        frame.add(textField);

        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));
        panel.setBounds(50, 100, 300, 300);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);
    }
}