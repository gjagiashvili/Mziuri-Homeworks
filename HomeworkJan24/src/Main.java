public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("ნიკოლა", "იუნი");
        Author author2 = new Author("ჯორჯ", "ორუელი");
        Book[] books = {
                new Book("ყველაფერი, ყველაფერი", 322, "რომანტიკა", author1),
                new Book("ცხოველების ფერმა", 932, "პოლიტიკა", author2)
        };
        for (Book book : books) {
            System.out.println(book);
        }
        Fraction[] fractions = {
                new Fraction(3, 6),
                new Fraction(5, 10),
                new Fraction(3, 7)
        };


        for (int i = 0; i < fractions.length; i++) {
            System.out.println("წილადი " + (i + 1) + ": " + fractions[i]);
        }
        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2), //ტოლფასი1
                new QuadraticEquation(1, -3, 2), //ტოლფასი2
                new QuadraticEquation(1, -2, 1),
                new QuadraticEquation(1, 0, -4),
                new QuadraticEquation(1, 1, 1) //არ აქვს ამონახსნი
        };

        for (int i = 0; i < equations.length; i++) {
            System.out.println("განტოლება " + (i + 1) + ": " + equations[i]);
        }
        System.out.println("ტოლფასი განტოლებების რაოდენობა: " + QuadraticEquation.countEquivalentEquations(equations));
    }
}
