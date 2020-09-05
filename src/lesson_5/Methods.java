package lesson_5;

import lesson_4.Test1;

/**
 * @author Alex Komanov
 */
public class Methods {

    int summary(int a, int b, int c){
        int result = a + b + c;
        return result;
    }

    double average(int a1, int a2, int a3){
        return summary(a1, a2, a3) / 3.0;
    }

    }

class MethodExecution {
    public static void main(String[] args) {

        Methods methods = new Methods();
        int summary = methods.summary(1, 2, 3);
        System.out.println(summary);
        System.out.println(methods.summary(5, 15, 25));

        System.out.println(methods.average(3, 7, 4));
    }

}


