package Projects_Java.Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task21 {
    // Заполнить список названиями планет Солнечной системы в произвольном
    // порядке с повторениями. Вывести название каждой планеты и количество его
    // повторений в списке.
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>(
                Arrays.asList("земля", "марс", "уран", "земля", "марс", "марс", "уран", "земля", "венера"));
        ArrayList<String> planetName = new ArrayList<String>(
                Arrays.asList("меркурий", "венера", "земля", "марс", "юпитер", "сатурн", "уран", "нептун"));
        int count;

        for (String el : planetName) {
            count = Collections.frequency(planets, el);
            // if (planets.contains(el)) {
            //     for (String planet : planets) {
            //         if (planet == el) count++;
            //     }
            // }
            if (count !=0) {
                System.out.printf("%s: %d\n", el, count);
                // count = 0;
            }
        }
    }
}
