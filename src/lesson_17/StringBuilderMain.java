package lesson_17;

public class StringBuilderMain {
    /**
     * @depault_capacity -> 16 chars
     * Mutable -> can be changed
     * StringBuilder sb3 = new StringBuilder(50) -> makes capacity of 50
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);
    }
}
