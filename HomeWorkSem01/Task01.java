package Projects_Java.HomeWorkSem01;
import java.util.Scanner;

public class Task01 {
    // Вычислить n-ое треугольного число (сумма чисел от 1 до n),
    // n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        int number = 0;
        do {
            System.out.print("Введите положительное число: ");
            number = Integer.valueOf(sc.nextLine());
        } while (number <= 0);
        sc.close();
        System.out.printf("Сумма чисел от 1 до %d равна %d.\n", number, SumNumber(number));
        System.out.printf("Произведение чисел от 1 до %d равно %d.", number, Factorial(number));
    }

    public static int SumNumber(int num) {
        int sumN = 1;
        if (num > 1) {
            for (int i = 2; i <= num; i++) {
                sumN += i;
            }
        }
        return sumN;
    }

    public static long Factorial(int num) {
        long fact = 1;
        if (num > 1) {
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
        }
        return fact;
    }
}