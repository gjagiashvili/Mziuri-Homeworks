public class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return "Shape";
    }

    public double calculatePerimeter() {
        return 0;
    }

    public void printDetails() {
        System.out.println("ფიგურაა " + getName() + ", პრეიმეტრია " + calculatePerimeter());
    }
}
