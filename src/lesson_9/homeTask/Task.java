package lesson_9.homeTask;

/**
 * @author Alex Komanov
 */
public class Task {

    public static void createTwoObjects(){
        String string1 = new String("ABC");
        String string2 = new String("ABC");
    }
}

class TaskMain{

    public static void main(String[] args) {
    Task task = new Task();
    Task.createTwoObjects();
    Task.createTwoObjects();
    Task task2 = new Task();
    Task.createTwoObjects(); // <- This method creates two objects. After method was completed -> The objects ended their life cycle.
    }
}
