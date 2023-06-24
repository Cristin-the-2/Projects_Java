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

## Коллекции

1. ArrayList
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        
        add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        get(pos) – возвращает элемент из списка по указанной позиции
        indexOf(item) – первое вхождение или -1
        lastIndexOf(item) – последнее вхождение или -1
        remove(pos) – удаление элемента на указанной позиции и его возвращение
        set(int pos, T item) – помещает значение item элементу, который находится
        на позиции pos
        void sort(Comparator) – сортирует набор данных по правилу
        subList(int start, int end) – получение набора данных от позиции start до end

2. StringBuilder
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year };

        clear() – очистка списка
        toString() – «конвертация» списка в строку
        Arrays.asList – преобразует массив в список
        containsAll(col) – проверяет включение всех элементов из col
        removeAll(col) – удаляет элементы, имеющиеся в col
        retainAll(col) – оставляет элементы, имеющиеся в col
        toArray() – конвертация списка в массив Object’ов
        toArray(type array) – конвертация списка в массив type
        List.copyOf(col) – возвращает копию списка на основе имеющегося
        List.of(item1, item2,...) – возвращает неизменяемый список

3. LinkedList - двусвязный список (хранит инфо, где следующий и предыдущий элеметы)
4. Queue
        Queue<Integer> queue = new LinkedList<Integer>();

5. PriorityQueue - приоритет имеет наименьший элемент в очереди
6. Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); 
        deque.addLast(2);
        deque.removeLast();
        deque.offerFirst(1); 
        deque.offerLast(2);
        deque.pollFirst(); 
        deque.pollLast();
        deque.getFirst(); 
        deque.getLast();
        deque.peekFirst(); 
        deque.peekLast();

7. Stack - first in, last out
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.pop();

8. HashMap
        Map<Integer, String> db = new HashMap<>();
        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        putIfAbsent(K,V) – произвести добавление если ключ не найден.
        get(K) - получение значения по указанному ключу.
        remove(K) – удаляет пару по указанному ключу.
        containsValue(V) – проверка наличия значения.
        containsKey(V) – проверка наличия ключа.
        keySet() – возвращает множество ключей.
        values() – возвращает набор значений.
        entrySet() - можно гулять по множеству с помощью for.
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(9);
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f);

9. TreeMap - упорядочивание по ключу
        TreeMap<Integer,String> tMap = new TreeMap<>();
        put(K,V) 
        get(K) 
        remove(K)
        descendingMap() - показать в обратном порядке
        tailMap() - показать больше чем
        headMap() - показать меньше чем
        lastEntry() 
        firstEntry()
        descendingKeySet(V) - получить множество ключей

10. LinkedHashMap - старший брат HashMap помнит порядок добавления элементов ➜ более медлительный
        Map<Integer,String> linkmap = new LinkedHashMap<>();

11. HashTable - устаревший брат HashMap не знает про null
        Map<Integer,String> table = new Hashtable<>();

12. HashSet
        Set<Integer> set = new HashSet<>();
        isEmpty() – проверка на пустоту.
        add(V) – добавление элемента в коллекцию.
        remove(V) – удаление элемента из коллекцию.
        contains(V) – проверка на включение элемента в коллекции.
        clear() – удаление всех элементов коллекции.
        size() – возвращает количество элементов коллекции.
        addAll(Coll) – объединение множеств.
        retainAll(Coll) – пересечение множеств.
        removeAll(Coll) – разность множеств.
        first()
        last()
        headSet(E) 
        tailSet(E)
        subSet(E1, E2)

13. TreeSet - в основе HashMap, упорядочен по возрастанию, null’ов быть не может.
        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));

14. LinkedHashSet - в основе HashMap, помнит порядок.
        var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        isEmpty() – проверка на пустоту.
        add(V) – добавление элемента в коллекцию.
        remove(V) – удаление элемента из коллекцию.
        contains(V) – проверка на включение элемента в коллекции.
        clear() – удаление всех элементов коллекции.
        size() – возвращает количество элементов коллекции.