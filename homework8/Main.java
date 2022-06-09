package homework8;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape hexagon = new Hexagon();

        PrintShape.print(circle);
        PrintShape.print(quad);
        PrintShape.print(triangle);
        PrintShape.print(rectangle);
        PrintShape.print(hexagon);


    }
}
