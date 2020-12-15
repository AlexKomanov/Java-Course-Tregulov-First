package lesson_20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        /**
         * @includes: ArrayList includes simple arrays with "Object" type.
         * @params: ArrayList can include every element of 'Object' type.
         * @capacity: Default capacity of each array - 10 (can be changed).
         * @methods:
         * add() -> boolean
         * get() -> DataType of ArrayList
         * set() -> DataType of ArrayList
         * remove() -> DataType / boolean
         * addAll() -> boolean
         * clear() -> void
         * indexOf() -> int
         * lastIndexOf() -> int
         * size() -> int
         * isEmpty() -> boolean
         * contains() -> boolean
         * toString() -> String
         * clone() -> Object
         * toArray() -> DataType[] / Object[]
         * Arrays.asList(DataType[]) -> List<DataType>
         * Collections.sort(ArrayList<DataType>) -> void
         * equals(ArrayList<DataType>) -> boolean
         * removeAll(Collection <?>c) -> boolean
         * retainAll(Collection <?>c) -> boolean
         * containsAll(Collection <?>c) -> boolean
         * subList(int fromIndex, int toIndex) -> List<E>
         * toArray() -> Object[]
         * toArray(T [] a) -> T[]
         *
         *  List.of(E ... elements) -> List<E> (since java 9)  -> Immutable
         *  List.copyOf(Collection <E> c) -> List<E> (since java 10) -> Immutable
         *
         */

        List<String> list = new ArrayList<>();

        //Default capacity changed to 15
        ArrayList<Integer> arrayList = new ArrayList<>(15);

        ArrayList<Integer> integerArrayList = new ArrayList<>(arrayList);
        integerArrayList.addAll(arrayList);
        System.out.println(arrayList == integerArrayList);
        System.out.println(arrayList.toString());


    }
}
