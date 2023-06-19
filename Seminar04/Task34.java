package Projects_Java.Seminar04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Task34 {
    public static void main(String[] args) {
        // Написать метод, который принимает массив элементов, помещает их в стэк
        // и выводит на консоль содержимое стэка.
        int[] nums = new int[10];
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
            System.out.printf("%d, ", nums[i]);
        }
        System.out.println();
        System.out.println(FillSteck(nums));
        System.out.println(FillQueue(nums));
    }

    public static Stack<Integer> FillSteck(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (Integer num : arr) {
            stack.push(num);
        }
        return stack;
    }

    public static Queue<Integer> FillQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer num : arr) {
            queue.add(num);
        }
        return queue;
    }
}
