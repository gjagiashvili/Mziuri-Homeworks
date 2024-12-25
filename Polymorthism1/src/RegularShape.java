public class RegularShape {
    private int sides;
    private double sideLength;

    public RegularShape(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double calculatePerimeter() {
        return sides * sideLength;
    }

    public int getSides() {
        return sides;
    }

    public double getSideLength() {
        return sideLength;
    }
}
