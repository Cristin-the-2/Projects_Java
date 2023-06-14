package Projects_Java.Seminar03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        // Заполнить список десятью случайными числами. Отсортировать список 
        // методом sort() и вывести его на экран.
        ArrayList<Integer> ints = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            ints.add(rand.nextInt(1000));
        }
        System.out.println(ints);
        ints.sort(Comparator.naturalOrder());
        System.out.println(ints);
    }
}
