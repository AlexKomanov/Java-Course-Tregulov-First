package lesson_19;

public class VarArgs {

    static void summary(String name, int ... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(name);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        summary("Alex", 2, 4, 6);
    }
}
