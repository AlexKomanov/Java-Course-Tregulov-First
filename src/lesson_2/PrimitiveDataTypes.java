package lesson_2;

/**
 * @author Alex Komanov
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {

        /**
         *
         * @byte: [-128 ; 127] -> 8 bit
         * @short: [-32768 ; 32767] -> 16 bit
         * @int: [-2147483648 ; 2147483647] -> 32 bit
         * @long: [-9223372036854775808 ; 9223372036854775807] ->  64 bit
         * @float: [3.4e-38 ; 3.4e+38] ->  32 bit
         * @double: [1.7e-308 ; 1.7e+308] -> 64 bit
         * @char: [0 ; 65535] -> 16 bit
         * @boolean: {true, false}
         *
         */

        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = 1000; Incompatible types

        short s1 = 2500;

        int in1 = 5000;

        long l1 = 100000000000L;

        float f1 = 3.1f;

        float f2 = 20;

        double d1 = 34.56;

        char ch1 = 'a';
        char ch2 = 'A';
        char ch3 = '7';
        char ch4 = 300; // Decimal
        char ch5 = '\uE1EF'; // Hexadecimal

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("Byte: " + b1);
        System.out.println("Byte: " + b2);
        System.out.println("Short: " + s1);
        System.out.println("Integer: " + in1);
        System.out.println("Long: " + l1);
        System.out.println("Float: " + f1);
        System.out.println("Float: " + f2);
        System.out.println("Double: " + d1);
        System.out.println("Char: " + ch1);
        System.out.println("Char: " + ch2);
        System.out.println("Char: " + ch3);
        System.out.println("Char: " + ch4);
        System.out.println("Char: " + ch5);
        System.out.println("Boolean: " + bool1);
        System.out.println("Boolean: " + bool2);

        int integer = 60;
        int binaryInteger = 0B111100;
        int octInteger = 074;
        int hexInteger = 0x3C;

        long long_underscore = 1_000_000_000_000_000L;

        System.out.println("Regular integer = " + integer);
        System.out.println("Binary integer = " + binaryInteger);
        System.out.println("Octal integer = " + octInteger);
        System.out.println("Hex integer = " + hexInteger);
        System.out.println("Long_Under_Score: " + long_underscore);
    }
}
