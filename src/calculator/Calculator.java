package calculator;

import java.lang.Math;

public class Calculator {

    private String expression;
    private int firstNumber;
    private String sign;
    private int secondNumber;
    private int result;
    private String finalRomanNum = "";

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void calculate() {
        start();
        switch (sign) {
            case "+":
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case "-":
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case "*":
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case "/":
                result = Math.floorDiv(firstNumber, secondNumber);
                break;
            case "":
                System.out.println("Ошибка, такой опирации нет.");
                break;
        }
        end();
    }

    public void start() {
        String[] words = expression.split(" ");
        firstNumber = enter(words[0]);
        sign = words[1];
        secondNumber = enter(words[2]);
    }

    public void end() {
        String[] words = expression.split(" ");
        if ((words[0].equals("I") || words[0].equals("II") || words[0].equals("III") || words[0].equals("IV") || words[0].equals("V") || words[0].equals("VI") || words[0].equals("VII") || words[0].equals("VIII") || words[0].equals("IX") || words[0].equals("X")) &&
                (words[2].equals("I") || words[2].equals("II") || words[2].equals("III") || words[2].equals("IV") || words[2].equals("V") || words[2].equals("VI") || words[2].equals("VII") || words[2].equals("VIII") || words[2].equals("IX") || words[2].equals("X"))) {
            System.out.println("Результат: " + toRoman(result));
        } else if ((words[0].equals("1") || words[0].equals("2") || words[0].equals("3") || words[0].equals("4") || words[0].equals("5") || words[0].equals("6") || words[0].equals("7") || words[0].equals("8") || words[0].equals("9") || words[0].equals("10")) &&
                (words[2].equals("1") || words[2].equals("2") || words[2].equals("3") || words[2].equals("4") || words[2].equals("5") || words[2].equals("6") || words[2].equals("7") || words[2].equals("8") || words[2].equals("9") || words[2].equals("10"))) {
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ошибка, римские и арабские цифры можно только по отдельности.");
        }
    }

    public int enter(String word) {
        if ("1".equals(word) || "I".equals(word)) {
            return 1;
        } else if ("2".equals(word) || "II".equals(word)) {
            return 2;
        } else if ("3".equals(word) || "III".equals(word)) {
            return 3;
        } else if ("4".equals(word) || "IV".equals(word)) {
            return 4;
        } else if ("5".equals(word) || "V".equals(word)) {
            return 5;
        } else if ("6".equals(word) || "VI".equals(word)) {
            return 6;
        } else if ("7".equals(word) || "VII".equals(word)) {
            return 7;
        } else if ("8".equals(word) || "VIII".equals(word)) {
            return 8;
        } else if ("9".equals(word) || "IX".equals(word)) {
            return 9;
        } else if ("10".equals(word) || "X".equals(word)) {
            return 10;
        } else {
            System.out.println("Ошибка, больше 10/X нельзя использовать.");
            return 0;
        }
    }

    public String toRoman(int result) {
        String[] romanNumerals = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanNumeralNums = {100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < romanNumeralNums.length; i++) {
            int currentNum = result / romanNumeralNums[i];
            if (currentNum == 0) {
                continue;
            }

            for (int j = 0; j < currentNum; j++) {
                finalRomanNum += romanNumerals[i];
            }

            result = result % romanNumeralNums[i];
        }
        return finalRomanNum;
    }
}