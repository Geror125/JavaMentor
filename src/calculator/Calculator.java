package calculator;

public class Calculator {
    private String expression;
    private int firstNumber;
    private String sign;
    private int secondNumber;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int calculate() {
        divider();
        switch (sign) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
        }

    }

    public void divider() {
        String
    }




}