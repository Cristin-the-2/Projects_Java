import java.util.Scanner;
public class Task11 {
    // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет 
    // строку длины N, которая состоит из чередующихся символов c1 и c2, 
    // начиная с c1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите четное положительное число: ");
        int number = Integer.valueOf(sc.nextLine());
        System.out.print("Введите первый символ: ");
        char c1 = sc.nextLine().charAt(0);
        System.out.print("Введите второй символ: ");
        char c2 = sc.nextLine().charAt(0);
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number/2; i++) {
            sb.append(c1).append(c2);
        }
        System.out.println(sb);
    }
}