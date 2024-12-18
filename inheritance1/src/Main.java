public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Diagonal: " + rectangle.getDiagonal());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        //Exercise 3

        Milk milk = new Milk(2.5, "2024-12-31", 1.0);
        Cake cake = new Cake(15.0, "2024-12-25", 0.5);
        Sandwich sandwich = new Sandwich(5.0, "2024-12-20", 20.0);

        Product[] products = {milk, cake, sandwich};
        Store store = new Store(products);

        for (Product product : store.getProducts()) {
            System.out.println("Price: " + product.getPrice() +  ", Expiration: " + product.getExpirationDate());
        }

    }
}
