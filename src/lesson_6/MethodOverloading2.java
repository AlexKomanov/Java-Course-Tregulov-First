package lesson_6;

/**
 * @author Alex Komanov
 */
public class MethodOverloading2 {

    int sum(int a1, int a2){
        return a1 + a2;
    }

    String sum(String s1, String s2){
        return s1 + " " + s2;
    }
}

class MethodOverloading2Test{

    public static void main(String[] args) {

    MethodOverloading2 methodOverloading2 = new MethodOverloading2();
        int ints_sum = methodOverloading2.sum(5, 6);
        System.out.println(ints_sum);

        String strings_sum = methodOverloading2.sum("Hello", "There!");
        System.out.println(strings_sum);

    }


}
