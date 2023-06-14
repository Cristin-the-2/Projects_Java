package Projects_Java.Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task22 {
    public static void main(String[] args) {
        // Создать список типа ArrayList. Поместить в него как строки, так
        // и целые числа. Пройти по списку, найти и удалить целые числа.
        ArrayList ls = new ArrayList<>(
                Arrays.asList("земля", 10, 13, 123, "марс", 234, "уран", 567, "земля", 890, "марс"));
        // for (int i = 0; i < ls.size(); i++) {
        // if(ls.get(i) instanceof Integer){
        // ls.remove(i);
        // i--;
        // }
        // }
        Iterator iter = ls.iterator();
        while (iter.hasNext()) {
            if (iter.next() instanceof Integer) {
                iter.remove();
            }
        }
        System.out.println(ls);
    }
}
