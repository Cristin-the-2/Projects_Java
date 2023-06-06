package Projects_Java.HomeWorkSem01;

public class Task02 {
    // Вывести все простые числа от 1 до 1000
    public static void main(String[] args) {
        PrintSimple(1, 1000);
    }

    public static void PrintSimple(int leftRange, int rightRange) {
        System.out.print("Простые числа: ");
        boolean b = true;
        for (int i = leftRange; i <= rightRange; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                }
            }
            if (b) {
                System.out.printf("%d, ", i);
            }
            b = true;
        }
    }
}
