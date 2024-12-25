public class Triangle2 extends Shape {
    private double z;

    public Triangle2(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String getName() {
        return "სამკუთხედი/Triangle (სავ. 2)";
    }

    @Override
    public double calculatePerimeter() {
        return getX() + getY() + z;
    }
}
