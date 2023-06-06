
public class Task03 {
    // Дан массив nums = [3,2,4,3,1,5,3,3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы
    // в конец массива.
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 4, 3, 1, 5, 3, 3 };
        int val = 3;
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = val;
        }
        for (int num : nums) {
            System.out.printf("%d, ", num);
        }
    }
}
