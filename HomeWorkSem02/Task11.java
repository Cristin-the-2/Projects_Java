package Projects_Java.HomeWorkSem02;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task11 {
    // Дана строка sql-запроса "select * from students where ".
    // Сформируйте часть WHERE этого запроса, используя StringBuilder.
    // Данные для фильтрации приведены ниже в виде json-строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Параметры для фильтрации:
    // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    public static void main(String[] args) {
        try {
            String [] lines = ReadLineFromFile("Projects_Java/HomeWorkSem02/dataForTask11.txt");
            System.out.println(lines[0]); 
            StringBuilder resultSelect = LineInLines(lines[0]);
            System.out.println(resultSelect);
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

    public static StringBuilder LineInLines(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        System.out.println(line3);
        StringBuilder result = new StringBuilder("select * from students where ");
        String [] arrayData = line3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(arrData[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }
            
        }
        return result;
    }
}
