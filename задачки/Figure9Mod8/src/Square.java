public class Square extends Quadrangle implements Figure {
    public Square(int a, String color) {  // b = a
        super(a, a, color);
    }

    @Override
    public double area() {
        return a * b;  // search area (formula S = a * b)
    }

    public double perimeter() {
        return 2 * a + 2 * b;  // search perimeter
    }

    @Override
    public double getLargeDiagonal() {
        return a * Math.sqrt(2);   // diagonals is square are equals a * sqrt(2)
    }

    @Override
    public double getHeight() {
        return a;                        // height is square is a
    }

    public String getColor() {
        return color;            // getter
    }
}
