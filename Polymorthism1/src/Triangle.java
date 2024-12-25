public class Triangle extends RegularShape {
    public Triangle(double sideLength) {
        super(3, sideLength);
    }

    @Override
    public double calculatePerimeter() {
        return 3 * getSideLength();
    }
}
