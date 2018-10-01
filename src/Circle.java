public class Circle {
    double radius;

    Circle(double redius) {
        this.radius = redius;
    }

    double circleArea(Circle circle) {
        return circle.radius * circle.radius * 3.14;
    }
}
