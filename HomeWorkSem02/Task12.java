package Projects_Java.HomeWorkSem02;

import java.util.logging.*;

public class Task12 {
    // Реализуйте алгоритм сортировки пузырьком числового массива,
    // результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) {
            int[] array = { 2, 5, 1, -7, 3, 64, 0 };
            System.out.printf("\n Неотсортированный массив: \n");
            System.out.println(printArrayInt(array));
            int[] newArr = listSort(array);
            System.out.printf("\n Отсортированный массив: \n");
            System.out.println(printArrayInt(newArr));
    }

    public static String printArrayInt(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]);
        return sb.toString();
    }

    public static int[] listSort(int[] arr) {
        try {
            Logger logger = Logger.getLogger(Task12.class.getName());
            FileHandler fh = new FileHandler("Projects_Java/HomeWorkSem02/logTask12.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info(printArrayInt(arr));
            logger.info("Start sorting Array");
            for (int k = 0; k < arr.length - 1; k++) {
                for (int i = 0; i < arr.length - k - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        logger.info(printArrayInt(arr));
                    }
                }
            }
            logger.info("Finished sorting Array");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }
        return arr;
    }
}
