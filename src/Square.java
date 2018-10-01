public class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double squareArea(Square square) {
        return square.side * square.side;
    }

}
