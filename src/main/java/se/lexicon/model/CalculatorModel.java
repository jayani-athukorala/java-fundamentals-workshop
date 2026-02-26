package se.lexicon.model;

public class CalculatorModel {

    private double num1;
    private double num2;
    private char operator;
    private double result;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalStateException("Invalid operator");
        }
        num1 = result; // chaining
        return result;
    }

    public void clear() {
        num1 = num2 = result = 0;
        operator = '\0';
    }
}