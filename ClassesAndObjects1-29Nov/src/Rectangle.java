public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //პერიმეტრის გამოთვლა
    double perimeter() {
        return 2*(length + width);
    }

    //ფართობი
    double area() {
        return length * width;
    }

    //დიაგონალი
    double diagonal() {
        return Math.sqrt(length * length + width * width);
    }

    //კვადრატი
    boolean isSquare() {
        return length == width;
    }
}
