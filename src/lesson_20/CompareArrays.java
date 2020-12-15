package lesson_20;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {

        System.out.println("----- Arrays.Compare -----");

        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {1, 2, 3, 5};
        int [] array3 = {1, 2, 3, 5};

        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array3, array2));


        char [] charArray1 = {'p', 'r', 'i', 'v'};
        char [] charArray2 = {'p', 'r', 'e', 'v'};
        char [] charArray3 = {'p', 'r', 'e', 'v'};

        System.out.println(Arrays.compare(charArray1, charArray2));
        System.out.println(Arrays.compare(charArray2, charArray1));
        System.out.println(Arrays.compare(charArray2, charArray3));

        System.out.println("----- Arrays.Mismatch -----");

        System.out.println(Arrays.mismatch(array1, array2));
        System.out.println(Arrays.mismatch(array3, array2));

    }
}
