package lesson_16;

public class FourLines {
    public static void main(String[] args) {

        String s1 = "Contrary to popular belief, Lorem ipsum is not simply random text. " +
                "It has roots in a piece of. Classical latin literature from." +
                "The standard chunk of lorem, Ipsum used since the. Is reproduced below for those interested.";
        String s2 = s1.toUpperCase();

        char c1;
        char c2;

        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);

            if (c1 != ',' && c1 != '.' && c1 != ' ' && c1 == c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println("\n-------------------------");
    }
}
