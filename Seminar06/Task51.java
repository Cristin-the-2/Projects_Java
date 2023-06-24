package Projects_Java.Seminar06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task51 {
    public static void main(String[] args) {
        // 1. Напишите метод, который заполнит массив из 100 элементов случайными 
        // цифрами от 0 до 50.
        // 2. Создайте метод, в который передайте заполненный выше массив 
        // и с помощью Set вычислите процент уникальных значений в 
        // данном массиве и верните его в виде числа с плавающей запятой.
        // Для вычисления процента используйте формулу:
        // процент уникальных чисел = количество уникальных чисел * 100 
        // / общее количество чисел в массиве.

        ArrayList<Integer> list = getArray();
        System.out.printf("%.2f",getUniquePercent(list));
    }

    public static ArrayList<Integer> getArray() {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i=0; i<99; i++) {
            list1.add(rnd.nextInt(51));
        }
        return list1;
    }

    public static float getUniquePercent(ArrayList<Integer> list) {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list);
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(list.size());
        float percent = ((float)set1.size()*100/(float)list.size());
        return percent;
    }
}
