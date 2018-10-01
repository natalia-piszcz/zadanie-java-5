public class Test {
    public static void main(String[] args) {
        Square square = new Square(2.0);
        System.out.println(square.squareArea(square));

        Circle circle = new Circle(3.7);
        System.out.println(circle.circleArea(circle));

        Triangle triangle = new Triangle(6.0, 4, 0, 3);
        System.out.println(triangle.trianglePerimeter(triangle));

        Rectangle rectangle = new Rectangle(4.0, 8.5);
        System.out.println(rectangle.rectanglePerimeter(rectangle));


    }
}

