
public class Task02 {
    // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
    // количество подряд идущих 1.
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int max_1 = 0;
        int gl_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (max_1 > gl_max) {
                    gl_max = max_1;
                }
                max_1 = 0;
            } else {
                max_1++;
            }
        }
        if (max_1 > gl_max) {
            gl_max = max_1;
        }
        System.out.println(gl_max);
    }
}