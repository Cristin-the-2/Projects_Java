

import java.io.FileWriter;

public class Task13 {
    public static void main(String[] args) {
        // Записать в файл 10 раз слово TEST
        int n = 10;
        String text = "TEST";
        try {
            FileWriter file = new FileWriter("Projects_Java/Seminar02/test.txt", true);
            for (int i = 0; i < n; i++) {
                file.write(text);
                file.write("\n");
            }
            file.close();
            System.out.println("Получилось!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
