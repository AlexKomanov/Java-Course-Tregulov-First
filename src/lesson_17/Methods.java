package lesson_17;

public class Methods {
    public static void main(String[] args) {

        /**
         * @possible_methods
         * length()
         * charAt()
         * indexOf()
         * substring()
         * subsequence()
         * append()
         * insert()
         * delete()
         * deleteChatAt()
         * reverse()
         * replace()
         * capacity()
         */

        StringBuilder stringBuilder = new StringBuilder("Good Day!");
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());

        StringBuilder stringBuilder1 = new StringBuilder(50);
        System.out.println("stringBuilder1.length() = " + stringBuilder1.length());
        System.out.println("stringBuilder1.capacity() = " + stringBuilder1.capacity());
        stringBuilder.append(" " +  123123);
        System.out.println("stringBuilder = " + stringBuilder);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println("reverse = " + reverse);


    }
}
