package Projects_Java.HomeWorkSem03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел.
        // 2) Найти минимальное значение
        // 3) Найти максимальное значение
        // 4) Найти среднее ариф. значение
        // 1) Нужно удалить из него чётные числа
        ArrayList<Integer> ints = GenerateArrayList(10, 1000);
        System.out.println(ints);
        int min = FindMin(ints);
        System.out.printf("Минимальное значение: %d\n", min);
        int max = FindMax(ints);
        System.out.printf("Максимальное значение: %d\n", max);
        double average = Average(ints);
        System.out.printf("Среднее арифметическое: %.2f\n", average);
        ints = DeleteEvenNumber(ints);
        System.out.println(ints);
    }
    public static ArrayList<Integer> GenerateArrayList(int size, int bound) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(bound));
        }
        return list;
    }
    public static Integer FindMin(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());
        return list.get(0);
    }
    public static Integer FindMax(ArrayList<Integer> list) {
        list.sort(Comparator.reverseOrder());
        return list.get(0);
    }
    public static Double Average(ArrayList<Integer> list) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        return average;
    }
    public static ArrayList<Integer> DeleteEvenNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
