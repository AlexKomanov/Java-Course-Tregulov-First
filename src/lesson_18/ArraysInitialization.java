package lesson_18;

public class ArraysInitialization {
    public static void main(String[] args) {

        int[] array3 = {1, 2, 4};

        String[] array1 = new String[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = "hello_" + i;
            System.out.println(array1[i]);
        }

        int[][] array2 = new int[4][];

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];
        array2[3] = new int[6];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i+j;
                System.out.print(array2[i][j] + " ");
            }
        }
    }
}
