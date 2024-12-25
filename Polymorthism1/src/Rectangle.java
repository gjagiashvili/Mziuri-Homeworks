public  class Rectangle extends Shape {
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public String getName() {
        return "ოთხკუთხედი/Rectangle";
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getX() + getY());
    }
}
