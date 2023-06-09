import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // Напишите метод, который сжимает строку.
        // Ввод: aaaabbbcdd. Вывод: a4b3cd2
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        sc.close();
        getShorty(str);
    }

    public static void getShorty(String str) {
        int count = 1;
        char temp = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == temp) {
                count++;
            } else {
                if (count > 1) {
                    System.out.printf("%c%d", temp, count);
                } else {
                    System.out.printf("%c", temp);
                }
                temp = str.charAt(i);
                count = 1;
            }
        }
        if (count > 1) {
            System.out.printf("%c%d", temp, count);
        } else {
            System.out.printf("%c", temp);
        }
    }
}
