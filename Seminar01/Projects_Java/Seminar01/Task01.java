package Projects_Java.Seminar01;

import java.util.Scanner;

/**
 * Task01
 */
public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите имя пользователя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name);
        sc.close();
    }
}