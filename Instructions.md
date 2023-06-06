# Основы языка Java

## Сниппеты для начала
- class - для создания класса
- main - для содания основного метода
- sysout - для выведения в консоль
- // - комментирование

## Типы данных
- ссылочные
    - массивы 
- примитивные
    - boolean
    - int
    - short
    - long
    - float - заканчивать буквой "f" 
    float f = 123.45f;
    - double
    - char

## Создание переменной

<тип><идентификатор>;

<идентификатор>=<значение>;

## Неявная типизация

var - тип для неявной типизации

## Классы-обертки

Используется для доступа к функционалу класса (смена типа, получение информации о типе).

| Примитив | Обертка |
|----------|---------|
| int | Integer |
| short | Short |
| long | Long |
| byte | Byte |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

## Работа со строкой
- .length() - длина строки
- .charAt() - обращение к символу строки

## Операции Java
- = - присваивание
- *, /, +, -, %, ++, -- - арифметические
    - инкременты бывают постфиксные (i++) и префиксные (++i) 
    - префиксные имеют более высокий приоритет
- <, >, ==, !=, >=, <= - сравнение
- ||, &&, ^, ! - логические
- <<, >>, &, |, ^ - побитовые
    - побитовые сдвиги
        - int a = 18; // 10010
        - a = a >> 1; // 1001 a = 9
        - int a = 8; // 1000
        - a = a << 1; // 10000 a = 16
    - побитовые операции
        - int a = 5; // 101
        - int b = 2; // 010
        - a | b; // 111

## Массивы
- int[] arr = new int[10]; - создание пустог одномерного массива с определенной длиной
- int[] arr = new int[] {1, 2, 3}; - создание заполненного одномерного массива
- arr.length()
- int[][] arr = new int[3][5];
- int[] arr[] = new int[3][5];

## Преобразования

- можно с простыми типами даных:
    - int -> double:
        
        double = int
    - double -> int:
        
        int = int(double)
    - string (величина до 255) -> byte:
        
        byte = Byte.parseByte(string)
- со ссылочными типами так просто не получится

## Получение из консоли

        import lava.util.Scanner;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();

        int x = iScanner.nextInt();

        double y = iScanner.nextDouble();

        iScanner.next() - считывает 1 элемент;
        iScanner.nextInt() - считывает только число;
        iScanner.nextLine() - считывает строчку.

## Форматы вывода

        System.out.print(c); - вывод на одной строке
        System.out.println(c); - вывод и переход на следующую строку
        System.out.printf("%d + %d = %d \n", a, b, c); - вывод форматированной строки

- %d - маска, куда подставлять переменную
- \n - вывод на новую строку

        String res = String.format("%d + %d = %d \n", a, b, c); - запись форматированной строки

**Виды масок:**
- %d: целочисленных значений
- %x: для вывода шестнадцатеричных чисел
- %f: для вывода чисел с плавающей точкой
- %e: для вывода чисел в экспоненциальной форме,
например, 3.1415e+01
- %c: для вывода одиночного символа
- %s: для вывода строковых значений

**Количество знаков после запятой**
        
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00

## Область видимости переменных

**Внутри фигурных скобок область видимости**
- Снаружи -> внутрь - все видно
- Изнутри -> наружу - не видно

## Функции и методы
Функции и методы — это технически одно и то же. Функции могут
не принадлежать классам, а методы принадлежат.

В java все функции являются методами.
- Описание
- Вызов
- Возвращаемое значение
- Рекурсия

        public class Program {
        static void sayHi() {
        System.out.println("hi!");
        }}

## Управляющие конструкции
- ветвление if

        if (a > b) {
        c = a;
        } else {
        c = b;
        }
- короткая запись if

        if (a > b) c = a;
        if (b > a) c = b; 
- тернарный оператор

        int min = a < b ? a : b;
- оператор выбора

        switch (mounth) {
            case 1:
            case 2:
            case 3:
            text = "Autumn";
            break;
            ...
            default:
            text = "mistake";
            break;
        }
- цикл while

        while (value != 0) {
            value /= 10;
            count++;
        }
- цикл do while

        do {
            value /= 10;
            count++;
        } while (value != 0);
Операторы для управления циклами — continue и break.

- Выполнение следующей итерации цикла — continue.
- Прерывание текущей итерации цикла — break.
- цикл for

        for (int i = 1; i <= 10; i++) {
            s += i;
        }
- for :

Работает только для коллекций

        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }

## Работа с файлами
- создание и запись\дозапись файла

        import java.io.FileWriter;
        import java.io.IOException;
        
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
- чтение, вариант посимвольно

        import java.io.*;
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
- вариант построчно

        import java.io.*;
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();