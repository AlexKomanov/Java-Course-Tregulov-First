package lesson_20;

import java.util.ArrayList;

public class ArrayListWithoutType {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(5);
        list.add(new StringBuilder("World"));
        System.out.println(list.toString());
    }
}
