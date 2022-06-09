package homework8;

public class PrintShape {
    public static final String DEFAULT_STRING = "Current shape is ";

    public static void print(Shape shape) {
        System.out.println(DEFAULT_STRING + shape.getName());
    }
}
