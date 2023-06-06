package Projects_Java.HomeWorkSem01;

import java.util.Scanner;

public class Task03 {
    // Реализовать простой калькулятор
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        while (input != 5) {
            System.out.print(
                    "Что будем считать?\n [1] - Сложение\n [2] - Вычитание\n [3] - Умножение\n [4] - Деление\n [5] - Выход\n ---> ");
            input = Integer.valueOf(sc.nextLine());
            switch (input) {
                case 1:
                    Summation();
                    break;
                case 2:
                    Subtractions();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Выбирай правильные варианты.");
                    break;
            }
        }
        sc.close();
    }

    public static void Summation() {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
    }

    public static void Subtractions() {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
    }

    public static void Multiplication() {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
    }

    public static void Division() {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
    }
}
