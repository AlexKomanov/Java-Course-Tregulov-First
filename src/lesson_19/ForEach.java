package lesson_19;

public class ForEach {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {8, 9}, {11, 22, 44, 55}};
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        String[] names = {"Alex", "Sasha", "Ted"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
