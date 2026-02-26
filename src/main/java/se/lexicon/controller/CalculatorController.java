package se.lexicon.controller;

import se.lexicon.model.CalculatorModel;
import se.lexicon.view.CalculatorView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorController implements ActionListener {

    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        for (int i = 0; i < 10; i++) {
            view.numberButtons[i].addActionListener(this);
        }

        view.addButton.addActionListener(this);
        view.subButton.addActionListener(this);
        view.mulButton.addActionListener(this);
        view.divButton.addActionListener(this);
        view.equButton.addActionListener(this);
        view.clrButton.addActionListener(this);
        view.delButton.addActionListener(this);
        view.negButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            for (int i = 0; i < 10; i++) {
                if (e.getSource() == view.numberButtons[i]) {
                    view.textField.setText(view.textField.getText() + i);
                    return;
                }
            }

            if (e.getSource() == view.addButton) setOperator('+');
            if (e.getSource() == view.subButton) setOperator('-');
            if (e.getSource() == view.mulButton) setOperator('*');
            if (e.getSource() == view.divButton) setOperator('/');

            if (e.getSource() == view.equButton) {
                model.setNum2(Double.parseDouble(view.textField.getText()));
                double result = model.calculate();
                view.textField.setText(String.valueOf(result));
            }

            if (e.getSource() == view.clrButton) {
                model.clear();
                view.textField.setText("");
            }

            // DELETE (backspace)
            if (e.getSource() == view.delButton) {
                String text = view.textField.getText();

                if (!text.isEmpty()) {
                    view.textField.setText(text.substring(0, text.length() - 1));
                }
            }

            // NEGATIVE toggle
            if (e.getSource() == view.negButton) {
                String text = view.textField.getText();

                if (!text.isEmpty()) {
                    try {
                        double value = Double.parseDouble(text);
                        value *= -1;
                        view.textField.setText(String.valueOf(value));
                    } catch (NumberFormatException ex) {
                        view.textField.setText("Invalid input");
                    }
                }
            }


        } catch (NumberFormatException ex) {
            view.textField.setText("Invalid input");
        } catch (ArithmeticException ex) {
            view.textField.setText(ex.getMessage());
        }
    }

    private void setOperator(char op) {
        model.setNum1(Double.parseDouble(view.textField.getText()));
        model.setOperator(op);
        view.textField.setText("");
    }
}