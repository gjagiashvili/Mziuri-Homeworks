public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Everything Everything","Nicola Yoon",900);
        Book myBook2 = new Book("Harry Potter", "J.K Rowling");
        Rectangle myRectangle = new Rectangle(5.0, 5.0);
        Time myTime = new Time(10, 14, 10);


        System.out.println(myBook.title);
        System.out.println(myBook2.title);
        System.out.println();

        myBook.displayBookInfo();
        System.out.println();
        myBook2.displayBookInfo();
        System.out.println();

        System.out.println("პერიმეტრი: " + myRectangle.perimeter());

        myTime.displayTime();

    }
}