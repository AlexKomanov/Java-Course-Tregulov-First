package lesson_18;

public class SortArray {

    public static int[] sortArray(int[] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            if (i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }

        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2, -5, 0, -20, 5, 8, -25};
        printArray(array);
        sortArray(array);
        printArray(array);

    }
}
