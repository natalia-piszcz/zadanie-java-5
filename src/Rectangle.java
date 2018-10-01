public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double rectanglePerimeter(Rectangle rectangle) {
        return rectangle.sideA * 2 + rectangle.sideB * 2;
    }

}
