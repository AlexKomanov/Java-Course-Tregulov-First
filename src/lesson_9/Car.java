package lesson_9;

/**
 * @author Alex Komanov
 */
public class Car {

    /**
     * @Local_Variable = Defined and then seen in the method. Doesn't have access modifier.
     * @Parameter = Defined and seen in full method range.
     * @Instace_Variable = Belongs to the object.
     * @Static_Variable = Belongs to the whole class.
     * @this = Can't be used with Static variables. => static int a = this.b.
     * @this = Can't be used un the Static methods.
     */

    private String color;
    private String engine;
    static int count;

    public Car(String color, String engine) {
        this.count++;
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        System.out.println("Car color: " + color);
        return color;
    }

    public void setColor(String color) {
        System.out.println("Car color was changed.");
        int price = 5000;
        this.color = color;
        price += 1000;
        int x;
        // int y = x + 10; <- Local variable x has not a default definition. Should be defined.
    }
}
