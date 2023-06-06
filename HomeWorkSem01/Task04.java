package Projects_Java.HomeWorkSem01;

import java.util.Scanner;

public class Task04 {
    // Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
    // заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить
    // выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
    // что его нет.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите уравнение: ");
        String expression = sc.nextLine();
        FindSolution(expression);
        sc.close();
    }

    public static void FindSolution(String expression) {
        int count = 0;
        String res = "";
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                String exp = expression.replace("?", "" + q)
                                       .replace("?", "" + w);
                if (CheckExpression(exp)) {
                    count++;
                    res = exp;
                }
            }
        }
        if (count == 0) {
            System.out.println("Решение отсутствует.");
        }
        else {
            System.out.println(res);
        }
    }

    public static boolean CheckExpression(String exp) {
        String[] parts = exp.split("=");
        String[] leftNumbers = parts[0].split("\\+");
        int firstNumber = Integer.valueOf(leftNumbers[0].trim());
        int secondNumber = Integer.valueOf(leftNumbers[1].trim());
        int rightPart = Integer.valueOf(parts[1].trim());
        return (firstNumber + secondNumber) - rightPart == 0;
    }
}
