package lesson_19;

public class ForEachStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("Hello");

        StringBuilder[] stringBuilders = {sb1, sb3, sb2};

        for (StringBuilder stringBuilder : stringBuilders) {
            stringBuilder = new StringBuilder("Bye!");
        }

        for (int i = 0; i < stringBuilders.length; i++) {
            System.out.print(stringBuilders[i] + " ");

        }
        System.out.println();
        for (StringBuilder stringBuilder : stringBuilders) {
            stringBuilder.append(" Java!");
        }

        for (int i = 0; i < stringBuilders.length; i++) {
            System.out.print(stringBuilders[i] + " ");

        }

    }
}
