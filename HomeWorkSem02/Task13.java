package Projects_Java.HomeWorkSem02;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task13 {
    // Дана json-строка (можно сохранить в файл и читать из файла)
    // [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
    // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
    // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    // Написать метод(ы), который распарсит json и, используя StringBuilder, 
    // создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
    // Пример вывода:
    // Студент Иванов получил 5 по предмету Математика.
    // Студент Петрова получил 4 по предмету Информатика.
    // Студент Краснов получил 5 по предмету Физика.
    public static void main(String[] args) {
        try {
            String [] lines = ReadLineFromFile("Projects_Java/HomeWorkSem02/dataForTask13.txt");
            for (int i = 0; i < lines.length; i++) {
                System.out.println(PrintLine(lines[i]));
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }
    }
    public static String [] ReadLineFromFile(String filePath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
            }
        br.close();
        String [] listData = new String [size];
        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(filePath));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
            }
        br1.close();
        return listData;
    }

    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder();
        String [] arrayData = line5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
            result.append(".");
            }
        return result;
    }
}
