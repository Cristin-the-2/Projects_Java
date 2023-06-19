package Projects_Java.Seminar04;

import java.util.Scanner;
import java.util.Stack;

public class Task33 {
    public static void main(String[] args) {
        // Принять от пользователя и "запомнить" строки
        // Если введено print, выводить строки так, чтобы последняя введенная 
        // была первой в списке, а первая - последней
        Scanner sc = new Scanner(System.in, "cp866");
        String choise = "";
        boolean isExit = false;
        Stack<String> stack = new Stack<>();
        while (!isExit) {
            System.out.print(
                    "Что делаем?\n [a] - Добавить текст\n [p] - Вывести текст на консоль\n [q] - Выйти\n ---> ");
            choise = sc.nextLine();
            switch (choise) {
                case "a":
                    System.out.println("Введи необходимый текст: ");
                    String text = sc.nextLine();
                    stack.push(text);
                    break;
                case "p":
                    while (!stack.empty()) {
                        System.out.printf("%s, ", stack.pop());
                    }
                    System.out.println();
                    break;
                case "q":
                    isExit = true;
                    break;
                default:
                    System.out.println("Выбирай правильные варианты.");
                    break;
            }
        }
        sc.close();
    }
}
