package Projects_Java.Seminar04;

import java.util.LinkedList;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        // Принять от пользователя строку
        // Сохранить строку в связный список
        // Если введено print~num, выводит строку из позиции num в связном списке
        // и удаляет ее из списка
        Scanner sc = new Scanner(System.in, "cp866");
        String choise = "";
        boolean isExit = false;
        LinkedList<String> ll = new LinkedList<>();
        while (!isExit) {
            System.out.print(
                    "Что делаем?\n [a] - Добавить текст\n [p] - Вывести текст на консоль\n [q] - Выйти\n ---> ");
            choise = sc.nextLine();
            switch (choise) {
                case "a":
                    System.out.println("Введи необходимый текст: ");
                    String text = sc.nextLine();
                    ll.add(text);
                    break;
                case "p":
                    System.out.println("Какой номер текста вывести?");
                    int textNumber = Integer.parseInt(sc.nextLine()) - 1;
                    if (textNumber < ll.size()) {
                        System.out.println(ll.remove(textNumber));
                        System.out.println(ll);
                    } else {
                        System.out.println("Текста с таким номером не существует.");
                    }
                    break;
                case "q":
                    isExit = true;
                    break;
                default:
                    System.out.println("Выбирай правильные варианты.");
                    break;
            }
        }
        sc.close();
    }
}
