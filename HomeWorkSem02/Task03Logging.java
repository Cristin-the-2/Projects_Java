package Projects_Java.HomeWorkSem02;

import java.lang.ProcessHandle.Info;
import java.util.Scanner;
import java.util.logging.*;

public class Task03Logging {
    // К калькулятору из предыдущего ДЗ добавить логирование.
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in, "cp866");
            int input = 0;
            Logger logger = Logger.getLogger(Task12.class.getName());
            FileHandler fh = new FileHandler("Projects_Java/HomeWorkSem02/logTask03.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info("Programm started");
            while (input != 5) {
                System.out.print(
                        "Что будем считать?\n [1] - Сложение\n [2] - Вычитание\n [3] - Умножение\n [4] - Деление\n [5] - Выход\n ---> ");
                input = Integer.valueOf(sc.nextLine());
                switch (input) {
                    case 1:
                        Summation(logger);
                        break;
                    case 2:
                        Subtractions(logger);
                        break;
                    case 3:
                        Multiplication(logger);
                        break;
                    case 4:
                        Division(logger);
                        break;
                    case 5:
                        logger.info("Programm finished");
                        break;
                    default:
                        System.out.println("Выбирай правильные варианты.");
                        break;
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }
    }

    public static void Summation(Logger logger) {
        logger.info("Summation started");
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        logger.info("first num: " + Integer.toString(num1));
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        logger.info("second num: " + Integer.toString(num2));
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        logger.info("result: " + Integer.toString(num1 + num2));
        logger.info("Summation finished");
    }

    public static void Subtractions(Logger logger) {
        logger.info("Subtractions started");
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        logger.info("first num: " + Integer.toString(num1));
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        logger.info("second num: " + Integer.toString(num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        logger.info("result: " + Integer.toString(num1 - num2));
        logger.info("Subtractions finished");
    }

    public static void Multiplication(Logger logger) {
        logger.info("Multiplication started");
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        logger.info("first num: " + Integer.toString(num1));
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        logger.info("second num: " + Integer.toString(num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
        logger.info("result: " + Integer.toString(num1 * num2));
        logger.info("Multiplication finished");
    }

    public static void Division(Logger logger) {
        logger.info("Division started");
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введи первое число: ");
        int num1 = Integer.valueOf(sc.nextLine());
        logger.info("first num: " + Integer.toString(num1));
        System.out.print("Введи второе число: ");
        int num2 = Integer.valueOf(sc.nextLine());
        logger.info("second num: " + Integer.toString(num2));
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
        logger.info("result: " + Integer.toString(num1 / num2));
        logger.info("Division finished");
    }
}