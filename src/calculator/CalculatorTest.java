package calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите выражение: ");
        calculator.setExpression(scan.nextLine());
        calculator.calculate();
    }
}