package lesson_13;

public class Grade {
    public static void main(String[] args) {

        /**
        * double grade = 7;
        * Incompatible types. Found: 'double', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        */

        int grade = 7;

        switch (grade){
            case 1:
                System.out.println("Grade is 1");
                break;
            case 2:
                System.out.println("Grade is 2");
                break;
            case 3:
                System.out.println("Grade is 3");
                break;
            case 4:
                System.out.println("Grade is 4");
                break;
            case 5:
                System.out.println("Grade is 5");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Grade bigger than 5!");
                break;
            default:
                System.out.println("Wrong grade!");
        }
    }
}
