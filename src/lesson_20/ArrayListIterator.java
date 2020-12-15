package lesson_20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Alex");
        arrayList.add(2, "Mr");
        System.out.println(arrayList.toString());

        System.out.println("------------------");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println("\n------------------");

        Iterator<String> stringIterator = arrayList.iterator();
        while (stringIterator.hasNext()){

            System.out.print(stringIterator.next() + " ");
        }
    }
}
