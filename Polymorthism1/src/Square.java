public class Square extends RegularShape {

    public Square(double sideLength) {
        super(4, sideLength);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * getSideLength();
    }
}
