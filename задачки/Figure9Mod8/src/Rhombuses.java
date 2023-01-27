public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;  // left bottom angle
        this.beta = beta;  // left upper angle
    }

    @Override
    public double area() {
        return b * getHeight();    // area is a * h, we found h: a * alpha
    }

    public double perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getLargeDiagonal() {
        double d1 = a * Math.sqrt(2-2*Math.cos(Math.toRadians(beta)));
        double d2 = a * Math.sqrt(2-2*Math.cos(Math.toRadians(alpha)));
        return Math.max(d1, d2);
    }

    @Override
    public double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));  // search heigth using sin
    }

    @Override
    public String getColor() {
        return color;  // getter
    }
}
