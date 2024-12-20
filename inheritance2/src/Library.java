public class Library {

    private String name;
    private BookCleaner cleaner;
    private BookLender lender;
    private SilenceController controller;
    private BookAdvisor advisor;

    private Book book1;
    private Book book2;
    private Book book3;

    public Library(String name, BookCleaner cleaner, BookLender lender, SilenceController controller, BookAdvisor advisor, Book book1, Book book2, Book book3) {
        this.name = name;
        this.cleaner = cleaner;
        this.lender = lender;
        this.controller = controller;
        this.advisor = advisor;
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
    }

    @Override
    public String toString() {
        return "ბიბლიოთეკის სახელი: " + name + " თანამშრომლები: " + cleaner +  lender + controller + advisor + " წიგნები: " + book1 + book2 + book3;
    }
}
