package lesson_20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("one");
        arr1.add("one");
        arr1.add("two");
        arr1.add("three");
        arr1.add("three");
        arr1.add("three");
        arr1.add("four");
        arr1.add("four");
        arr1.add("five");
        arr1.add("five");
        System.out.println("arr1 = " + arr1.toString());

        List<String> newList = arr1.subList(2, 8);
        System.out.println("newList = " + newList.toString());

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("one");
        arr2.add("three");
        arr2.add("five");
        arr2.add("ten");

        System.out.println("arr1 = " + arr1.toString());

        arr1.removeAll(arr2);

        System.out.println("arr1 = " + arr1.toString());
        boolean containsAll = arr1.containsAll(arr2);
        System.out.println("containsAll = " + containsAll);

        List<Object> list = List.of("Aaaaa", "bbbbb");
        System.out.println("list = " + list);
        List<String> list1 = List.copyOf(arr2);
        System.out.println("list1 = " + list1);

    }
}
