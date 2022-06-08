package homework8;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape hexagon = new Hexagon();

        System.out.println(circle.DEFAULT_STRING + PrintShape.print(circle));
        System.out.println(quad.DEFAULT_STRING + PrintShape.print(quad));
        System.out.println(triangle.DEFAULT_STRING + PrintShape.print(triangle));
        System.out.println(rectangle.DEFAULT_STRING + PrintShape.print(rectangle));
        System.out.println(hexagon.DEFAULT_STRING + PrintShape.print(hexagon));
    }
}
