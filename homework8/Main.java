package homework8;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape hexagon = new Hexagon();

        System.out.println(PrintShape.print(circle));
        System.out.println(PrintShape.print(quad));
        System.out.println(PrintShape.print(triangle));
        System.out.println(PrintShape.print(rectangle));
        System.out.println(PrintShape.print(hexagon));

    }
}
