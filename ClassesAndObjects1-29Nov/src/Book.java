public class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    void displayBookInfo() {
        System.out.println("სახელწოდება: " + title);
        System.out.println("ავტორი: " + author);
        System.out.println("გვერდები: " + pages);
    }
}
