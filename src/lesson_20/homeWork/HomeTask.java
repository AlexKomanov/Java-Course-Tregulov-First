package lesson_20.homeWork;

import java.util.ArrayList;
import java.util.Collections;

public class HomeTask {
    public static ArrayList<String> sortArray(String... strings){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : strings) {
            if (!arrayList.contains(string)){
                arrayList.add(string);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.toString());
        return arrayList;
    }

    public static void main(String[] args) {
        String[] unsortedArray = {"privet", "poka", "ok", "privet", "kak dela", "zdorovie", "ok"};
        HomeTask.sortArray(unsortedArray);
    }
}
