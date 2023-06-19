package Projects_Java.Seminar04;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task31 {
    public static void main(String[] args) {
        // Замерить время, за которое в ArrayList добавятся 100_000 элементов
        // Замерить время, за которое в LinkedList добавятся 100_000 элементов
        // Сравнить с предыдущим

        ArrayList<Integer> al = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            al.add(0, 0);
        }
        long timeStop = System.currentTimeMillis();
        long res = timeStop - timeStart;
        System.out.println(res);

        LinkedList<Integer> ll = new LinkedList<>();
        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            ll.add(0, 0);
        }
        long timeStop1 = System.currentTimeMillis();
        long res1 = timeStop1 - timeStart1;
        System.out.println(res1);
    }
}