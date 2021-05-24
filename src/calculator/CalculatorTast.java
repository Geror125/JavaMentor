package calculator;

public class CalculatorTast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Введите выражение: ");
        calculator.setExpression(scan.nextLine());

        System.out.println("Результат: " + calculator.calculate());
    }
}