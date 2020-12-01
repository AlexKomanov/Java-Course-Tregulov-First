package lesson_18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

      int[] array =   {1, 3, 5, 6, -1, 5, 6, -10, -45, 100};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int binarySearch = Arrays.binarySearch(array, 100);
        System.out.println("binarySearch = " + binarySearch);
    }
}
