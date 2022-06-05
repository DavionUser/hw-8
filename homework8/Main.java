package homework8;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape hexagon = new Hexagon();

        circle.print();
        quad.print();
        triangle.print();
        rectangle.print();
        hexagon.print();

    }
}
