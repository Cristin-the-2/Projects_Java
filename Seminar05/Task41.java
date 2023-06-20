package Projects_Java.Seminar05;

import java.util.Map;
import java.util.HashMap;

public class Task41 {
    public static void main(String[] args) {
        // Создать структуру для хранения Номеров паспортов и Фамилий
        // сотрудников организации.
        // 123456 Иванов
        // 321456 Васильев
        // 234561 Петрова
        // 234432 Иванов
        // 654321 Петрова
        // 345678 Иванов
        // Вывести данные по сотрудникам с фамилией Иванов.
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(123456, "Иванов");
        db.putIfAbsent(321456, "Васильев");
        db.putIfAbsent(234561, "Петрова");
        db.putIfAbsent(234432, "Иванов");
        db.putIfAbsent(654321, "Петрова");
        db.putIfAbsent(345678, "Иванов");
        for (var item : db.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.printf("%d\n", item.getKey());
            }
        }
    }
}