public class Triangle {
    double sideA;
    double sideB;
    double base;
    double height;

    Triangle(double sideA, double sideB, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
    }


    double trianglePerimeter(Triangle triangle) {
        return triangle.sideA + triangle.sideB + triangle.base + triangle.height;
    }

}
